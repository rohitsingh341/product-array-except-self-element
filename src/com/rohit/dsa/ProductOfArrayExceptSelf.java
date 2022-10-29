package com.rohit.dsa;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int[] productArr = getProductArray(arr);

        System.out.println("Original Array -> " + Arrays.toString(arr));
        System.out.println("Product Array -> " + Arrays.toString(productArr));
    }

    public static int[] getProductArray(int[] nums) {
        int[] outputArr = new int[nums.length];

        int left = 1;
        int right = 1;

        // original nums - {1,2,3,4}
        //iterate from left to right - calculate prefixes
        for (int i = 0; i < nums.length; i++) {
            outputArr[i] = left;
            left = left * nums[i];
        }
        // {1,1,2,6}

        //iterate from right to left - calculate postfixes {1,2,3,4}
        for (int i = nums.length - 1; i >= 0; i--) {
            outputArr[i] = outputArr[i] * right;
            right *= nums[i];
        }
        // {24,12,8,6}

        return outputArr;
    }
}
