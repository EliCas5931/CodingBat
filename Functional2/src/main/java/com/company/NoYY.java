package com.company;

//Instructions for noYY

//Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
//
//
//        noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
//        noYY(["a", "b", "cy"]) → ["ay", "by"]
//        noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]

import java.util.List;

public class NoYY {
    public List<String> noYY(List<String> strings) {
        strings.replaceAll(s -> s + "y");
        strings.removeIf(st -> st.contains("yy"));

        return strings;
    }
}


