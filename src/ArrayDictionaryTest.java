import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo_1() {
        int testSize = 8;
        ArrayDictionary dict = new ArrayDictionary(testSize);

        for (int i = 0; i < testSize-2; i++) {
            assertTrue(dict.add(i, i + 80));
        }
        System.out.println(dict);
    }

    @Test
    public void demo_2() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);

        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(6, 86));
        System.out.println(dict);
    }

    @Test
    public void demo_3() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }
}