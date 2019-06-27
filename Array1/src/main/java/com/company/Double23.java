package com.company;

// Instructions

//Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
//
//
//        double23([2, 2]) → true
//        double23([3, 3]) → true
//        double23([2, 3]) → false

// My Solution

public class Double23 {

    public boolean double23(int[] nums) {
        if (nums.length == 2) {
            if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
                return true;
            }
        }
        return false;
    }
}

// Other Solution

//    public boolean double23(int[] nums) {
//        int twoCount = 0;
//        int threeCount = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 2)
//                twoCount++;
//            if (nums[i] == 3)
//                threeCount++;
//        }
//        return twoCount == 2 || threeCount == 2;
//    }