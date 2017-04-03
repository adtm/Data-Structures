
public class Main {
  public static void main(String[] args) {
    LinkedListDouble linkedListDouble = new LinkedListDouble();
    linkedListDouble.traverse();


    System.out.println();
    linkedListDouble.push(1);
    linkedListDouble.append(2);
    linkedListDouble.append(3);
    linkedListDouble.traverse();

    System.out.println();
    linkedListDouble.reverse();
    linkedListDouble.traverse();

  }
}
