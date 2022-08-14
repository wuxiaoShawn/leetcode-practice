package algorithm91.lrucache;

import java.util.LinkedHashMap;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.lrucache
 * @ClassName: LRUCache
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/26 17:20
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing  Least Recently Used (LRU) cache.
 **/
public class LRUCache {
    int capacity;
    LinkedHashMap<Integer,Integer> cache = new LinkedHashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)){
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        //key exists,replace value
        if (cache.containsKey(key)){
            //modify value
            cache.put(key,value);
            makeRecently(key);
            return;
        }
        if (cache.size() >= this.capacity){
            Integer oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        cache.put(key,value);

    }

    public void makeRecently(int key){
        //获取到node
        int val = cache.get(key);
        //删除key,重新尾插
        cache.remove(key);
        cache.put(key,val);

    }

}