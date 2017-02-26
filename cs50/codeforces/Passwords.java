package codeforces;

import java.util.Objects;

// not done
public class Passwords {
  public static void main(String[] args) {

//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int k = in.nextInt();
//    int array[] = new int[n];
//    for (int i = 0;i < n; i++ ) {
//      array[i] = in.nextInt(); // !change to string
//    }

    int n = 6; // password amount
    int k = 2; // penalty time
    String array[] = {"cba", "abc", "bb1", "abC", "ABC", "abc"};
    String answer = array[n - 1];

    // sort according to length
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        if (array[i].length() > array[j].length()) {
          String temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }

    // best case
    int bestTime = 0;
    int worstTime = 0;



    for (int i = 0; i < n - 1; i++) {
      if (answer.length() == array[i].length()) {

        if(!Objects.equals(answer,array[i])) {
          worstTime += 1;
          if (worstTime == k){
            worstTime += 5;
          }
        }


        if (Objects.equals(answer, array[i])) {
          System.out.println(worstTime);
          System.out.println(bestTime);
        }
      }
    }

    for (int i = 0; i < n - 1; i++) {
      System.out.println(array[i]);
    }


  }
}
