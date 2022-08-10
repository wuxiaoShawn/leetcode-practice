package problems.palindromenumber;

/**
 * @ProjectName: leetcode-practice
 * @Package: problems.palindromenumber2
 * @ClassName: PalindromeNumber
 * @Description: []
 * @Author: [Shawn Wu]
 * @Date: 2022/6/27 22:52
 * @Version: V1.0
 * @Copyright: 2021  Inc. All rights reserved.
 * @TODO: 注意, 本文件Shawn Wu 所作,如果转载或使用请标明具体出处!
 **/
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        char[] s = String.valueOf(x).toCharArray();
        int j = s.length / 2;
        if (s.length % 2 ==0){
            for (int i = 0; i < j; i++) {
                if (s[j - i -1] != s[j + i]){
                    return false;
                }
            }
        }else {
            for (int i = 1; i <= j; i++) {
                if (s[j -i] != s[j+i]){
                    return false;
                }
            }
        }
        System.out.println("true");
        return true;
    }
    public static boolean isPalindromeComment(int x) {
        //将数取反，判断相等
         if(x<0)
            return false;
        int rem=0,y=0;
        int quo=x;
        while(quo!=0){
            rem=quo%10;
            y=y*10+rem;
            quo=quo/10;
        }
        System.out.println(y==x);
        return y==x;

    }

    public static void main(String[] args) {
        isPalindromeComment(21);
        //isPalindrome(-121);
    }

}