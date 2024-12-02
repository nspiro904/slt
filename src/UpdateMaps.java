import java.io.File;

public class UpdateMaps {

    public static void main(String[] args){

        try {
            File[] files =  new File("data/lexicon").listFiles();

            for(int i = 0; i < files.length; ++i){
                String file = files[i].toString();
                String[] slash = file.split("/");
                String[] dot = slash[2].split("\\.");
                String category = dot[0];

                System.out.println("Hashing " + category);
                Hasher.hash(category);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
