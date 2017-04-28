package g_stack;

class StackMin extends Stack {

  private final int MAX = 10;

  Stack min = new Stack();
  int minArr[] = new int[MAX];
  int topMin = -1;


  boolean push(int el) {
    if (min.isEmpty()) {
      min.push(el);
    }
    else if (el < min.peek()) {
      min.push(el);
    } else
      min.push(min.peek());
    return true;
  }

  int pop () {
    int x = min.pop();
    return x;
  }

  int getTopMin() {
    int y = min.pop();
    return y;
  }

}
