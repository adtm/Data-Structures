package c_linked_list;


public class Main {
  public static void main(String[] args) {
    LinkedList l1 = new LinkedList(9);
    l1.add(7);
    l1.add(9);

    LinkedList l2 = new LinkedList(6);
    l2.add(8);
    l2.add(5);

    System.out.println(l1.palindrome(l1.head));
  }

  private static void sumList(LinkedList l1, LinkedList l2) {

    int left_sum = 0;
    while ( l1.head != null ||  l2.head != null) {

      int sum = ((l1.head != null) ? l1.head.data : 0)
        + ((l2.head != null) ? l2.head.data : 0)
        + left_sum;

      if (sum >= 10) {
        left_sum = 1;
        sum -= 10;
      } else {
        left_sum = 0 ;
      }

      System.out.println(sum);
      if ( l1.head.next == null && l2.head.next == null)
        System.out.println(left_sum);


      if (l1.head != null) {
        l1.head = l1.head.next;
      }

      if (l2.head != null) {
        l2.head = l2.head.next;
      }

    }

  }


}
