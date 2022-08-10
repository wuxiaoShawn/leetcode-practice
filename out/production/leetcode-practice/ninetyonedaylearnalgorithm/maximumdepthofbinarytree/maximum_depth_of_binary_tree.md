# 104. Maximum Depth of Binary Tree
**Thinking:**
递归
**tag: DFS**
1. 找出终止条件: 当前节点为空
2. 找出返回值: 节点为空返回0，节点不为空分别求左右节点最大值在加1表示当前节点的高度并返回
3. 某层的执行过程: 见返回值部分

```java
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left,right) + 1;
        }

    }

}
```
> Time  Complexity O(n)
> Space Complexity O(1)