package c_linked_list;


import java.util.HashMap;
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

}
