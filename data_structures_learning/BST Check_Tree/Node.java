package hackerrank.bst;

public class Node {
  Node left;
  Node right;
  int data;

  Node(int data) {
    this.data = data;
  }

  public void insert(int value) {
    if (value < data) {
      if (left == null)
        left = new Node(value);
      else
        left.insert(value);
    } else {
      if (right == null)
        right = new Node(value);
      else
        right.insert(value);
    }
  }

  public boolean contains(int value) {
    if (data == value)
      return true;

    else if (value < data) {
      if (left == null)
        return false;
      else
        left.contains(value);
    } else {
      if (right == null)
        return false;
      else
        right.contains(value);
    }
    return false;
  }

  public void traverse() {
    if (left != null)
      left.traverse();

    System.out.println(this.data);

    if (right != null)
      right.traverse();
  }

}