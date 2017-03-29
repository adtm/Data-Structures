package data;

public class Main {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList(1);
    linkedList.push(2);
    linkedList.push(3);

    linkedList.traverse();
    System.out.println();
    linkedList.addHead(4);
    linkedList.traverse();

    System.out.println();
    linkedList.addAfterNode(linkedList.head, 5);
    linkedList.traverse();

    linkedList.delete(4);
    linkedList.delete(5);
    System.out.println();
    linkedList.traverse();

    linkedList.deleteNode(1);
    System.out.println();
    linkedList.traverse();

    System.out.println();
    linkedList.length();

    System.out.println();
    linkedList.push(4);
    linkedList.push(5);
    linkedList.swap(4,5);
    linkedList.traverse();
  }

}
