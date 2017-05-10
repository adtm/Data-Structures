package c_stacks.minimal_stack;

public class MinimalStack {

  Stack stack = new Stack();

  boolean push(
    int value
  ) {
    if (stack.isEmpty()) {
      stack.push(value);
    } else if (stack.peek() < value) {
      stack.push(stack.peek());
    } else {
      stack.push(value);
    }
    return true;
  }

  int pop() {
    return this.stack.pop();
  }

  int minValue() {
    return this.stack.peek();
  }

}
