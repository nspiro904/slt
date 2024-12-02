import java.util.HashMap;
import java.util.Stack;

public class PhrasalTree {

    Stack<String> search = new Stack<>();

    public class Node {

        String word;
        Node parent;
        HashMap<String,Node> children;

        public Node(Node parent, String word) {
            this.parent = parent;
            this.word = word;
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

