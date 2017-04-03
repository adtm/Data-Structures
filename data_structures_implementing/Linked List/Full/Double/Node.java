/**
 * Created by Tomas on 4/3/2017.
 */
public class Node {
  int data;
  Node next;
  Node prev;

  Node(int _data) {
    this.data = _data;
    this.next = null;
    this.prev = null;
  }
}
