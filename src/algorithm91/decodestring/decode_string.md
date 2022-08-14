# 394. Decode String
**思路:**
1. 栈括号匹配处理小规模事件
2. 递归调用处理整体事件
```java
public String decodeString(String s) {
        Stack<Integer> brackets = new Stack<>();
        char[] chars = s.toCharArray();
        char leftBracket = '[';
        char rightBracket = ']';
        //以"3[a211[c]]"为例，拿到"a2[c]"的位置，处理成"3[acc]"递归处理
        //左括号位置确定倍数
        Integer leftBracketIndex = -1;
        //右括号位置确定括号内的字符
        Integer rightBracketIndex = -1;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == leftBracket) {
                brackets.push(i);
            }
            if (chars[i] == rightBracket) {
                leftBracketIndex = brackets.pop();
                rightBracketIndex = i;
                break;
            }
        }
        if (leftBracketIndex == -1) {
            return s;
        } else {
            StringBuilder times = new StringBuilder();
            for (int i = leftBracketIndex -1; i >= 0; i--) {
                if (chars[i] <48 || chars[i] >57){
                    break;
                }
                times.append(chars[i]);
            }
            StringBuilder reverse = times.reverse();
            int time = Integer.valueOf(reverse.toString());

            StringBuilder tempString = new StringBuilder();
            StringBuilder timedString = new StringBuilder();
            tempString.append(chars, leftBracketIndex + 1, rightBracketIndex - (leftBracketIndex + 1));
            for (int i = 0; i < time; i++) {
                timedString.append(tempString);
            }
            StringBuilder sBuilder = new StringBuilder();

            for (int i = 0; i < chars.length; i++) {
                int i1 = leftBracketIndex - String.valueOf(time).length();
                if (i1 < i && i <= rightBracketIndex) {

                } else if (i1 == i) {
                    sBuilder.append(timedString);
                } else {
                    sBuilder.append(chars[i]);
                }
            }
            s = sBuilder.toString();
            return decodeString(s);
        }

    }
```
>时间复杂度：O(n^2)
>空间复杂度：O(n)