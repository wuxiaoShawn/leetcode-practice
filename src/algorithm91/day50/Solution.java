package algorithm91.day50;

/**
 * @ProjectName: leetcode-practice
 * @Package: algorithm91.day50
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/9/2 23:15
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                ans = Math.max(ans, area(grid, i, j));
            }
        }
        return ans;
    }

    private int area(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[i].length || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0;
        return area(grid, i - 1, j) + area(grid, i + 1, j) + area(grid, i, j - 1) + area(grid, i, j + 1) + 1;
    }

}