package problems.validparentheses;

/**
 * @ProjectName: leetcode-practice
 * @Package: problems.validparentheses
 * @ClassName: ValidParentheses
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/6/30 22:25
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class ValidParentheses {

    public static boolean isValid(String s) {
        int length = s.length()/2 ;
        for (int i = 0; i < length; i++) {
            s = s.replace("()","").replace("[]","").replace("{}","");
        }
        return s.length() == 0;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}