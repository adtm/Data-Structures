package c_linked_list;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class LinkedList {

  Node head = new Node();

  LinkedList(int data) {
    head.data = data;
  }

  void add(int data) {
    Node new_data = new Node(data);
    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = new_data;
  }
  void add(int data, Node pointer) {
    Node new_data = new Node(data, pointer);
    Node curr = this.head;
    while ( curr.next != null ) {
      curr = curr.next;
    }
    curr.next = new_data;
  }

  void removeDuplicates() {

    Node curr = head;
    Node prev = null;

//    HashSet<Integer> hashSet = new HashSet<>();
//    while (curr != null) {
//      if (hashSet.contains(curr.data)) {
//        prev.next = curr.next;
//      } else {
//        hashSet.add(curr.data);
//        prev = curr;
//      }
//      curr = curr.next;
//    }

    HashMap<Integer, Integer> hashMap = new HashMap<>(); // Integer / Amount
    while (curr.next != null) {
      Integer count = hashMap.get(curr.data);
      if (count == null) {
        hashMap.put(curr.data, 1);
        prev = curr;
      }
      else {
        hashMap.put(curr.data, count + 1);
        prev.next = curr.next;
      }
      curr = curr.next;
    }
  }

  void traverse() {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
  }

  void kthFromTail (Node head, int k) {
    Node curr = head;
    for (int i = 0; i < k && curr.next != null; i++) {
      curr = curr.next;
    }

    Node prev = head;
    while (curr.next != null && prev.next != null) {
      prev = prev.next;
      curr = curr.next;
    }
    System.out.println(prev.data);
  }

  void deleteMiddleNode (Node delete_node) {
    delete_node.data = delete_node.next.data;
    delete_node.next = delete_node.next.next;
  }

  boolean palindrome (Node head) {
    Node curr = head;
    Stack<Integer> stack = new Stack<>();
    while (curr != null) {
      stack.push(curr.data);
      curr = curr.next;
    }

    curr = head;
    while (curr != null) {
      if (curr.data != stack.pop())
        return false;
      curr = curr.next;
    }
    return true;

  }

  void intersection1 (LinkedList l1, LinkedList l2) {
    int length_l1 = findLength(l1.head); // 4 length
    int length_l2 = findLength(l2.head); // 5 length

    int intersection = 0;
    if (length_l1 > length_l2) {
      intersection = findIntersection(l1, l2, length_l1 - length_l2);
    } else {
      intersection = findIntersection(l2, l1, length_l2 - length_l1);
    }
    System.out.println(intersection);
  }

  private int findIntersection(LinkedList bigger_list, LinkedList smaller_list, int size_diff) {
    for (int i = 0; i < size_diff; i++)
      bigger_list.head = bigger_list.head.next;

    while (bigger_list.head != null && smaller_list.head != null) {
      if (bigger_list.head.data == smaller_list.head.data)
        return bigger_list.head.data;

      bigger_list.head = bigger_list.head.next;
      smaller_list.head = smaller_list.head.next;
    }
    return 0;
  }

  private int findLength(Node head) {
    int counter = 0;
    Node trav = head;
    while (trav != null) {
      trav = trav.next;
      counter++;
    }
    return counter;
  }

  int intersection2(LinkedList l1, LinkedList l2) {
    HashSet<Integer> hashSet = new HashSet<>();

    Node trav = l1.head;
    while (trav != null) {
      hashSet.add(trav.data);
      trav = trav.next;
    }

    Node trav2 = l2.head;
    while (trav2 != null) {
      if (hashSet.contains(trav2.data))
        return trav2.data;
      trav2 = trav2.next;
    }

    return 0;
  }

  int findCircularStart (LinkedList l1) {
    if (l1.head == null || head.next == null || head.next.next == null) {
      return 0;
    }
    Node hare = l1.head;
    Node turtle = l1.head;
    while (hare.next != null) {
      turtle = turtle.next;
      hare = hare.next.next;
      if (turtle == hare)
        return hare.data;
    }

    return 0;
  }

}
