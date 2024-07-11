package cn.tommypoon.algorithm.easy;

public class Class35 {

    public int searchInsert(int[] nums, int target) {
//        if (nums[0] > target) {
//            return 0;
//        }
//        if (nums[nums.length - 1] < target) {
//            return nums.length;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//            if (i < nums.length - 1 && nums[i] < target && nums[i + 1] > target) {
//                return i + 1;
//            }
//        }
//        return 0;
        //binary search
        int len = nums.length;
        int left = 0, right = len - 1, result = 0;
        while (left <= right) {
            int mid = (right - left) / 2 + left;//middle position
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
                result = mid;
            }
        }
        return result;
    }
}
/*
35. 搜索插入位置
简单
相关标签
相关企业
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

请必须使用时间复杂度为 O(log n) 的算法。



示例 1:

输入: nums = [1,3,5,6], target = 5
输出: 2
示例 2:

输入: nums = [1,3,5,6], target = 2
输出: 1
示例 3:

输入: nums = [1,3,5,6], target = 7
输出: 4


提示:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums 为 无重复元素 的 升序 排列数组
-104 <= target <= 104
 */