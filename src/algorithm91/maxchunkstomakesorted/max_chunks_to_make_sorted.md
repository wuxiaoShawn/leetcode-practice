# 768. Max Chunks To Make Sorted II
**Thinking:**
1. Assuming there are already those maximum partitions, what features are in these partitions?
   1. The minimum value in the latter partition is greater than the maximum value in the previous partitions.
   2. based on above,we have a stack storage the biggest number in each partition and ensure the condition above.
2. How could we make it?
   1. iterate array,if `arr[i] >= stack.peek()`,`arr[i]` can be one of the latter partition. 
   2. if not, compare to each number in stack if the number bigger than `arr[i]`: `stack.pop()`,till any number is smaller,each `stack.pop()`means partitions which the numbers represent has been merged
```java
public class Solution {
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
```
> Time Complexity O(n^2)
> Space Complexity O(1)