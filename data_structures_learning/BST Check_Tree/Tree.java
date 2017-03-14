package hackerrank.bst;

public class Tree {
  public static void main(String[] args) {
    Node tree = new Node(5);
    tree.insert(3);
    tree.insert(8);



  }

  public boolean checkIfBST(Node root, int min, int max) {
    if (root == null)
      return true;
    if (root.data < min || max < root.data)
      return false;
    return checkIfBST(root.left, min, root.data - 1 ) &
      checkIfBST(root.right, root.data + 1, max);
  }

  public boolean checkIfBST(Node root){
    return checkIfBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }


}
