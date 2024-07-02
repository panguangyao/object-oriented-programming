package cn.tommypoon.algorithm.easy;

public class Class20 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            s = s.replaceAll("\\(\\)", "");
            s = s.replaceAll("\\[]", "");
            s = s.replaceAll("\\{}", "");
        }
        return s.isEmpty();

//        s = s.replaceAll("()", "");
//        s = s.replaceAll("\\[\\]", "");
//        s = s.replaceAll("\\{\\}", "");
//        int len = s.length();
//        for (int i = 0; i < len / 2; i++) {
//            int r = len - 1 - i;
//            if ((s.charAt(i) == '(' && s.charAt(r) != ')') ||
//                    (s.charAt(i) == '[' && s.charAt(r) != ']') ||
//                    (s.charAt(i) == '{' && s.charAt(r) != '}') ||
//                    s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
//                return false;
//            }
//        }
//        return true;
    }

    public static void main(String[] args) {
        Class20 class20 = new Class20();
        System.out.println(class20.isValid("{{}}"));
        System.out.println(class20.isValid("{{()}}"));
        System.out.println(class20.isValid("[{{()}}]"));
        System.out.println(class20.isValid("[{{(})}]"));
        System.out.println(class20.isValid("{}[]()"));
        System.out.println(class20.isValid("){"));
        System.out.println(class20.isValid("[({(())}[()])]"));
    }
}
/*
20. 有效的括号
简单
相关标签
相关企业
提示
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
每个右括号都有一个对应的相同类型的左括号。


示例 1：

输入：s = "()"
输出：true
示例 2：

输入：s = "()[]{}"
输出：true
示例 3：

输入：s = "(]"
输出：false


提示：

1 <= s.length <= 104
s 仅由括号 '()[]{}' 组成
 */