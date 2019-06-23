package com.company;

//Instructions for square56
//Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
//
//
//        square56([3, 1, 4]) → [19, 11]
//        square56([1]) → [11]
//        square56([2]) → [14]

import java.util.List;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(nm -> nm * nm + 10);
        nums.removeIf(nm -> nm % 10 == 5 || nm % 10 == 6);

        return nums;
    }
}


