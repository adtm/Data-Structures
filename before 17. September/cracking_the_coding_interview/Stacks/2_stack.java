package c_stacks.minimal_stack;

public class Stack {
  private final int MAX = 1000;
  private int top;
  private int[] stack = new int[MAX];

  Stack() {
    top = -1;
  }

  boolean push(
    int value
  ) {
    if (top < MAX) {
      stack[++top] = value;
      return true;
    } else {
      System.out.println("Stack Overflow");
      return false;
    }
  }

  int pop() {
    if(top > 0) {
      return stack[--top];
    } else {
      System.out.println("Stack Underflow");
      return -1;
    }
  }

  int peek() {
    if (isEmpty()) {
      System.out.println("Empty");
      return -1;
    } else {
      return stack[top];
    }
  }

  boolean isEmpty() {
    return top == -1;
  }

}
