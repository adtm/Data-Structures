package implementing.Queue;

import java.util.LinkedList;

public class Queue<T> {

  LinkedList<T> queue = new LinkedList();

  public T dequeue() {
    return queue.removeLast();
  }

  public void enqueue(T data) {
    queue.addFirst(data);
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public int size() {
    return queue.size();
  }

}
