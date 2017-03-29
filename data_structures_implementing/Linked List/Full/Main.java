package data;

public class Main {
  public static void main(String[] args) {
    LinkedList linkedList1 = new LinkedList(2);
    linkedList1.push(5);
    linkedList1.push(13);

    LinkedList linkedList2 = new LinkedList(1);
    linkedList2.push(4);
    linkedList2.push(9);

    LinkedList linkedList3 = mergeLists(linkedList1,linkedList2);
    linkedList3.traverse();
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
}
