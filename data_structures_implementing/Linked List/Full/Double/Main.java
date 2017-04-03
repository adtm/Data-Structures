
public class Main {
  public static void main(String[] args) {
    LinkedListDouble linkedListDouble = new LinkedListDouble();
    linkedListDouble.traverse();


    System.out.println();
    linkedListDouble.push(3);
    linkedListDouble.push(1);
    linkedListDouble.pushBeforeNode(linkedListDouble.head, 2);
    linkedListDouble.traverse();
  }
}
