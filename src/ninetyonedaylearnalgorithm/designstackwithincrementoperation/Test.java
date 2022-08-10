package ninetyonedaylearnalgorithm.designstackwithincrementoperation;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.designstackwithincrementoperation
 * @ClassName: Test
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/17 19:24
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Test {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(3);
        customStack.push(1);
        customStack.push(2);                          // 栈变为  [1, 2]
        System.out.println(customStack.toString());
        customStack.pop();                            // 返回 2 --> 返回栈顶值 2，栈变为 [1]
        System.out.println(customStack.toString());
        customStack.push(2);                          // 栈变为 [1, 2]
        System.out.println(customStack.toString());
        customStack.push(3);                          // 栈变为 [1, 2, 3]
        System.out.println(customStack.toString());
        customStack.push(4);                          // 栈仍然是 [1, 2, 3]，不能添加其他元素使栈大小变为 4
        System.out.println(customStack.toString());
        customStack.increment(5, 100);                // 栈变为 [101, 102, 103]
        System.out.println(customStack.toString());
        customStack.increment(2, 100);                // 栈变为 [201, 202, 103]
        System.out.println(customStack.toString());
        customStack.pop();                            // 返回 103 --> 返回栈顶值 103，栈变为 [201, 202]
        System.out.println(customStack.toString());
        customStack.pop();                            // 返回 202 --> 返回栈顶值 202，栈变为 [201]
        System.out.println(customStack.toString());
        customStack.pop();                            // 返回 201 --> 返回栈顶值 201，栈变为 []
        System.out.println(customStack.toString());
        customStack.pop();                            // 返回 -1 --> 栈为空，返回 -1
        System.out.println(customStack.toString());

    }

}