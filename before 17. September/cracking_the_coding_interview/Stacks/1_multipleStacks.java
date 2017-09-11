package g_stack;

public class MultipleStacks {

  int topOfStacks[];
  int stackData[];
  int nextIndex[];
  int available;

  MultipleStacks(
    int stackAmount,
    int capacity
  ) {
    this.topOfStacks = new int[stackAmount];
    this.stackData = new int[capacity];
    this.nextIndex = new int[capacity];
    for (int i = 0; i < capacity - 1; i++) {
      this.nextIndex[i] = i + 1;
    }
    nextIndex[this.nextIndex.length - 1] = -1;
    this.available = 0;
  }

  void push(int stack, int value) {
    if (stack < 0 || this.topOfStacks.length <= stack) {
      throw new IndexOutOfBoundsException();
    }

    int currentIndex = this.available;
    this.stackData[currentIndex] = value;
    this.topOfStacks[stack] = currentIndex;
    this.nextIndex[currentIndex] = this.topOfStacks[stack];
    this.available = this.nextIndex[currentIndex];
  }

  int pop(int stack) {
    if (this.topOfStacks[stack] < 0 ||
      stack < 0 || this.topOfStacks.length <= stack) {
      throw new IndexOutOfBoundsException();
    }

    int currentIndex = this.topOfStacks[stack];
    int value = this.stackData[currentIndex];
    this.nextIndex[currentIndex] = available;
    this.available = currentIndex;
    this.topOfStacks[stack] = this.nextIndex[currentIndex];
    return value;
  }
}
