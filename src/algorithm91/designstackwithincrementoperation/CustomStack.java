package algorithm91.designstackwithincrementoperation;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.designstackwithincrementoperation
 * @ClassName: CustomStack
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/17 19:04
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
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
                sb.append(stack[i]).append(",");
            }


        }
        sb.append("]");
        return sb.toString();
        //return Arrays.toString(stack);
    }
}