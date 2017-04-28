package g_stack;

class Main {

  public static void main(String[] args) {
    StackByQueue stackByQueue = new StackByQueue();
    stackByQueue.push(1);
    stackByQueue.push(2);
    stackByQueue.push(3);
    stackByQueue.push(4);
    stackByQueue.traverse();
  }

  private static boolean pairWise(String s) {
    Stack stack = new Stack();
    for (Character ch : s.toCharArray()) {
      if (ch == '{') stack.push('}');
      else if (ch == '[') stack.push(']');
      else if (ch == '(') stack.push(')');
      else {
        if (!s.isEmpty() && ch == stack.peek()) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return true;
  }
}
