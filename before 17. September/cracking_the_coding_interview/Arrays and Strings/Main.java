package c_arr;

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    //System.out.println(allUnique());
    //System.out.println(permutation());
    //urlify()
    //oneAway();
    //compression();
    //rotateMatrix();
    //zeroMatrix();
    //System.out.println(rotationCheck("cow", "owc"));
  }

  // 9 - looks good
  private static boolean rotationCheck(String a, String b) {
    return (a.length() == b.length() && (b+b).contains(a));
  }

  //8 - looks ok
  private static void zeroMatrix() {
    final int N = 3;
    int[][] arr = new int[][]{
      {1,2,3},
      {4,0,5},
      {5,6,7}
    };

    boolean[] rows = new boolean[N];
    boolean[] column = new boolean[N];
    findZeroElements(rows, column, arr);

    for(int i = 0; i < rows.length; i++)
      if (rows[i])
        nulifyRows(arr,i);

    for(int i = 0; i < column.length; i++)
      if(column[i])
        nulifyColumn(arr, i);
  }

  private static void findZeroElements(boolean[] rows, boolean[] column, int[][] arr) {
    for(int i = 0; i < rows.length; i++)
      for(int j = 0; j < column.length; j++)
        if(arr[i][j] == 0) {
          rows[i] = true;
          column[i] = true;
        }
  }

  private static void nulifyColumn(int[][] arr, int i) {
    for(int j = 0; j < arr[0].length; j++)
      arr[j][i] = 0;
  }

  private static void nulifyRows(int[][] arr, int i) {
    for(int j = 0; j < arr.length; j++)
      arr[i][j] = 0;
  }


  // 7 - can I do in place?
  private static void rotateMatrix() {
    final int N = 4;
    int[][] arr = new int[][]{
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12},
      {13,14,15,16}
    };

    int[][] rev = new int[N][N];
    for(int i = 0; i < N; i++) {
      for(int j = 0 ; j < N; j++) {
        rev[j][N-i-1] = arr[i][j];
      }
    }
  }

  //6 - looks good
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

  //3 - looks good
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

  //1 - improved
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
