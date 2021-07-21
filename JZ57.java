//和为s的两个数
//输入一个递增排序的数组和一个数字s，
// 在数组中查找两个数，使得它们的和正好是s。
// 如果有多对数字的和等于s，则输出任意一对即可。

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JZ57 {
    public static void main(String[] args) {
        int[] array={2,7,11,15};
        JZ57 p=new JZ57();
        int[] ints = p.twoSum(array, 9);
        System.out.println(Arrays.toString(ints));
    }
    //1、双指针法
//    public int[] twoSum(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//            int cur = nums[left] + nums[right];
//            if (cur == target) return new int[]{nums[left],nums[right]};
//            else if (cur < target) left++;
//            else right--;
//        }
//        return new int[]{};
//    }
    //2、用Set 更慢
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(target - i))
                set.add(i);
            else
                return new int[]{i,target-i};
        }
        return new int[]{};
    }
}
