package algorithm91.day31;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.day31
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/8/15 22:22
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
class Solution {
    public boolean judgeCircle(String moves) {
        int[] cnt = new int[26];
        for(char c : moves.toCharArray()) cnt[c-'A']++;
        return cnt['L'-'A']==cnt['R'-'A'] && cnt['U'-'A']==cnt['D'-'A'];
    }
}
