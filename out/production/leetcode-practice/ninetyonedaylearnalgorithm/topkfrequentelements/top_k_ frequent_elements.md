# 347. Top K Frequent Elements
**Thinking:**
1. hash表记录数字出现的次数
2. 堆实现的优先队列按照从大到小排序
3. 放入数组

```java
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //hash表
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) +1);
        }
        //优先队列
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (m,n)->m[1] - n[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            //pq.size()小于k时，直接存入排序，存满了与顶上的数比较
            if (pq.size() == k){
                if (pq.peek()[1] < count){
                    pq.poll();
                    pq.offer(new int[]{num,count});
                }
            }else {
                pq.offer(new int[]{num,count});
            }
        }
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = pq.poll()[0];
        }
        return ret;

    }

}
```
> Time  Complexity O(Nlogk) O(logk) 为优先队列开支
> Space Complexity O(N) hash表开支