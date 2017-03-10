package learning;


public class HashMap<K, V> {

  private Entry<K, V>[] table;
  private int capacity = 4;

  HashMap() {
    table = new Entry[capacity];
  }

  public void put(K newKey, V value) {
    if (newKey == null) {
      return;
    }

    int hash = hash(newKey);
    System.out.println(hash);
    Entry<K, V> newEntry = new Entry<K, V>(newKey, value, null);

    if (table[hash] == null) {
      table[hash] = newEntry;
    } else {
      Entry<K, V> previous = null;
      Entry<K, V> current = table[hash];
 
      while (current != null) {
        if (current.key.equals(newKey)) {
          if (previous == null) {
            newEntry.next = current.next;
            table[hash] = newEntry;
            return;
          } else {
            newEntry.next = current.next;
            previous.next = newEntry;
            return;
          }
        }
        previous = current;
        current = current.next;
      }
      previous.next = newEntry;

    }
  }

  private int hash(K key) {
    return Math.abs(key.hashCode()) % capacity;
  }

  public void display() {
    for (int i = 0; i < capacity; i++) {
      if (table[i] != null) {
        Entry<K, V> currentEl = table[i];
        System.out.println("Parent: " + currentEl.key + " | " + currentEl.value);
        while (currentEl.next != null) {
          System.out.println("Child: " + currentEl.next.key + " | " + currentEl.next.value);
        }
      }
    }
  }


  public static void main(String[] args) {
    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    hashMap.put(5, 10);
    hashMap.put(4, 18);
    hashMap.put(7, 9);
    hashMap.put(1, 7);
    hashMap.put(8, 4);
    hashMap.put(78, 24);

    hashMap.display();
  }
}
