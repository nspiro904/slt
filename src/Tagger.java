import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class Tagger {

    HashMap<String,String> adjetivos;
    HashMap<String,String> verbos;
    HashMap<String,String> adverbios;
    HashMap<String,String> sustantivos;

    String filePath;

    public Tagger(String filePath) {
        this.filePath = filePath;

        adjetivos = Hasher.load("adjetivos");
        verbos = Hasher.load("verbos");
        adverbios = Hasher.load("adverbios");
        sustantivos = Hasher.load("sustantivos");
    }

    /* pass 1 will tag the words/structures that have small tables such as
        prepositions or connectors.
        pass 2 will tag the words like nouns or verbs that are a large category
    */
    public void tag() {
        tagP1();
        tagP2();
    }

    private void tagP1(){

    }
    private void tagP2(){

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/out.slt"));

            String line;
            String[] split;
            String word;

            while ( (line = reader.readLine()) != null) {

                split = line.split(" ");

                for ( int i = 0; i < split.length; ++i) {

                    word = processWord(split[i]);
                    writer.write(word + " ");

                }

                writer.newLine();
            }

            reader.close();
            writer.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    //this implementation will not process phrasal structures
    private String processWord(String word) {

        String[] wordSplit = trimPunctuation(word);

        if ( adjetivos.get(wordSplit[0]) != null) wordSplit[0] = wordSplit[0].concat("@@");
        else if (adverbios.get(wordSplit[0]) != null) wordSplit[0] = wordSplit[0].concat("##");
        else if (verbos.get(wordSplit[0]) != null) wordSplit[0] = wordSplit[0].concat("$$");
        else if (sustantivos.get(wordSplit[0]) != null) wordSplit[0] = wordSplit[0].concat("%%");

        return wordSplit[0] + wordSplit[1]; //adds back punctuation
    }

    //0 = substring, 1 = punctuation
    private String[] trimPunctuation(String word) {

        int j = word.length() - 1;

        for(; j >= 0; --j) {
            if( Character.isLetter(word.charAt(j)) ) break;
        }

        return new String[] {word.substring(0,j + 1), word.substring(j+1)};
    }
}
