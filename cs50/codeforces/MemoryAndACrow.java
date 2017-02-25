package codeforces;

import java.util.Scanner;

public class MemoryAndACrow {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = in.nextInt();
    }
    for (int i = 0; i < n - 1; i++) {
      int currentNumberSum = array[i];
      currentNumberSum += array[i+1];
      System.out.print(currentNumberSum + " ");
    }
    System.out.print(" " + array[n-1]);
  }

}
