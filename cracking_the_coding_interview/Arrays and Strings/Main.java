package c_arr;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    //System.out.println(allUnique());
    System.out.println(permutation());
    //urlify()
    //oneAway();
    //compression();
    //rotateMatrix();
  }

  // 7 - need improvement
  private static void rotateMatrix() {

    final int N = 4;
    int[][] arr = new int[][]{
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12},
      {13,14,15,16}
    };

    // easy method
    int[][] rev = new int[N][N];
    for(int i = 0; i < N; i++) {
      for(int j = 0 ; j < N; j++) {
        rev[i][j] = arr[j][i];
        System.out.print(rev[i][j] + " ");
      }
      System.out.println();
    }
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

  //2 - improved
  private static boolean permutation() {
    String a = "Doge";
    String b = "Dogs";

    if (a.length() != b.length()) {
      return false;
    }

    int[] letters = new int[256];
    for(char el: a.toCharArray())
      letters[el]++;

    for(int i = 0; i < b.length(); ++i) {
      int c = (int) b.charAt(i);
      if( --letters[c] < 0)
        return false;
    }
    return true;
  }

  // 1 - improved
  private static boolean allUnique() {
    String sentence = "dcbaa";
    HashMap <Character, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < sentence.length(); ++i) {
      if(!hashMap.containsKey(sentence.charAt(i))) {
        hashMap.put(sentence.charAt(i), 1);
      } else {
        return false;
      }
    }
    return true;
  }
}
