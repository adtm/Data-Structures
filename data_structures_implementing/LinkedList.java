package implementing;

public class LinkedList {

  Node head;
  int size = 0;

  LinkedList() {
    head = null;
  }

  LinkedList(int data) {
    this.head = new Node(data);
  }

  // O(n)
  private void addIndex(int data, int index) {
    Node newNode = new Node(data);
    Node item = head;

    if (index == 1) {
      addBeginning(data);
    } else if (index == size + 1) {
      addEnding(data);
    } else {

      int n = 1;
      while (item.next != null) {

        if (index == n) {
          newNode.next = item;
          break;
        }
        item = item.next;
        n++;
      }
      head.next = newNode;
    }
    size++;
  }

  // O(n)
  private void addEnding(int data) {
    Node newNode = new Node(data);
    Node item = head;

    if (head == null) {
      head = newNode;
    } else {
      while (item.next != null) {
        item = item.next;
      }
      item.next = newNode;
    }
    size++;
  }

  // O(1)
  private void addBeginning(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    size++;
  }

  // O(n)
  public void deleteIndex(int index) {
    Node item = head;

    if (index == 1) {
      deleteBeginning();
    } else if (index == size) {
      deleteEnding();
    } else {

      int n = 2;
      while (item.next != null) {

        if (index == n) {
          item.next = item.next.next;
          break;
        }
        item = item.next;
        n++;
      }
    }
    size--;
  }

  // O(1)
  private void deleteEnding() {
    Node item = head;
    while (item.next.next != null) {
      item = item.next;
    }
    item.next = null;
    size--;
  }

  // O(1)
  private void deleteBeginning() {
    head = head.next;
    size--;
  }

  // O(n)
  private void traverse() {
    Node current = head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.addEnding(5);
    linkedList.addEnding(7);
    linkedList.addEnding(4);
    linkedList.addEnding(9);
    linkedList.addEnding(15);
//    linkedList.addEnding(4);
//    linkedList.addEnding(78);
//    linkedList.addEnding(1);
//    linkedList.addEnding(22);
//
//    linkedList.addBeginning(69);
//
//    linkedList.deleteBeginning();
//    linkedList.deleteEnding();

    linkedList.deleteIndex(4);
    linkedList.traverse();
  }

}
