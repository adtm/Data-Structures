package hackerrank;

public class ArrayList {

  private int[] items = new int[8];
  private int size = 0;

  ArrayList(){

  }

  public void set(int index, int value) {
    if (size <= index || index < 0)
      throw new ArrayIndexOutOfBoundsException();
    items[index] = value;
    size++;
  }

  public void append(int value) {
    checkIfEnoughSpaceInArray();
    items[size] = value;
    size++;
  }

  private void checkIfEnoughSpaceInArray() {
    if (items.length == size) {
      int[] copy = new int[size * 2];
      System.arraycopy(items, 0, copy, 0, size);
      items = copy;
    }
  }

  public int get(int index) {
    if (size <= index || index < 0)
      throw new ArrayIndexOutOfBoundsException();
    return items[index];
  }

  public void traverse() {
    for (int item : items) {
      System.out.println(item);
    }
  }

}
