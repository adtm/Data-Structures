package week5.node.first;

public class Main {
  public static void main(String[] args) {

    Node node1 = new Node(1, null);
    Node node2 = new Node(2, null);
    Node node3 = new Node(3, null);

    node1.next = node2;
    node2.next = node3;
    node3.next = null;

    printList(node1);
  }

  public static void printList(Node list) {

//    Node node = list;
//    while (node != null) {
//      System.out.println(node);
//      node = node.next;
//    }

    for (Node node = list; node != null; node = node.next) {
      System.out.println(node);
    }
  }

  public static void printBackwards(Node list) {

  }

}
