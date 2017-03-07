package hackerrank.queue;


import java.util.LinkedList;

public class Queue {

  LinkedList queue;

  public Queue() {
    queue = new LinkedList();
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public int size() {
    return queue.size();
  }

  public void enqueue(int data){
    queue.addLast(data);
  }

  public int dequeue(){
    return (int) queue.remove(0);
  }

  public int peek(){
    return (int) queue.get(0);
  }

  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.enqueue(5);
    queue.enqueue(7);
    queue.enqueue(9);
    queue.peek();
  }

}
