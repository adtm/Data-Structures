package array;

public class Main {
  public static void main(String[] args) {
    int[] arr = {2,1,3,3,2};
    int n = arr.length;

    int odd = getOddOccurences(arr);
    System.out.println(odd);
  }

  private static int deleteElement(int key, int[] arr, int n ) {
    int loc = findElement(key, arr, n);
    if (loc == -1) {
      System.out.println("Error, try again..");
      return n;
    }

    for (int i = loc;i < n -1; i++) {
      arr[i] = arr[i+1];
    }
    return n-1;
  }

  private static int findElement (int key, int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  private static int searchBinary(int key, int[] arr, int low, int high) {
    int mid = (high + low) / 2;
    if(arr[mid] == key) {
      return mid;
    } else if (key > arr[mid]) {
      return searchBinary(key, arr, mid + 1, high);
    }
    return searchBinary(key, arr, low, mid - 1);
  }

  private static int insertSorted(int key, int[] arr, int n) {

    int i;
    for (i = n - 1; (arr[i] > key && i >= 0); i--) {
      arr[i+1] = arr[i];
    }
    arr[i+1] = key;
    return n+1;
  }

  private static int getOddOccurences(int arr[]) {
    int res = 0;
    for(int i = 0 ; i < arr.length; i++) {
      res = res ^ arr[i];
    }
    return res;
  }

}
