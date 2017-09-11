package hackerrank.binarySearchTree;

/**
 * Created by Tomas on 3/8/2017.
 */
public interface Tree<T extends Comparable> {
  public boolean isEmpty();
  public int cardinality();
  public boolean member(T el);
  public NonEmptyBST<T> add(T el);
}
