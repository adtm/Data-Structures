package c_linked_list;

public class Node {
  public int data;
  public Node next;

  Node() {
    next = null;
  }

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  Node(int data, Node pointer) {
    this.data = data;
    this.next = pointer;
  }

}
