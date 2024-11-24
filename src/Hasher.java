import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hasher {

    public static HashMap<String, String> load(String category) {

        HashMap<String, String> map = null;

        try {
            FileInputStream inputStream = new FileInputStream("data/maps/" + category + ".ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            map = (HashMap) objectInputStream.readObject();

            inputStream.close();
            objectInputStream.close();

        } catch (Exception e) {
            System.out.println("Error loading hash map '" + category + "'");
            e.printStackTrace();
        }

        if(map == null) System.out.println("HashMap load returned null");

        return map;
    }

    public static void hash(String category) throws Exception {

        HashMap<String, String> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("data/lexicon/" + category + ".csv" ));

        String line = null;

        while( (line = reader.readLine()) != null) {
            String[] split = line.split(",");
            map.put(split[0], split[1]);
        }

        FileOutputStream fileOut = new FileOutputStream("data/maps/" + category + ".ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(map);

        out.close();
        fileOut.close();
        reader.close();
        
    }
}
