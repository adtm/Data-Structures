
class LinkedListDouble {

  Node head  = null;

  void push(int _data) {
    Node node = new Node(_data);
    node.prev = null;
    node.next = head;

    if (head != null) {
      head.prev = node;
    }
    head = node;
  }

  void append(int _data) {
    Node node = new Node(_data);
    node.next = null;

    Node thead = head;
    while (thead.next != null) {
      thead = thead.next;
    }
    thead.next = node;
    node.prev = thead;
  }

  void pushAfterNode(Node prev, int _data) {
    if (prev == null) {
      System.out.println("Cannot insert before NULL. lol");
    } else {
      Node node = new Node(_data);

      node.next = prev.next;
      prev.next = node;
      node.prev = prev;

      if (node.next != null) {
        node.next.prev = node;
      }
    }
  }

  void pushBeforeNode(Node after, int _data) {
      if (after == null) {
        System.out.println("Cannot insert after NULL. lol");
      } else {
        Node node = new Node(_data);
        node.next = after.next;
        after.next = node;
        node.prev = after;
        if (node.next != null) {
          node.next.prev = node;
        }
      }
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
