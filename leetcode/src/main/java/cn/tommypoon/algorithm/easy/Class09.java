package cn.tommypoon.algorithm.easy;

import java.util.Stack;

public class Class09 {
    public boolean isPalindrome(int x) {

//        if (x >= 0) {
//            StringBuilder builder = new StringBuilder();
//            char[] chars = String.valueOf(x).toCharArray();
//            for (int i = chars.length - 1; i >= 0; i--) {
//                builder.append(chars[i]);
//            }
//            return String.valueOf(x).contentEquals(builder);
//        }
//        return false;

        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;

    }

    public static void main(String[] args) {
        Class09 class09 = new Class09();
        System.out.println(class09.isPalindrome(10));
//        System.out.println(class09.isPalindrome(1234567899));
        System.out.println(12/10);
        System.out.println(12%10);
    }
}
/**
 * 9. 回文数
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数
 * 是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 例如，121 是回文，而 123 不是。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 121
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：x = -121
 * 输出：false
 * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3：
 * <p>
 * 输入：x = 10
 * 输出：false
 * 解释：从右向左读, 为 01 。因此它不是一个回文数。
 * <p>
 * <p>
 * 提示：
 * <p>
 * -2E31 <= x <= 2E31 - 1
 * <p>
 * <p>
 * 进阶：你能不将整数转为字符串来解决这个问题吗？
 */