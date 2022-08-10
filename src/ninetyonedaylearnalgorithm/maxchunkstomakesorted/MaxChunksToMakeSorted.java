package ninetyonedaylearnalgorithm.maxchunkstomakesorted;

import java.util.Stack;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.maxchunkstomakesorted
 * @ClassName: MaxChunksToMakeSorted
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/20 19:19
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        int currMax = arr[0];
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= stack.peek()){
                stack.push(arr[i]);
                currMax = arr[i];
            }else {
                stack.pop();
                while (!stack.empty()){
                    if (arr[i]>=stack.peek()){
                        stack.push(currMax);
                        break;
                    }
                    stack.pop();//merge
                }
                if (stack.empty()){
                    stack.push(currMax);
                }
            }
        }

        return stack.size();
    }

}