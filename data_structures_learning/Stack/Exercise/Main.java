package g_stack;

class Main {

  public static void main(String[] args) {
    int[] prices = {10, 4, 5, 90, 120, 80};
    stockProblemStack(prices);
  }

  private static void stockProblemStack(int[] prices) {
    Stack stack = new Stack();
    stack.push(0);
    int[] S = new int[prices.length];
    S[0] = 1;
    for (int i = 1; i < prices.length; i++) {
      while (!stack.isEmpty() && prices[stack.peek()] <= prices[i])
        stack.pop();
      S[i] = stack.isEmpty() ? (i+1) : (i - stack.peek());
      stack.push(i);
    } 
    for (int i: S)
      System.out.println(i);
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
