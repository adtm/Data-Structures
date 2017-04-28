package g_stack;


import java.util.LinkedList;
import java.util.Queue;

class StackByQueue {
  private Queue<Integer> queue1 = new LinkedList<>();  // all elements
  private Queue<Integer> queue2 = new LinkedList<>();  // put new element here

  void push (int el) {
    this.queue2.add(el);
    while (!queue1.isEmpty()) {
      this.queue2.add(queue1.remove());
    }
    this.queue1 = this.queue2;
    this.queue2 = new LinkedList<>(); // dirty, but fast
  }

  Integer pop () {
    return this.queue1.remove();
  }

  void traverse () {
    for (Integer i: this.queue1)
      System.out.println(i);
  }

}
