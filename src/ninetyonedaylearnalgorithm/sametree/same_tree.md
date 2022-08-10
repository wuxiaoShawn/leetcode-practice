# 100. Same Tree
**Thinking:**
1. 递归
2. 注意找终止条件

```java
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Input: p = [1,2], q = [1,null,2]
        if (p == null && q == null) return true;
        //if (p != null && q != null) return p.val == q.val;
        if ((p ==null && q != null) || (p !=null && q == null)) return false;
        if (p.val != q.val) return false;

        boolean boolLeft = isSameTree(p.left, q.left);
        boolean boolRight = isSameTree(p.right, q.right);

        return boolLeft && boolRight;


    }

}
```
> Time  Complexity O(n)
> Space Complexity O(1)