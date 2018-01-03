import java.util.ArrayList;

public class Node {

    String contents;
    ArrayList<Node> children;

    public Node(String c) {
        this.contents = c;
        this.children = new ArrayList<Node>();
    }

}


