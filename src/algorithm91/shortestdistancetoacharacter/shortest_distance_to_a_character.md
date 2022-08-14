# 821. Shortest Distance to a Character

**思路：**
最无脑的思路
1. 记录c的下标存入数组
2. 遍历相减取最小绝对值

```java
public int[] shortestToChar(String s, char c) {
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
```
>时间复杂度： O(n^2)
> 
>空间复杂度：O(n)