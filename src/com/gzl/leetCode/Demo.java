package com.gzl.leetCode;

/**
 * @author guzl
 * @description
 * @date 2019/10/24
 */
public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(10^3);
    }


    /**
     * 两数之和
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }


}
