package c_linked_list;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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


}
