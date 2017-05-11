package c_stacks.minimal_stack.stacks_of_plates;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {
  private ArrayList<Stack> sets = new ArrayList<>();
  private Stack<Integer> stack;
  private final int divider = 2;
  private int counter;

  StackOfPlates() {
    counter = 0;
  }

  void push(
    int value
  ) {
    if (counter == 0 || counter == divider) {
      counter = 0;
      stack = new Stack<>();
      sets.add(stack);
    }
    stack.push(value);
    counter++;
  }

  int pop(
    int index
  ) {
    if (counter == 0) {
      counter = divider;
    } else {
      counter--;
    }
    return (Integer) sets.get(index).pop();
  }

}
