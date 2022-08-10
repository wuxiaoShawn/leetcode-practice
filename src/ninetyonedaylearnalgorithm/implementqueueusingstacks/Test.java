package ninetyonedaylearnalgorithm.implementqueueusingstacks;

import java.util.Arrays;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.implementqueueusingstacks
 * @ClassName: Test
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/19 16:49
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        System.out.println(myQueue.toString());
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.toString());
        //myQueue.peek(); // return 1
        System.out.print(myQueue.peek());
        System.out.println(myQueue.toString());
        //myQueue.pop(); // return 1, queue is [2]
        System.out.print(myQueue.pop());
        System.out.println(myQueue.toString());
        ////myQueue.empty(); // return false
        System.out.print(myQueue.empty());
        System.out.println(myQueue.toString());

    }

}