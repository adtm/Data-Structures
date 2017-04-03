/**
 * Created by Tomas on 4/3/2017.
 */
public class Main {
  public static void main(String[] args) {
    LinkedListDouble linkedListDouble = new LinkedListDouble();
    linkedListDouble.traverse();


    System.out.println();
    linkedListDouble.pushFront(2);
    linkedListDouble.pushFront(1);
    linkedListDouble.pushBack(3);
    linkedListDouble.pushBack(4);
    linkedListDouble.traverse();
  }
}
