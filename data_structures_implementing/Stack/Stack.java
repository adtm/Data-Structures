package implementing.Stack;

import java.util.LinkedList;

public class Stack<T> {

  LinkedList<T> stack = new LinkedList<>();

  public void push(T data){
    stack.addFirst(data);
  }

  public T pop() {
    return stack.removeFirst();
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public int size(){
    return stack.size();
  }

}
