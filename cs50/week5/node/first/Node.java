package week5.node.first;

public class Node{

  int data;
  Node next;

  Node(){
    data = 0;
    next = null;
  }

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public String toString(){
    return data + "";
  }

}