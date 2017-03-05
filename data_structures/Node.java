package week5.node.second;

public class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
  }

  public Node() {

  }

  @Override
  public String toString() {
    return data + "";
  }
}
