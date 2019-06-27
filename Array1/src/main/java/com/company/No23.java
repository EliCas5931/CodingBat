package com.company;

// Instruction

//Given an int array length 2, return true if it does not contain a 2 or 3.
//
//
//        no23([4, 5]) → true
//        no23([4, 2]) → false
//        no23([3, 5]) → false

// My Solution

public class No23 {
    public boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[1] == 2) {
            return false;
        }

        if (nums[0] == 3 || nums[1] == 3) {
            return false;
        }

        return true;

    }
}

// Other Solutions

//    public boolean no23(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 2 || nums[i] == 3)
//                return false;
//        }
//        return true;
//    }

//    public boolean no23(int[] nums) {
//        boolean a = (nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3) ? false : true;
//        return a;
//    }