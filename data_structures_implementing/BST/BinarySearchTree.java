package learning.BST;

public class BinarySearchTree {

  public Node root;

  public BinarySearchTree add(int data) {
    Node node = new Node(data);

    if (root == null) {
      root = node;
      return this;
    }
    addLower(root, node);
    return this;
  }

  private void addLower(Node root, Node node) {
    if (root.data >= node.data) {
      if (root.left == null) {
        root.left = node;
      } else {
        addLower(root.left, node);
      }
    } else {
      if (root.right == null) {
        root.right = node;
      } else {
        addLower(root.right, node);
      }
    }
  }

  public void findMember(int value) {
    findMember(root, value);
  }

  public void findMember(Node root, int value){
    try {
      if (root.data == value) {
        System.out.println("FOUND!");
      } else if (root.data >= value){
        findMember(root.left, value);
      } else if (root.data < value){
        findMember(root.right, value);
      }
    } catch (Exception e) {
      System.out.println("NOT FOUND!");
    }
  }

  public void findMin() {
    int min = 0;
    Node current = root;

    while (current.left != null) {
      current = current.left;
      min = current.data;
    }
    System.out.println(min);
  }

  public void findMax() {
    int max = 0;
    Node current = root;

    while (current.right != null) {
      current = current.right;
      max = current.data;
    }
    System.out.println(max);
  }

  void traversePreOrder() {
    printTraversePreOrder(root);
  }

  private void printTraversePreOrder(Node root) {
    if (root == null) {
      return;
    }
    printTraversePreOrder(root.left);
    System.out.println(root.data);
    printTraversePreOrder(root.right);
  }


}
