package codeforces.sorting;

import java.util.Arrays;
import java.util.Scanner;

// done
public class OathOfTheNightWatch {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int answer = 0;
    int array[] = new int[n];

    int max = -1000000000;
    int min = 1000000000;
    for (int i = 0; i < n ; i++) {
      array[i] = in.nextInt();
      if(array[i] > max) max = array[i];
      if(array[i] < min) min = array[i];
    }

    Arrays.sort(array);
    for(int i = 1; i < n ;i++){
      if(array[i] > min && array[i] < max){
        answer++;
      }
    }
    System.out.println(answer);
  }
}

