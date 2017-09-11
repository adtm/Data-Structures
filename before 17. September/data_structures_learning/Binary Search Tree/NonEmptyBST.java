package hackerrank.binarySearchTree;

/**
 * Created by Tomas on 3/8/2017.
 */
public class NonEmptyBST<T extends Comparable> implements Tree<T> {

  T data;
  Tree<T> left;
  Tree<T> right;

  public NonEmptyBST(T el) {
    data = el;
    left = new EmptyBST();
    right = new EmptyBST();
  }

  public NonEmptyBST(T el, Tree<T> leftTree, Tree<T> rightTree) {
    data = el;
    left = leftTree;
    right = rightTree;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public int cardinality() {
    return 1 + left.cardinality() + right.cardinality();
  }

  @Override
  public boolean member(T el) {
    if (data == el) {
      return true;
    } else {
      if (el.compareTo(data) < 0) {
        return left.member(el);
      } else {
        return right.member(el);
      }
    }
  }

  @Override
  public NonEmptyBST<T> add(T el) {
    if (data == el) {
      return this;
    } else {
      if (el.compareTo(data) < 0) {
        return new NonEmptyBST<T>(data, left.add(el), right);
      } else {
        return new NonEmptyBST<T>(data, left, right.add(el));
      }
    }
  }
}

// Breadth First Search
// Depth First Search