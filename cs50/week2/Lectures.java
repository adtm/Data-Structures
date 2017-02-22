package week2.lectures;

public class Lectures {
  public static void main(String[] args) {

    int findNumber = 6;
    int defaultArray[] = {2, 4, 5, 6, 877, 1,8,7,6,15,31,4,8};

    System.out.println(linearSearch(defaultArray, findNumber));
    System.out.println(binarySearch(defaultArray, findNumber));
    selectionSort(defaultArray);
  }

  private static boolean linearSearch(int[] array, int searchNumber) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == searchNumber) return true;
    }
    return false;
  }

  private static boolean binarySearch(int[] array, int searchNumber) {
    int low = 0;
    int middle = array.length / 2;
    int high = array.length;

    while (low <= high) {
      if (array[middle] == searchNumber) return true;
      else if (array[middle] < searchNumber) {
        low = middle + 1;
      }
      else{
        high = middle - 1;
      }
      middle = (low + high) / 2;
    }
    return false;
  }

  private static void bubbleSort(int array[]) {
    boolean hasSwap = true;
    while (hasSwap) {
      hasSwap = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          int t = array[i];
          array[i] = array[i + 1];
          array[i + 1] = t;
          hasSwap = true;
        }
      }
    }
  }

  private static void selectionSort(int array[]) {
    for (int i = 0; i < array.length - 1 ; i++) {
       int min = i;
       for(int j = i + 1; j < array.length; j++) {
         if (array[j] < array[min]) {
           min = j;
         }
       }
       if(min != i) {
         int t = array[i];
         array[i] = array[min];
         array[min] = t;
       }
    }
  }

}
