package cn.tommypoon.algorithm.easy;

import java.util.Arrays;
import java.util.Comparator;

public class Class14 {
    public String longestCommonPrefix(String[] strs) {

//        Arrays.sort(strs, Comparator.comparingInt(String::length));
//
//        char[] chars = strs[0].toCharArray();
//        StringBuilder builder = new StringBuilder();
//        String t = "";
//        for (char s : chars) {
//            boolean flag = true;
//            t += String.valueOf(s);
//            for (String str : strs) {
//                if (!str.startsWith(t)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                builder.append(s);
//            }
//        }
//        return builder.toString();
        String s = strs[0];
        for (String str : strs) {
            while (!str.startsWith(s)) {
                if (s.length() == 0) return "";
                s = s.substring(0, s.length() - 1);
            }
        }

        return s;

    }

    public static void main(String[] args) {
        Class14 class14 = new Class14();
        System.out.println(class14.longestCommonPrefix(new String[]{"abctytu", "abcd", "abdes"}));
        System.out.println(class14.longestCommonPrefix(new String[]{""}));
    }
}

/*
14. 最长公共前缀
简单
相关标签
相关企业
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。



示例 1：

输入：strs = ["flower","flow","flight"]
输出："fl"
示例 2：

输入：strs = ["dog","racecar","car"]
输出：""
解释：输入不存在公共前缀。


提示：

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] 仅由小写英文字母组成
 */
