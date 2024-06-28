package cn.tommypoon.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

public class Class01 {

    public static int[] twoSum(int[] nums, int target) {

        // O(N*N)
//        int[] arr = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if ((nums[i] + nums[j]) == target) {
//                    arr[0] = i;
//                    arr[1] = j;
//                    System.out.println(i+" "+j);
//                    break;
//                }
//            }
//        }
//        return arr;

        // O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
       return null;
    }

    public static void main(String[] args) {
        int[] arr = twoSum(new int[]{13, 3, 4, -7}, 6);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
/**
 * 1. 两数之和
 * 简单
 * 相关标签
 * 相关企业
 * 提示
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * <p>
 * <p>
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 */