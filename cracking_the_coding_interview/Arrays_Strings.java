package c_arr;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //allUnique();
    //permutation();
    //urlify()
    //oneAway();
    //compression();
  }

  //6 - quite good
  private static String compression() {
    String sentence = "aabcccccaaa ";

    int count = 1;
    StringBuilder answer = new StringBuilder();
    for(int i = 0 ; i < sentence.length() - 1; i++) {
      if(sentence.charAt(i) == sentence.charAt(i+1))
        count++;
      else {
        answer.append(sentence.charAt(i));
        answer.append(count);
        count = 1;
      }
    }
    if(sentence.length() == answer.length())
      return sentence;
    else
      return String.valueOf(answer);
  }

  //5 - needs improvement a lot
  private static boolean oneAway() {
    String base = "pale";
    String change = "bake";

    int check;
    int counter = 0;

    for (int i = 0 ; i < base.length(); i++) {
      check = 0;
      for(int j = 0 ; j < change.length(); j++) {
        if(base.charAt(i) == change.charAt(j)) {
          check++;
        }
      }
      if(check > 0)
        counter++;
    }

    return counter == change.length() ||
      counter - 1 == change.length() ||
      counter + 1 == change.length();

  }

  //3 - quite good
  private static String urlify() {
    String sentence = "Mr John Smith";
    char[] word = sentence.toCharArray();

    int spaces = 0;
    for(char el: word){
      if (el == ' ')
        spaces++;
    }

    if(spaces == 0)
      return sentence;
    else {
      int index = 0;
      char[] answer = new char[sentence.length() + spaces * 3];
      for(char el: word) {
        if(el == ' ') {
          answer[++index] = '%';
          answer[++index] = '2';
          answer[++index] = '0';
        }
        else
          answer[++index] = el;
      }
      return String.valueOf(answer);
    }
  }

  //2 - quite good
  private static boolean permutation() {
    String a = "Cow";
    String b = "woC";

    int firstLength = a.length();
    int secondLength = b.length();

    if (firstLength != secondLength) {
      return false;
    }
    for (int i = 0; i < firstLength; i++) {
      if (a.indexOf(i) != b.indexOf(firstLength - i)) {
        return false;
      }
    }
    return true;
  }

  // 1 - needs improvement
  private static boolean allUnique() {
    String sentence = "dcba";
    char[] words = sentence.toCharArray();

    Arrays.sort(words);
    for (int i = 0; i < words.length - 1; i++) {
      if (words[i] == words[i + 1]) {
        return false;
      }
    }
    return true;
  }

}
