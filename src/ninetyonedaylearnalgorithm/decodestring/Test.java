package ninetyonedaylearnalgorithm.decodestring;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.decodestring
 * @ClassName: Test
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/18 19:05
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Test {
    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString.decodeString(s));
    }

}