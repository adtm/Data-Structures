package week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vigenere {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String keyword = inputKeyword(input);

    if(!checkIfLetterInput(keyword)) return;

    String word = inputWord(input);

    System.out.println("ciphered: \n" + cypherWord(word, keyword));
  }


  private static String inputKeyword(Scanner input) {
    System.out.println("Enter keyword: ");
    return input.nextLine();
  }

  private static String inputWord(Scanner input) {
    System.out.println("Enter word: ");
    return input.nextLine();
  }

  private static boolean checkIfLetterInput(String keyword) {
    for (int i = 0; i < keyword.length(); i++)
      if (!Character.isLetter(keyword.charAt(i))) return false;
    return true;
  }

  private static String cypherWord(String word, String keyword){

    int valueChecker;
    List<Integer> keywordIndexValues = new ArrayList<>();
    for (int j = 0; j < keyword.length(); j++) {
      valueChecker = 0;
      for(char i = 'a'; i <= 'z'; i++) {
        valueChecker++;
        if (keyword.toLowerCase().charAt(j) == i) {
          keywordIndexValues.add(valueChecker - 1);
        }
      }
    }

    int counter = 0;
    int valueInPoints = 0;
    String encryptedAnswer = "";
    for (int i = 0; i < word.length(); i++) {

      if(counter == keyword.length()) counter = 0;

      char digit;
      if (Character.isLetter(word.charAt(i))){
        digit = (char) (word.charAt(i) + keywordIndexValues.get(counter) % 26);
        if(!Character.isLetter(digit)){


          valueChecker = 0;
          for(char z = 'a'; z <= 'z'; z++) {
            valueChecker++;
            if (word.charAt(i) == z) valueInPoints = valueChecker;
          }

          digit = (char) ( 'a' + (keywordIndexValues.get(counter) - (27-valueInPoints)) % 26);
          System.out.println(keywordIndexValues.get(counter) + " " + (26-valueInPoints));
        }
        counter++;
      } else {
        digit = (word.charAt(i));
      }
      encryptedAnswer += digit;
    }
    return encryptedAnswer;
  }

}
