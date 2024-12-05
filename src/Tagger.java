import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

/*  This is my crude implementation of the POS Tagger before
    learning of the corenlp library. I am leaving this in here
    to reflect the amount of work I had spent making this even
    though it is now irrelevant. I would also like to note that
    I did not know a POS tagger was already a thing before making this
    and I actually also called mine a tagger by coincidence.

    I had plans in mind for a much more robust tagger however
    due to a rapidly approaching due date I made compromises to my design,
    such as including multiple tags on single words.
 */
public class Tagger {

    HashMap<String,String> adjetivos;
    HashMap<String,String> verbos;
    HashMap<String,String> adverbios;
    HashMap<String,String> sustantivos;
    HashMap<String,String> preposiciones;
    HashMap<String,String> pronombres;
    HashMap<String,String> pronombresIndefinidos;
    HashMap<String,String> pronombresPosesivos;
    HashMap<String,String> articulos;
    HashMap<String,String> conjunciones;



    String filePath;

    public Tagger(String filePath) {
        this.filePath = filePath;

        adjetivos = Hasher.load("adjetivos");
        verbos = Hasher.load("verbos");
        adverbios = Hasher.load("adverbios");
        sustantivos = Hasher.load("sustantivos");
        preposiciones = Hasher.load("preposiciones");
        pronombres = Hasher.load("pronombres");
        pronombresIndefinidos = Hasher.load("pronombresIndefinidos");
        pronombresPosesivos = Hasher.load("pronombresPosesivos");
        articulos = Hasher.load("articulos");
        conjunciones = Hasher.load("conjunciones");
    }

    public void tag() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/out.slt"));

            String line;
            String[] lineSplit;
            String processedWord;

            while ((line = reader.readLine()) != null) {

                lineSplit = line.split(" ");

                for (String word : lineSplit) {
                    processedWord = processWord(word);
                    writer.write(processedWord + " ");
                }

                writer.write("\n");
            }

            reader.close();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //this implementation will not process phrasal structures
    private String processWord(String w) {

        String[] word = trimPunctuation(w);
        ArrayList<String> categories = new ArrayList<>();

        String wordLC = word[0].toLowerCase();

        if (adjetivos.containsKey(wordLC)) categories.add("adj");
        if (verbos.containsKey(wordLC)) categories.add("v");
        if (adverbios.containsKey(wordLC)) categories.add("adv");
        if (sustantivos.containsKey(wordLC)) categories.add("s");
        if (preposiciones.containsKey(wordLC)) categories.add("p");
        if (pronombres.containsKey(wordLC)) categories.add("pro");
        if (pronombresIndefinidos.containsKey(wordLC)) categories.add("proi");
        if (pronombresPosesivos.containsKey(wordLC)) categories.add("prop");
        if (articulos.containsKey(wordLC)) categories.add("art");
        if (conjunciones.containsKey(wordLC)) categories.add("c");

        String categoriesString = String.join(";", categories);

        return word[0] + "{" + categoriesString + "}" + word[1];
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
