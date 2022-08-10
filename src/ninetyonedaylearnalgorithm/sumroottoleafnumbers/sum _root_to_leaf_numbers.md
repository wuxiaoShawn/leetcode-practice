# 129. Sum Root to Leaf Numbers
**Thinking:**
1. dfs
2. 每个节点为一个数，所有节点的和就是该数的代表数字，当前节点的计算发放 curNum = prev * 10 +node.val;

```java
public class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root,0);
    }

    private int dfs(TreeNode root, int prevNum){
        if (root == null) return 0;
        int sum = prevNum * 10 + root.val;
        if (root.left == null && root.right == null) return sum;
        return dfs(root.left,sum) + dfs(root.right,sum);
    }

}
```
> Time  Complexity O(n)
> Space Complexity O(n)