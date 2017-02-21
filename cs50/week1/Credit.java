package com.week1;

/**
 * Created by Tomas on 2/21/2017.
 */
public class Credit {
  public static void main(String[] args) {
    String creditName = "378282246310005";

    int sum = 0;
    for (int i = 0; i < creditName.length(); i++) {
      if (Character.isDigit(creditName.charAt(i))) {
        int number = Integer.parseInt(String.valueOf(creditName.charAt(i)));
        if (i % 2 == 0) {
          sum += number;
        } else {
          number *= 2;
          while (number > 0) {
            sum += number % 10;
            number = number / 10;
          }
        }
      }
    }
    if (sum % 10 == 0){
      System.out.println("Card is valid");
    } else {
      System.out.println("Card is invalid");
    }
  }
}
