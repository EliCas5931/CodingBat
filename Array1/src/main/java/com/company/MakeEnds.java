package com.company;

// Instructions

//Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
//
//
//        makeEnds([1, 2, 3]) → [1, 3]
//        makeEnds([1, 2, 3, 4]) → [1, 4]
//        makeEnds([7, 4, 6, 2]) → [7, 2]

// My Solution

public class MakeEnds {

    public int[] makeEnds(int[] nums) {

        int[] myArr = { nums[0], nums[nums.length - 1]};

        return myArr;
    }
}
