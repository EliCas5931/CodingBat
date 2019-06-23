package com.company;

// Coding Bat instructions

//Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
//
//
//        noTeen([12, 13, 19, 20]) → [12, 20]
//        noTeen([1, 14, 1]) → [1, 1]
//        noTeen([15]) → []

// My code:

import java.util.List;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(nm -> nm >= 13 && nm <= 19);
        return nums;
    }
}

// Coding Bat's solution. Only difference was nm instead of n in stream

//public List<Integer> noTeen(List<Integer> nums) {
//    nums.removeIf(n -> n >= 13 && n <= 19);
//    return nums;
//}
