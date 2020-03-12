import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        //System.out.println(dict);
    }

    @Test
    public void remove() {
        // homework

        //empty dictionary
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(!dict.remove(0));

        //key exists in a dictionary that has no collision
        testSize = 5;
        dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        assertTrue(dict.remove(7));

        //key does not exists in a dictionary that has no collision
        testSize = 5;
        dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        assertTrue(!dict.remove(2));

        //key exists in a dictionary that has collision, key is in the collision.
        testSize = 5;
        dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        assertTrue(dict.remove(2));
        assertTrue(dict.remove(7));
        assertTrue(!dict.remove(2)); //already removed
        assertTrue(!dict.remove(7)); //already removed

        //key exists in a dictionary that has collision, key is not in the collision.
        testSize = 5;
        dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        assertTrue(dict.remove(4));

        //key does not exists in a dictionary that has collision.
        testSize = 5;
        dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        assertTrue(!dict.remove(1));
    }

    @Test
    public void contains() {
        // homework
        //set 1:
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(!dict.contains(-1));
        assertTrue(!dict.contains(0));
        assertTrue(!dict.contains(1));

        //set 2:
        testSize = 1;
        dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(0, 103));
        assertTrue(!dict.contains(2));
        assertTrue(dict.contains(0));

        //set 3:
        testSize = 2;
        dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(0, 103));
        assertTrue(dict.add(1, 105));
        assertTrue(dict.contains(0));
        assertTrue(dict.contains(1));
        assertTrue(!dict.contains(2));
        assertTrue(!dict.contains(3));

        //set 4:
        testSize = 3;
        dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(0, 103));
        assertTrue(dict.add(1, 105));
        assertTrue(!dict.contains(3));
        assertTrue(dict.add(2, 206));
        assertTrue(dict.contains(1));

        //set 5:
        testSize = 3;
        dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(0, 103));
        assertTrue(dict.add(1, 105));
        assertTrue(dict.add(2, 206));
        assertTrue(dict.add(4, 407));
        assertTrue(dict.contains(1));
        assertTrue(dict.contains(4));
        assertTrue(!dict.contains(7));
        assertTrue(!dict.contains(8));

    }
}