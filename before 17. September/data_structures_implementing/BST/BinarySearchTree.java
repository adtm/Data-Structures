package implementing.BST;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
  Node root = null;

  //Add elements
  public BinarySearchTree add(int data) {
    Node node = new Node(data);
    if (root == null) {
      root = node;
      return this;
    }

    addElements(root, node);
    return this;
  }

  private void addElements(Node root, Node node) {
    if (root.data >= node.data) {
      if (root.left == null) {
        root.left = node;
      } else {
        addElements(root.left, node);
      }
    } else {
      if (root.right == null) {
        root.right = node;
      } else {
        addElements(root.right, node);
      }
    }
  }

  //Find Elements
  void find(int value) {
    find(root, value);
  }

  private void find(Node root, int value) {
    try { // bad practise
      if (root.data == value) {
        System.out.println("FOUND!");
        return;
      }
      if (root.data >= value) {
        find(root.left, value);
      } else {
        find(root.right, value);
      }
    } catch (Exception e) {
      System.out.println("NOT FOUND!");
    }

  }

  //Traverse In Order
  public void traverseInOrder() {
    traverseInOrder(root);
  }

  private void traverseInOrder(Node root) {
    if (root == null) {
      return;
    }
    traverseInOrder(root.left);
    System.out.print(root.data + " ");
    traverseInOrder(root.right);
  }

  //Traverse Pre Order
  public void traversePreOrder() {
    traversePreOrder(root);
  }

  private void traversePreOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    traversePreOrder(root.left);
    traversePreOrder(root.right);
  }

  //Traverse Post Order
  public void traversePostOrder() {
    traversePostOrder(root);
  }

  private void traversePostOrder(Node root) {
    if (root == null) {
      return;
    }
    traversePostOrder(root.left);
    traversePostOrder(root.right);
    System.out.print(root.data + " ");
  }

  //Traverse BFS
  public void traverseLevelOrder() {
    traverseLevelOrder(root);
  }

  private void traverseLevelOrder(Node root) {
    Queue<Node> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    while (!queue.isEmpty()) {
      Node node = queue.remove();
      System.out.println(node.data);
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
  }


}
