package cn.tommypoon.algorithm.easy;

public class Class67 {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int m = a.length() - 1, n = b.length() - 1, carry = 0;
        while (m >= 0 || n >= 0 || carry != 0) {
            int sum = carry;
            if (m >= 0) {
                sum += (a.charAt(m) - '0');
                m--;
            }
            if (n >= 0) {
                sum += (b.charAt(n) - '0');
                n--;
            }
            carry = sum / 2;
            builder.append(sum % 2);
        }
        return builder.reverse().toString();
    }
}

/*
67. 二进制求和
简单
相关标签
相关企业
给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。



示例 1：

输入:a = "11", b = "1"
输出："100"
示例 2：

输入：a = "1010", b = "1011"
输出："10101"


提示：

1 <= a.length, b.length <= 104
a 和 b 仅由字符 '0' 或 '1' 组成
字符串如果不是 "0" ，就不含前导零
 */
