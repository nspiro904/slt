import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.POSTaggerAnnotator;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.simple.*;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CoreTagger {

    public static void main(String[] args){
        tag("data/testSentence.txt");
    }

    public static void tag(String filePath){
        try {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/out.slt"));
            StringBuilder input = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                input.append(line);
            }

            StanfordCoreNLP pipeline = new StanfordCoreNLP("spanish");
            pipeline.addAnnotator(new POSTaggerAnnotator(new MaxentTagger("data/spanish-ud.tagger")));
            CoreDocument doc = pipeline.processToCoreDocument(input.toString());
            pipeline.annotate(doc);

            for (CoreLabel tok : doc.tokens()) {

                writer.write(tok.word() + "{" + tok.tag() + "}");

                if(tok.word().equals(".")) writer.write("\n");
                else writer.write(" ");
            }
            reader.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
