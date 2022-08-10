package problems.romantointeger;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: leetcode-practice
 * @Package: problems.romantointeger
 * @ClassName: RomanToInteger
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/6/28 22:05
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] array = s.toCharArray();
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1){
                j += map.get(array[i]);
                return j;
            }
            char c = array[i];

            if (map.get(array[i] )< map.get(array[i+1])){
                j -= map.get(array[i]);
            }else {
                j += map.get(array[i]);
            }
        }

        return j;
    }

    public static void main(String[] args) {
        int iii = romanToInt("MCMXCIV");
        System.out.println(iii);
    }

}