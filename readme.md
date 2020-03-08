## Finish contain(key) and remove(key) for the ArrayDictionary class with tests (30pt)

### (15pt) Finish the following functions for the ArrayDictionary

```java
    // Delete the entry with the given key
    // Return true if an entry is deleted, false otherwise
    @Override
    public boolean remove(int key) {
        // homework
        return false;
    }

    // Return the entry value of the given key
    // Return null if no entry exists with the given key
    @Override
    public Integer get(int key) {
        // homework
        return null;
    }
```



### (15pt) Add unit tests for remove(key) and get(key)

#### For contain(key), the following cases are required:

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

#### For delete(key),  the following cases are required:

- empty dictionary
- key exists in a dictionary that has no collision
- key does not exists in a dictionary that has no collision
- key exists in a dictionary that has collision, key is in the collision.
- key exists in a dictionary that has collision, key is not in the collision.
- key does not exists in a dictionary that has collision.