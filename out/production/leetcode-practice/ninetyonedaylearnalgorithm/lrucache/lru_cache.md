# **146. LRU Cache**
**Thinking:**
> 1. 看了题目解析，具体实现不是很难，里边很多思想值得学习。
> 2. LRU 思想既要保证查询快，又要保证插入删除快，hash表+双向链表，只能是双列集合，一个用于快速确定位置，一个用于快速增删，具体实现LinkedHashMap才是要学习的。

```java
public class LRUCache {
    int capacity;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        //key exists,replace value
        if (cache.containsKey(key)) {
            //modify value
            cache.put(key, value);
            makeRecently(key);
            return;
        }
        if (cache.size() >= this.capacity) {
            Integer oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        cache.put(key, value);

    }

    public void makeRecently(int key) {
        //获取到node
        int val = cache.get(key);
        //删除key,重新尾插
        cache.remove(key);
        cache.put(key, val);

    }

}
```
> Time  Complexity O(1)
> Space Complexity O(1)