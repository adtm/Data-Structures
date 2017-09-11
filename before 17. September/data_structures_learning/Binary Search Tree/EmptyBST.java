package hackerrank.binarySearchTree;

/**
 * Created by Tomas on 3/8/2017.
 */
public class EmptyBST<T extends Comparable> implements Tree<T>{

  public EmptyBST(){

  }

  @Override
  public boolean isEmpty() {
    return true;
  }

  @Override
  public int cardinality() {
    return 0;
  }

  @Override
  public boolean member(T el) {
    return false;
  }

  @Override
  public NonEmptyBST<T> add(T el) {
    return new NonEmptyBST<T>(el);
  }
}
