package week5.node.second;

public class LinkedList {

  int size = 0;
  Node head;
  Node tail;

  public void add(int data) {

    Node node = new Node(data);

    if (tail == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      tail = node;
    }
    size++;
  }

  public Node delete(int data) {

    Node nodeToReturn = null;

    if (size == 0) {
      return null;
    } else if (size == 1) {
      nodeToReturn = head;
      head = null;
      tail = null;
      size--;
      return nodeToReturn;
    }

    Node nodeBeforeNodeToDelete = findNodeBefore(data);
    if (nodeBeforeNodeToDelete.data == 0) {
      head = head.next;
      size--;
    } else if (nodeBeforeNodeToDelete != null) {

      if (tail.data == data) {
        nodeBeforeNodeToDelete.next = null;
        tail = nodeBeforeNodeToDelete;
      } else {
        nodeBeforeNodeToDelete.next = nodeBeforeNodeToDelete.next.next;
      }
      size--;
    }
    return null;

  }

  /**
   * If this method returns empty node, it means the element
   * we want to delete is at the head
   * Returns null if no match,
   * if found - a populated node
   *
   * @param data
   * @return
   */
  public Node findNodeBefore(int data) {

    if (head.data == data) {
      return new Node();
    }

    Node node = head;

    while (head.next != null) {
      if (node.next.data == data) {
        return node;
      }
      node = node.next;
    }
    return null;
  }


  public Node find(int data) {
    if (head == null) {
      return null;
    }
    if (head.data == data) {
      return head;
    }

    Node node = head;

    while (head.next != null) {
      node = node.next;
      if (node.data == data) {
        return node;
      }
    }
    return null;
  }

  protected void traverse() {
    if (head != null) {
      Node node = head;
      System.out.println(node);
      while (node.next != null) {
        node = node.next;
      }
    }
  }

}
