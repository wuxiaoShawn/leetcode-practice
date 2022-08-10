# 989.Add to Array-Form of Integer

**思路:**

自己想的思路和leetcode上高赞答案差不多，但是实现起来，发现他的更优雅，果断使用他的实现思路。优雅，真的太优雅了！！！
1. 不要用for循环，因为你不知道num,k那个长度更长，如果一开始将k转为数组来比较长度就太不优雅了！！！所以用while()
2. 用LinkedList不要用ArrayList因为底层为链表实现的LinkedList可以头插
3. 数组的每一位都与K整体相加，除10就是K的最新值参与下一次遍历，不用考虑进位问题
4. 把数组相加的问题转化为对最新值处理问题，不用考虑长度和位数

```java
public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        int lastNum = k;
        int i = len - 1;
        LinkedList<Integer> result = new LinkedList<>();
        while (i >= 0 || lastNum > 0) {
            if (i >= 0)
                lastNum += num[i];
            //取模加入到数组
            result.addFirst(lastNum % 10);
            //更新最新值
            lastNum /= 10;
            i--;
        }
        return result;
    }
}
```