package week2;

import java.util.Scanner;

public class Vigenere {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String keyword = inputKeyword(input);

    if (!checkIfLetterInput(keyword)) return;

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

  private static String cypherWord(String word, String keyword) {

    int keywordValueArray[] = putKeywordValues(keyword);

    int index = 0;
    String encryptedAnswer = "";
    for (int i = 0; i < word.length(); i++) {
      char digit;
      char currentCharacter = word.charAt(i);

      if (checkIfIsLetterOneCharacter(currentCharacter)) {
        digit = (char) (currentCharacter + keywordValueArray[index] % 26);

        if (!Character.isLetter(digit)) {
          digit = (char) ('a' + (keywordValueArray[index] -
            (26 - getCharValueInAlphabet(currentCharacter))) % 26);
        }
        index++;
      } else {
        digit = (word.charAt(i));
      }

      encryptedAnswer += digit;
      if (index == keyword.length()) index = 0;
    }

    return encryptedAnswer;
  }

  private static int[] putKeywordValues(String keyword) {
    int keywordValueArray[] = new int[keyword.length()];
    for (int j = 0; j < keyword.length(); j++) {
      keywordValueArray[j] = getCharValueInAlphabet(keyword.charAt(j));
    }
    return keywordValueArray;
  }

  private static boolean checkIfIsLetterOneCharacter(char letter) {
    return Character.isLetter(letter);
  }

  private static int getCharValueInAlphabet(char checkingWord) {
    int valueChecker = 0;
    for (char i = 'a'; i <= 'z'; i++) {
      valueChecker++;
      if (checkingWord == i) {
        return valueChecker - 1;
      }
    }
    return 0;
  }
}
