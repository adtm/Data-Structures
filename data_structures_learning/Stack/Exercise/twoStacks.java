package g_stack;

class TwoStacks {

  int top1;
  int top2;
  int[] arr;


  TwoStacks(int size) {
    this.top1 = -1;
    this.top2 = (size);
    this.arr = new int[size];
  }

  boolean push1(int value) {
    if (top1 < top2 - 1) {
      arr[++top1] = value;
      return true;
    } else {
      System.out.println("Stack Overflow");
      return false;
    }
  }

  boolean push2(int value) {
    if (top1 < top2 - 1) {
      arr[--top2] = value;
      return true;
    } else {
      System.out.println("Stack Overflow");
      return false;
    }
  }

  // lower bound
  int pop1() {
    return arr[top1--];
  }

  int pop2() {
    return arr[top2++];
  }





}
