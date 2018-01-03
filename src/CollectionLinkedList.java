import java.util.*;

public class CollectionLinkedList {

    public static void main(String args[]) {

        LinkedList<String> linked_list = new LinkedList<String>();

        linked_list.add("node1");
        linked_list.add("node2");

        linked_list.addFirst("node3");
        linked_list.addLast("node4");

        linked_list.add(0,"node0");

        System.out.println(linked_list);

        System.out.println(linked_list.contains("node7"));

    }
}
