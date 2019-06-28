package com.company;

// Instructions
//Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
//
//
//        mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
//        mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
//        mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}

import java.util.Map;

// My Solution
public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        if (map.containsKey("c")) {
            map.remove("c");
        }
        return map;
    }
}

// Other Solutions
//public Map<String, String> mapShare(Map<String, String> map) {
//    if (map.containsKey("a")) {
//        map.put("b", map.get("a"));
//    }
//    map.remove("c");
//    return map;
//}

//    public Map<String, String> mapShare(Map<String, String> map) {
//        if (map.containsKey("a")) {
//            String tmp = map.get("a");
//            map.put("b", tmp);
//        }
//        map.remove("c");
//        return map;
//    }