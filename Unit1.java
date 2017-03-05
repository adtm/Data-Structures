package cracking;

public class Unit1 {
  public static void main(String[] args) {
    System.out.println(power(2, 2));
    System.out.println(mod(2, 2));
    System.out.println(sqrt(49));

    int[] array = {1, 2, 3, 4};
    int[] copyArray = copyArray(array);
    for (int value: copyArray) {
      System.out.print(value + " ");
    }

    System.out.println(sumDigits(123456789));

  }

  // power( a, b)
  private static int power(int a, int b) {
    if (b < 0) {
      return 0; // error
    } else if (b == 0) {
      return 1;
    } else {
      return a * power(a, b - 1);
    }
  }

  // mod( a, b )
  private static int mod(int a, int b) {
    if (b <= 0) {
      return 1;
    }
    int div = a / b;
    return a - div * b;
  }

  // square root guesser
  private static int sqrt(int n) {
    return sqrt_helper(n, 1, n);
  }

  private static int sqrt_helper(int n, int min, int max) {
    if (min > max) {
      return 1;
    }
    int guess = (min + max) / 2;
    if (guess * guess == n) {
      return guess;
    } else if (guess * guess < n) {
      return sqrt_helper(n, guess + 1, max);
    } else {
      return sqrt_helper(n, min, guess - 1);
    }
  }

  private static int[] copyArray(int[] array) {
    int[] copy = new int[0];
    for (int value : array) {
      copy = appendToNew(copy, value);
    }
    return copy;
  }

  private static int[] appendToNew(int[] array, int value) {
    int[] bigger = new int[array.length + 1];
    for (int i = 0; i < array.length; i++) {
      bigger[i] = array[i];
    }

    bigger[bigger.length - 1] = value;
    return bigger;
  }

  private static int sumDigits(int n) {
    int sum = 0;
    while ( n > 0 ) {
      sum += n % 10;
      n = n / 10;
    }
    return sum;
  }


}
