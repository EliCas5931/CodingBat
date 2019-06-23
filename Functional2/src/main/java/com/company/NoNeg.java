package com.company;

//Instructions for noNeg

//Given a list of integers, return a list of the integers, omitting any that are less than 0.
//
//
//        noNeg([1, -2]) → [1]
//        noNeg([-3, -3, 3, 3]) → [3, 3]
//        noNeg([-1, -1, -1]) → []

// My code for noNeg in Coding Bat's Function - 2

import java.util.List;

public class NoNeg {

    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(nm -> nm < 0);
        return nums;
    }

}


//    Coding Bat's Given solution
//    public List<Integer> noNeg(List<Integer> nums) {
//        nums.removeIf(n -> n < 0);
//        return nums;
//
//        // OR the equivalent stream solution
//        // Note that the boolean logic is opposite
//        // return nums.stream()
//        //   .filter(n -> n >= 0)
//        //   .collect(Collectors.toList());
//    }
