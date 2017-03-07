package hackerrank.queue;

import java.util.LinkedList;

public class Stack {

  LinkedList stack;

  public Stack() {
    stack = new LinkedList();
  }

  public void push(int data) {
    stack.addFirst(data);
  }

  public int pop() {
    return (int) stack.removeFirst();
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public int peek() {
    return (int) stack.getFirst();
  }

}
