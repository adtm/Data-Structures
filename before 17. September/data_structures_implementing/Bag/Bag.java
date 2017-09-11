package implementing.Bag;

import java.util.LinkedList;

public class Bag<Item> {

  LinkedList<Item> bag = new LinkedList<>();

  public void add(Item item) {
    bag.add(item);
  }

  public boolean isEmpty(){
    return bag.isEmpty();
  }

  public int size(){
    return bag.size();
  }

}
