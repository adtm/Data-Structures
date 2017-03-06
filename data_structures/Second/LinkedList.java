package hackerrank.linkedlist;

public class LinkedList {

  // Properties

  Node head;
  Node tail;
  int size;


  // Constructor
  LinkedList(Node head) {
    this.head = head;
    this.size = 1;
  }

  public void add(int newData) {

    Node node = new Node(newData);
    Node current = head;

    while (current.getNext() != null) {
      current = current.getNext();
    }
    current.setNext(node);
    size++;
  }

  public int get(int index) {

    if(index <= 0) {
      return -1;
    }

    Node current = head;
    for (int i = 1; i < index; i++) {
      current = current.getNext();
    }

    return  current.getData();

  }

  public int size() {
    return size;
  }

  public boolean isEmpty(){
    return head == null;
  }


  public void remove() {
    Node current = head;
    while (current.getNext().getNext() != null) {
      current = current.getNext();
    }
    current.setNext(null);
    size--;
  }

  // remove


  public static void main(String[] args) {



  }

}
