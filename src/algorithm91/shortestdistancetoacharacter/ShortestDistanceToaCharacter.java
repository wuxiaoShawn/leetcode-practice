package algorithm91.shortestdistancetoacharacter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.shortestdistancetoacharacter
 * @ClassName: ShortestDistanceToACharacter
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/16 10:46
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 * 思路：
 * 记录c的下标存入数组
 * 遍历相减取最小绝对值
 **/
public class ShortestDistanceToaCharacter {
    public static int[] shortestToChar(String s, char c) {
        char[] chars = s.toCharArray();
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c){
                index.add(i);
            }

        }
        int[] ret = new int[chars.length];
        int minAbs = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < index.size(); j++) {
                if (j ==0){
                    //再次初始化
                    minAbs = Math.abs(index.get(j) - i);
                    continue;
                }
                minAbs = Math.min(Math.abs(index.get(j) - i), minAbs);

            }
            ret[i] = minAbs;

        }
        return ret;

    }

    public static void main(String[] args) {
        String s = "loveleetcode";
            char c = 'e';
        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }

}