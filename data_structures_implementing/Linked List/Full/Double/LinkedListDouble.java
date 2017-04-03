
public class LinkedListDouble {

  Node head  = null;

  void pushFront(int _data) {
    Node node = new Node(_data);
    node.prev = null;
    node.next = head;

    if (head != null) {
      head.prev = node;
    }
    head = node;
  }

  void pushBack(int _data) {
    Node node = new Node(_data);
    node.next = null;

    Node thead = head;
    while (thead.next != null) {
      thead = thead.next;
    }
    thead.next = node;
    node.prev = thead;
  }

  void traverse() {
    if (head == null) {
      System.out.println("Empty, lol.");
    } else {
      Node thead = head;
      while (thead != null) {
        System.out.println(thead.data);
        thead = thead.next;
      }
    }
  }

}
