## Finish contains(key) and remove(key) for the ArrayDictionary class with tests (20pt)

### (10pt) Finish the following functions for the ArrayDictionary

```java
    // Delete the entry with the given key from the dictionary
    // Return true if an entry is deleted, false otherwise
    @Override
    public boolean remove(int key) {
        // homework
        return false;
    }

    // Return true when the dictionary contains an entry
    // with the key
    @Override
    public boolean contains(int key) {
        // homework
        return false;
    }
```


### (10pt) Add unit tests for remove(key) and contains(key)

#### For contains(key), the following cases are required:

set 1:
- empty dictionary<int, int>, contain returns false with key -1 
- empty dictionary<int, int>, contain returns false with key 0 
- empty dictionary<int, int>, contain returns false with key 1 

set 2:
- dictionary<int, int>, capacity 1, init values {0:103}, key=2 returns false 
- dictionary<int, int>, capacity 1, init values {0:103}, key=0 returns true 

set 3:
- dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=0 returns true 
- dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=1 returns true 
- dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=2 returns false 
- dictionary<int, int>, capacity 2, init values {0:103, 1:105}, key=3 returns false 

set 4:
- dictionary<int, int>, capacity 3, init values {0:103, 1:105}, key=3 returns false 
- dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206}, key=1 returns true 

set 5:
- dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=1 returns true 
- dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=4 returns true 
- dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=7 returns false 
- dictionary<int, int>, capacity 3, init values {0:103, 1:105, 2:206, 4:407}, key=8 returns false 

#### For remove(key), the following cases are required:

- empty dictionary
- key exists in a dictionary that has no collision
- key does not exists in a dictionary that has no collision
- key exists in a dictionary that has collision, key is in the collision.
- key exists in a dictionary that has collision, key is not in the collision.
- key does not exists in a dictionary that has collision.
