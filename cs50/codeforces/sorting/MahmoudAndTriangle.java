package codeforces.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MahmoudAndTriangle {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int array[] = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = in.nextInt();
    }

    // bubble sort
    Arrays.sort(array);

    // algorithm
    for (int i = 0; i < n - 2; i++) {
      if (array[i] + array[i + 1] > array[i + 2]) {
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}
