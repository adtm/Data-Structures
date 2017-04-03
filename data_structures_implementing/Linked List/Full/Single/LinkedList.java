package data;


public class LinkedList {

  Node head;

  LinkedList() {
    this.head = null;
  }

  LinkedList(int new_data) {
    this.head = new Node(new_data);
  }

  void push(int new_data) {

    Node new_node = new Node(new_data);
    if (head == null) {
      head = new_node;
    } else {
      Node thead = head;
      while (thead.next != null) {
        thead = thead.next;
      }
      thead.next = new_node;
    }
  }

  void reverseRecursive(Node head) {
    if (head == null) {
      return;
    }
    reverseRecursive(head.next);
    System.out.println(head.data);
  }

  void traverse() {
    if (head == null) {
      System.out.println("Empty Linked List!");
    }

    Node tnode = head;
    while (tnode != null) {
      System.out.print(tnode.data + " ");
      tnode = tnode.next;
    }
  }

  void addHead(int new_data) {
    Node new_node = new Node(new_data);
    if (head == null) {
      head = new_node;
    }
    new_node.next = head;
    this.head = new_node;
  }

  void addAfterNode(Node previous, int new_data) {
    Node new_node = new Node(new_data);

    Node thead = head;
    while (thead != previous) {
      thead = thead.next;
    }
    new_node.next = thead.next;
    thead.next = new_node;
  }

  void delete(int key) {
    Node thead = head;
    if (thead != null && thead.data == key) {
      head = thead.next;
      return;
    }

    Node prev = null;
    Node curr = head;
    while (curr.next != null && curr.data == key) {
      prev = curr;
      curr = curr.next;
    }
    prev = curr.next;
  }

  void deleteNode(int position) {

    Node thead = head;
    if (position == 0) {
      head = thead.next;
      return;
    }

    for (int i = 0; thead != null && i < position - 1; i++) {
      thead = thead.next;
    }

    if (thead == null || thead.next == null) {
      return;
    }

    Node next = thead.next.next;
    thead.next = next;
  }

  void length() {
    int length = length(head);
    System.out.println(length);
  }

  private int length(Node head) {
    if (head == null) {
      return 0;
    }
    return 1 + length(head.next);
  }

  void swap(int x, int y) {

    if (x == y) return;
    Node currX = head;
    Node prevX = null;
    while (currX != null && currX.data != x) {
      prevX = currX;
      currX = currX.next;
    }
    Node currY = head;
    Node prevY = null;
    while (currY != null && currY.data != y) {
      prevY = currY;
      currY = currY.next;
    }
    if (currX == null || currY == null) {
      return;
    }
    if (prevX != null) {
      prevX.next = currY;
    } else {
      head = currY;
    }
    if (prevY != null) {
      prevY.next = currX;
    } else {
      head = currX;
    }
    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
  }

  void reverse() {
    Node prev = null;
    Node curr = head;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  void rotate(int k) {
    if (k == 0) {
      return;
    }

    int counter = 1;
    Node curr = head;
    while (counter != k && curr != null) {
      curr = curr.next;
      counter++;
    }

    if (curr == null) {
      return;
    }

    Node kthEl = curr;

    while (curr.next != null) {
      curr = curr.next;
    }

    curr.next = head;
    head = kthEl.next;
    kthEl.next = null;
  }

  void deleteKth( int k) {

    k -= 1;
    Node root = this.head;

    int counter = 1;
    while (root != null) {

      if (counter % k  == 0) {
        deleteByPosition(head, counter);
      }

      root = root.next;
      counter++;
    }
  }

  private void deleteByPosition(Node head, int position) {

    Node root = head;
    if (position == 0) {
      this.head = root.next;
      return;
    }

    for (int i = 0; root != null && i < position - 1; ++i) {
      root = root.next;
    }

    if (root == null || root.next == null) {
      return;
    }
    Node next = root.next.next;
    root.next = next;

  }

  void pushCycle(int new_data, Node pointer) {
    Node node = new Node(new_data, pointer);

    Node thead = head;
    while (thead.next != null) {
      thead = thead.next;
    }
    thead.next = node;
  }

  boolean checkCycle() {
    Node turtle = head;
    Node hare = head.next;

    while(hare != null && hare.next != null) {
      turtle = turtle.next;
      hare = hare.next.next;

      if(turtle == hare) {
        return true;
      }
    }
    return false;
  }

  void removeCycle() {
   Node turtle = head;
   Node hare = head.next;

   while (hare != null && hare.next != null) {
     turtle = turtle.next;
     hare = hare.next.next;

     if (turtle == hare) {
       break;
     }
   }

   if (turtle == hare) {
     turtle = head;
     while (turtle != hare.next) {
       turtle = turtle.next;
       hare = hare.next;
     }
     hare.next = null;
   }

  }

}
