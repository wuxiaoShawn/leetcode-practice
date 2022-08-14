package algorithm91.maxchunkstomakesorted;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.maxchunkstomakesorted
 * @ClassName: Test
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/20 21:23
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Test {
    public static void main(String[] args) {
        MaxChunksToMakeSorted maxChunksToMakeSorted = new MaxChunksToMakeSorted();
        int[] arr = new int[]{5,1,6,3,5,4,8,9,0,8};
        int i = maxChunksToMakeSorted.maxChunksToSorted(arr);
        System.out.println(i);
    }

}