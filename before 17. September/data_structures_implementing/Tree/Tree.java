package hackerrank.bst;

public class Tree {
  public static void main(String[] args) {
    Node tree = new Node(1);

    tree.traverse();

    System.out.println();

    tree.insert(5);
    tree.insert(8);


    tree.traverse();

    System.out.println();

    System.out.println(tree.contains(5));
    System.out.println(tree.contains(7));
  }
}
