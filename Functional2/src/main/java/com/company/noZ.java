package com.company;

import java.util.List;

//Instructions for noZ
//Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
//
//
//        noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
//        noZ(["hziz", "hzello", "hi"]) → ["hi"]
//        noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]

public class noZ {
    public List<String> noZ(List<String> strings) {
        strings.removeIf(st -> st.contains("z"));
        return strings;
    }
}


