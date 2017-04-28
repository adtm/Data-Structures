package g_stack;

class Main {

  public static void main(String[] args) {
    
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
