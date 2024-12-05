import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class PhrasalTree {
    Node root;
    public PhrasalTree(String word){
        root = new Node(null, word);
    }

    Queue<String> search = new LinkedList<>();


    public class Node {
        String word;
        Node parent;
        HashMap<String,Node> children;

        public Node(Node parent, String word) {
            this.parent = parent;
            this.word = word;
        }

        public Node findChild(String key){
            return children.get(key);
        }


        private int addChild(String word){
          if( !children.containsKey(word)) {
              children.put(word, new Node(this, word));
              return 1;
          }
          return 0;
        }




    }

}

