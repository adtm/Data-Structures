package data;


public class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  Node(int data, Node pointer) {
    this.data = data;
    this.next = pointer;
  }
}
