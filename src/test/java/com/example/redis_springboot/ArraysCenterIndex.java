package com.example.redis_springboot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author YangRuiHong
 * @create 2022-07-24 16:52
 * @email Yangrhd@dcits.com
 * @description:
 */
public class ArraysCenterIndex {
    public static void main(String[] args) {
//        System.out.println(prvotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        int[] twosum = new ArraysCenterIndex().twosum(new int[]{3, 2, 4}, 6);
        for (int i = 0; i < twosum.length; i++) {
            System.out.println(twosum[i]);
        }
//        System.out.println(testNuma(new int[]{1, 7, 3, 6, 5, 6}),6);
    }

    public static int prvotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();//求和 jdk1.8新特性
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (total == sum) {
                return i;

            }
            sum = sum - nums[i];
        }
        return -1;
    }

    public int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> storeNums = new HashMap<>(nums.length, 1);
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            Integer anotherIndex = storeNums.get(another);
            if (null != anotherIndex) {
                result[0] = anotherIndex;
                result[1] = i;
                break;
            } else {
                storeNums.put(nums[i], i);
            }

        }
        return result;
    }

    public static int[] testNuma(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
