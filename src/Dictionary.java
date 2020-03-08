public interface Dictionary {

    boolean isEmpty();
    boolean add(int key, int value);
    boolean remove(int key);
    boolean get(int key, int value);
    boolean contains(int key);
    void traverse();
}
