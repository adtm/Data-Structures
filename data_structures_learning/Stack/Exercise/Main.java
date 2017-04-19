package g_stack;

class Main {

  public static void main(String[] args) {
    int arr[] = {4, 5, 2, 25};

    int next,
        element;

    Stack s = new Stack();

    s.push(arr[0]);

    for (int i = 1; i < arr.length; i++) {

      next = arr[i];
      if (!s.isEmpty()) {
        element = s.pop();

        while (element < next) {
          System.out.println(element + " bigger element is:  " + next);
          if(s.isEmpty())
            break;
          element = s.pop();
        }

        if (element > next)
          s.push(element);

      }

      s.push(next);
    }

    while (!s.isEmpty()) {
      element = s.pop();
      System.out.println(element + " -1");
    }

  }

//  public static StringBuilder reverseString(String sentence) {
//    Stack<Character> stack = new Stack<>();
//    for (char ch : sentence.toCharArray()) {
//      stack.push(ch);
//    }
//
//    StringBuilder reversedString = new StringBuilder();
//    for (int i = 0; i < sentence.length(); i++) {
//      reversedString.append(stack.pop());
//    }
//    return reversedString;
//  }

}
