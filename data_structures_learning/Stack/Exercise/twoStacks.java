package g_stack;

class TwoStacks {

  int size;
  int top1, top2;
  int arr[];

  TwoStacks(int size) {
    this.size = size;
    arr = new int[size];
    top1 = -1;
    top2 = size;
  }

  void push1(int el) {
    if (top1 < top2 - 1) {
      arr[++top1] = el;
    } else {
      System.out.println("Stack Overflow");
    }
  }

  void push2(int el) {
    if (top1 < top2 - 1) {
      arr[--top2] = el;
    } else {
      System.out.println("Stack Overflow");
    }
  }

  int pop1() {
    if (top1 >= 0) {
      int x = arr[top1];
      top1--;
      return x;
    } else {
      System.out.println("Stack Underflow");
      return -1;
    }
  }

  int pop2() {
    if (top2 < size) {
      int x = arr[top2];
      --top2;
      return x;
    } else {
      System.out.println("Stack Underflow");
      return -1;
    }
  }

}
