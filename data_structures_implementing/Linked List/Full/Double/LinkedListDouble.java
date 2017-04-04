
class LinkedListDouble {

  Node head = null;

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
    if (head == null) {
      head = node;
    }
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
      System.out.println("Traverse in forward position: ");
      Node thead = head;

      Node last = null;
      while (thead != null) {
        System.out.print(thead.data + " ");
        last = thead;
        thead = thead.next;
      }

      System.out.println("\nTraversal in backward position");
      while (last != null) {
        System.out.print(last.data + " ");
        last = last.prev;
      }
    }
  }

  void delete(Node del) {
    if (head == null || del == null) {
      return;
    }

    if (head == del) {
      head = head.next;
    }

    if (del.next != null) {
      del.next.prev = del.prev;
    }

    if (del.prev != null) {
      del.prev.next = del.next;
    }
  }

  void reverse() {
    Node thead = head;
    Node temp = null;
    while (thead != null) {
      temp = thead.prev;
      thead.prev =  thead.next;
      thead.next = temp;
      thead = thead.prev;
    }

    if (temp != null) {
      head = temp.prev;
    }
  }
}
