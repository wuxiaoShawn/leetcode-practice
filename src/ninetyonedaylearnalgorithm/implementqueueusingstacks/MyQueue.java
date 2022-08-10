package ninetyonedaylearnalgorithm.implementqueueusingstacks;

import java.util.Stack;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.implementqueueusingstacks
 * @ClassName: ImplementQueueUsingStacks
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/19 16:28
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class MyQueue {
    private Stack<Integer> stack;
    private Stack<Integer> tempStack;
    public MyQueue() {
        stack = new Stack<>();
        tempStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        int popInt = 0;
        while (stack.size() != 0){
            if (stack.size() == 1){
                popInt =  stack.pop();
            }else {
                tempStack.push(stack.pop());
            }

        }
        while (tempStack.size() != 0){
            stack.push(tempStack.pop());
        }
        return popInt;
    }

    public int peek() {
        int peekInt = 0;
        while (stack.size() != 0){
            if (stack.size() == 1){
                peekInt =  stack.peek();
            }
            tempStack.push(stack.pop());

        }
        while (tempStack.size() != 0){
            stack.push(tempStack.pop());
        }

        return peekInt;
    }

    public boolean empty() {
        return stack.empty();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (stack.size() != 0){

            tempStack.push(stack.pop());

        }
        while (tempStack.size() != 0){
            if (tempStack.size() == 1){
                sb.append(tempStack.peek());
            }else {
                sb.append(tempStack.peek()).append(",");
            }
            stack.push(tempStack.pop());
        }
        sb.append("]");
        return sb.toString();
    }
}