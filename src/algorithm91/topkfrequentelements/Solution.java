package algorithm91.topkfrequentelements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.topkfrequentelements
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/8/3 19:57
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 * 1. hash表记录数字出现的次数
 * 2. 堆实现的优先队列按照从大到小排序
 * 3. 放入数组
 **/
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