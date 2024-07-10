package cn.tommypoon.algorithm.easy;

public class Class28 {

    public int strStr(String haystack, String needle) {

        char[] all = haystack.toCharArray();
        char[] sub = needle.toCharArray();
        for (int i = 0; i + sub.length < all.length; i++) {
            boolean contains = true;
            for (int j = 0; j < sub.length; j++) {
                if (all[i + j] != sub[j]) {
                    contains = false;
                    break;
                }
            }
            if (contains) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Class28 class28 = new Class28();
        System.out.println(class28.strStr("a", ""));
        System.out.println("abcd".indexOf("abe"));
        System.out.println("abcde".charAt(3));
    }

}

/*
28. 找出字符串中第一个匹配项的下标
简单
相关标签
相关企业
给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。如果 needle 不是 haystack 的一部分，则返回  -1 。



示例 1：

输入：haystack = "sadbutsad", needle = "sad"
输出：0
解释："sad" 在下标 0 和 6 处匹配。
第一个匹配项的下标是 0 ，所以返回 0 。
示例 2：

输入：haystack = "leetcode", needle = "leeto"
输出：-1
解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。


提示：

1 <= haystack.length, needle.length <= 104
haystack 和 needle 仅由小写英文字符组成
 */