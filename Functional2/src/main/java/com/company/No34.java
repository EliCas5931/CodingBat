package com.company;

// Instructions for no34

//Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
//
//
//        no34(["a", "bb", "ccc"]) → ["a", "bb"]
//        no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
//        no34(["ccc", "dddd", "apple"]) → ["apple"]

import java.util.List;

public class No34 {
    public List<String> no34(List<String> strings) {
        strings.removeIf(st -> st.length() == 3 || st.length() == 4);
        return strings;
    }
}


