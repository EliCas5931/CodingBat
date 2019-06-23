package com.company;

// Instructions for noLong
//Given a list of strings, return a list of the strings, omitting any string length 4 or more.
//
//
//        noLong(["this", "not", "too", "long"]) → ["not", "too"]
//        noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
//        noLong(["cccc", "cccc", "cccc"]) → []

import java.util.List;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        strings.removeIf(st -> st.length() >= 4);
        return strings;
    }
}


