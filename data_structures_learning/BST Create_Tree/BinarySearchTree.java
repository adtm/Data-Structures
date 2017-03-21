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
  public void traversePreOrder() {
    print(root);
  }

  public void print(Node root) {
    if (root == null) {
      return;
    }
    print(root.left);
    System.out.println(root.data);
    print(root.right);
  }


}
