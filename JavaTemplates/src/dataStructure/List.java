package dataStructure;

/**
 * Created by Tim Kilian on 3/30/16.
 */
public interface List<T> {
    void push(T element);
    void add(T element, int pos);
    boolean contains(T element);
    T get(int pos);
    T remove(T element);
    T remove(int pos);
    T pop();
    int size();
}

// TODO
public class ArrayList<T> implements List<T> {
    int growth=2;
    int capacity=4;
    int cardinality=0;
    T[] arr;
    ArrayList() { arr = new T[capacity]; }
    public void push(T element) { arr[cardinality++] = element; }
    public void add(T element, int pos) { assert positionOk(pos); arr[pos] = element; }
    public boolean contains(T element) { for (T e : arr) if (e.equals(element)) return true; return false; }
    public T get(int pos) { assert positionOk(pos); return arr[pos]; }
    public T remove(T element) { for (T e : arr) if (e.equals(element)) }
    public T remove(int pos);
    public T pop();
    public int size() { return cardinality; }
    private boolean positionOk(int pos) { return pos<=cardinality && pos >= 0; }
}
