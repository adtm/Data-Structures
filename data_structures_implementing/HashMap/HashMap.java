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
          } else {
            newEntry.next = current.next;
            previous.next = newEntry;
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

  public V get(K key) {
    int hash = hash(key);
    if (table[hash] == null) {
      return null;
    } else {
      Entry<K, V> temp = table[hash];
      while (temp != null) {
        if (temp.key.equals(key)) {
          return temp.value;
        }
        temp = temp.next;
      }
      return null;
    }
  }

  public boolean delete(K deleteKey) {

    int hash = hash(deleteKey);
    if (table[hash] == null) {
      return false;
    } else {
      Entry<K, V> previous = null;
      Entry<K, V> current = table[hash];

      while (current != null) {

        if (current.key.equals(deleteKey)) {
          if (previous == null) {
            table[hash] = table[hash].next;
            return true;
          } else {
            previous.next = current.next;
            return true;
          }

        }

        previous = current;
        current = current.next;
      }

    }

    return false;
  }

  public void display() {
    for (int i = 0; i < capacity; i++) {
      if (table[i] != null) {
        Entry<K, V> currentEl = table[i];
        System.out.println("Parent: " + currentEl.key + " | " + currentEl.value);
        while (currentEl.next != null) {
          System.out.println("Child: " + currentEl.next.key + " | " + currentEl.next.value);
          currentEl = currentEl.next;
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

    System.out.println(hashMap.get(5)
    );


    hashMap.delete(78);

    hashMap.display();
  }
}
