# 657. Robot Return to Origin
**Thinking:**
1. 模拟

```java
class Solution {
    public boolean judgeCircle(String moves) {
        int[] cnt = new int[26];
        for(char c : moves.toCharArray()) cnt[c-'A']++;
        return cnt['L'-'A']==cnt['R'-'A'] && cnt['U'-'A']==cnt['D'-'A'];
    }
}

```
> Time  Complexity O(n)
> Space Complexity O(1)