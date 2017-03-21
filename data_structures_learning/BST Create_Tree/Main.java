package learning.BST;

public class Main {
  public static void main(String[] args) {
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    binarySearchTree.add(5);
    binarySearchTree.add(7);
    binarySearchTree.add(2);
    binarySearchTree.add(29);
    binarySearchTree.traversePreOrder();
  }
}
