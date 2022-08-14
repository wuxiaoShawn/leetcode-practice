# 1381. Design a Stack With Increment Operation

**思路：**
1. 用数组来存储数据
2. 用指针模拟栈的操作
```java
public class CustomStack {

    int[] stack;
    int index;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        index = 0;
    }

    public void push(int x) {
        if(index < stack.length){
            stack[index]=x;
            index ++;
        }
    }

    public int pop() {
        int ret = index - 1 <0? -1:stack[index - 1];
        if (ret != -1){
            index --;
        }
        return ret;
    }

    public void increment(int k, int val) {
        k = Math.min(k, index);
        for (int i = 0; i < k; i++) {
            stack[i] += val;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < index; i++) {
            if (i == index -1){
                sb.append(stack[i]);
            }else {
                sb.append(stack[i]+",");
            }


        }
        sb.append("]");
        return sb.toString();
        //return Arrays.toString(stack);
    }
}
```
>时间复杂度：O(n)
>空间复杂度：O(1)