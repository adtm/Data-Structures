package single;

public class Main {
  public static void main(String[] args) {
    LinkedList linkedList1 = new LinkedList(1);
    linkedList1.push(2);
    linkedList1.push(7);

    LinkedList linkedList2 = new LinkedList(1);
    linkedList2.push(2);
    linkedList2.push(8);

    System.out.println();
    Node intersectionSortedNode = linkedList1.intersectionSorted(linkedList2.head);
    while (intersectionSortedNode != null) {
      System.out.println(intersectionSortedNode.data);
      intersectionSortedNode = intersectionSortedNode.next;
    }
  }

  /*
  * For Merging Sorted Lists Helper Functions
  * */
  private static LinkedList mergeLists(LinkedList l1, LinkedList l2) {

    Node root1 = l1.head;
    Node root2 = l2.head;

    LinkedList mergeList = new LinkedList();

    while (root1 != null  && root2 != null) {
      if (root1.data < root2.data) {
        mergeList.push(root1.data);
        root1 = root1.next;
      } else{
        mergeList.push(root2.data);
        root2 = root2.next;
      }
    }

    while (root1 != null) {
      mergeList.push(root1.data);
      root1 = root1.next;
    }

    while (root2 != null) {
      mergeList.push(root2.data);
      root2 = root2.next;
    }

    return mergeList;
  }

  public static LinkedList mergeSum(LinkedList l1, LinkedList l2) {

    LinkedList merge = new LinkedList();
    int carry = 0;
    int sum = 0;

    while (l1.head != null || l2.head != null) {

      sum = carry +
        ((l1.head != null) ? l1.head.data : 0)
      + ((l2.head != null) ? l2.head.data : 0);

      carry = (sum >= 10) ? 1 : 0;
      sum = sum % 10;
      merge.push(sum);

      if (l1.head != null) {
        l1.head = l1.head.next;
      }

      if (l2.head != null) {
        l2.head = l2.head.next;
      }
    }

    if (carry >= 1) {
      merge.push(sum);
    }
    return merge;
  }

}
