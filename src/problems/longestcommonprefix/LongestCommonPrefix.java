package problems.longestcommonprefix;

/**
 * @ProjectName: leetcode-practice
 * @Package: problems.longestcommonprefix
 * @ClassName: LongestCommonPrefix
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/6/29 23:24
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0)return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){
                if(s.length()==0)return "";
                //公共前缀不匹配就让它变短！
                s=s.substring(0,s.length()-1);
            }
        }
        return s;

    }

}