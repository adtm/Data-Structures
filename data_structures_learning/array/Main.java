package array;

public class Main {
  public static void main(String[] args) {
    int[] arr = {3 ,1, 2};
    int n = arr.length;

    searchInRotatedArray(arr, n, 4);
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

  private static void searchInRotatedArray(int arr[], int n, int key) {
    int pivot = findPivot(arr, 0, n - 1);

    try {
      if(key == arr[pivot]) {
        System.out.println(pivot);
      } else if (key > arr[0]) {
        System.out.println(searchBinary(key, arr, arr[0], arr[pivot -1] ));
      } else {
        System.out.println(searchBinary(key, arr, arr[pivot + 1], arr[n-1]));
      }
    } catch (Exception e) {
      System.out.println("-1");
    }

  }

  private static int findPivot(int arr[], int low, int high) {

    if (high < low) return -1;
    if (high == low) return low;

    int medium = (high + low) / 2;
    if(medium < high && arr[medium] > arr[medium + 1]) {
      return medium;
    }
    if(medium > low && arr[medium] < arr[medium - 1]) {
      return medium - 1;
    }
    if(arr[low] >= arr[medium]) {
      return findPivot(arr,low, medium -1 );
    }
    return findPivot(arr, medium - 1, high);

  }


}
