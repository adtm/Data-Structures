package array;

public class Main {
  public static void main(String[] args) {
    int[] arr = {1,1,1,2,2};

    System.out.println(majority(arr, 1));
  }

  private static int deleteElement(int key, int[] arr, int n) {
    int loc = findElement(key, arr, n);
    if (loc == -1) {
      System.out.println("Error, try again..");
      return n;
    }

    for (int i = loc; i < n - 1; i++) {
      arr[i] = arr[i + 1];
    }
    return n - 1;
  }

  private static int findElement(int key, int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  private static int searchBinary(int key, int[] arr, int low, int high) {
    int mid = (high + low) / 2;
    if (arr[mid] == key) {
      return mid;
    } else if (key > arr[mid]) {
      return searchBinary(key, arr, mid + 1, high);
    }
    return searchBinary(key, arr, low, mid - 1);
  }

  private static int insertSorted(int key, int[] arr, int n) {

    int i;
    for (i = n - 1; (arr[i] > key && i >= 0); i--) {
      arr[i + 1] = arr[i];
    }
    arr[i + 1] = key;
    return n + 1;
  }

  private static int getOddOccurences(int arr[]) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      res = res ^ arr[i];
    }
    return res;
  }

  private static void searchInRotatedArray(int arr[], int n, int key) {
    int pivot = findPivot(arr, 0, n - 1);

    try {
      if (key == arr[pivot]) {
        System.out.println(pivot);
      } else if (key > arr[0]) {
        System.out.println(searchBinary(key, arr, arr[0], arr[pivot])); // pivot - 1 ?
      } else {
        System.out.println(searchBinary(key, arr, arr[pivot + 1], arr[n - 1]));
      }
    } catch (Exception e) {
      System.out.println("-1");
    }

  }

  private static int findPivot(int arr[], int low, int high) {

    if (high < low) return -1;
    if (high == low) return low;

    int medium = (high + low) / 2;
    if (medium < high && arr[medium] > arr[medium + 1]) {
      return medium;
    }
    if (medium > low && arr[medium] < arr[medium - 1]) {
      return medium - 1;
    }
//    if(arr[low] >= arr[medium]) { // ?
//      return findPivot(arr,low, medium -1 );
//    }
    return findPivot(arr, medium - 1, high);

  }

  private static void reverseArray(int arr[]) {
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[(arr.length - 1) - i];
      arr[(arr.length - 1) - i] = temp;
    }
    for (int el : arr) {
      System.out.print(el + " ");
    }

  }

  private static void rotateByAmount(int arr[], int turns) {
    for (int i = 0; i < turns; i++) {
      leftRotate(arr);
    }

    for (int el : arr) {
      System.out.print(el + " ");
    }
  }

  private static void leftRotate(int[] arr) {
    int temp = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
      arr[arr.length - 1] = temp;


  }

  private static void reverseParts(int[] arr, int d) {
    rotate(arr, 0, d-1);
    rotate(arr, d, arr.length - 1);
    rotate(arr, 0, arr.length - 1);

    for (int el: arr) {
      System.out.println(el);
    }

  }

  private static void rotate(int[] arr, int start, int end) {

    int temp;
    while (start < end ) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }

  }

  private static void maxSumExcludingAdjacent(int[] arr) {

    int incl = arr[0];
    int excl = 0;
    int excl_new;

    int answer = 0;
    for (int i = 1 ; i < arr.length ; i++) {

      excl_new = incl > excl ? incl : excl;

      incl = excl + arr[i];
      excl = excl_new;

      answer = incl > excl ? incl : excl;
    }
    System.out.println(answer);
  }

  private static void leadersInArray(int[] arr) {
    int max = 0; // for demo purposes
    for(int i = arr.length - 1 ; i > 0 ; i--) {
      if(arr[i] > max) {
        max = arr[i];
        System.out.println(arr[i]);
      }
    }

  }

  private static void inversionCount(int[] arr ){
    int count = 0;
    for (int i = 0; i < arr.length; i++ ) {
      for (int j = i; j < arr.length; j++ ) {
        if(arr[i] > arr[j])
          count++;
      }
    }
    System.out.println(count);
  }

  private static boolean isPrime(int number) {
    if(number < 2) return false;
    for (int i = 2; i*i <= number; i++) {
      if(number % i == 0) return false;
    }
    return true;
  }

  private static void latestMin(int arr[]) {
    int first,
        second;

    first = second = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length; ++i) {
      if (arr[i] < first)
        first = arr[i];
      else if (arr[i] < second)
        second = arr[i];
    }
    System.out.println(first + " " + second);
  }

  private static boolean majority(int[] arr, int key) {
    int index = binarySearch(arr, 0, arr.length, key);

    if ((index + arr.length / 2 <= arr.length - 1) && (arr[index + arr.length / 2] == key))
      return true;

    return false;
  }

  private static int binarySearch(int[] arr, int min, int high, int key) {

    int result = -1;
    while (high >= min) {
      int mid = (min + high) / 2;
      if ( arr[mid] == key ) {
        result = mid;
        high = mid - 1;
      }
      else if (arr[mid] < key)
        min = mid + 1;
      else
        high = mid - 1;
    }
    return result;
  }

}
