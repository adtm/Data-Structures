package g_stack;

class Stack {

  static final int MAX = 10000;
  int top;
  int[] a = new int[MAX];

  Stack() {
    top = -1;
  }

  boolean isEmpty() {
    return (top < 0);
  }

  boolean push(int value) {
    if (top >= MAX) {
      System.out.println("Stack OverFlow");
      return false;
    } else {
      a[++top] = value;
      return true;
    }
  }

  int pop() {
    if (top > -1) {
      return a[top--];
    } else {
      System.out.println("Stack UnderFlow");
      return -1;
    }
  }

  int peek() {
    if (isEmpty()) {
      System.out.println("Empty");
      return -1;
    } else {
      return a[top];
    }
  }

}
