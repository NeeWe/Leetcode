package com.hello;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 */
public class Solution17 {

    private static Map<String, Character[]> map = new HashMap<>();

    static {
        map.put("2", new Character[]{'a', 'b', 'c'});
        map.put("3", new Character[]{'d', 'e', 'f'});
        map.put("4", new Character[]{'g', 'h', 'i'});
        map.put("5", new Character[]{'j', 'k', 'l'});
        map.put("6", new Character[]{'m', 'n', 'o'});
        map.put("7", new Character[]{'p', 'q', 'r', 's'});
        map.put("8", new Character[]{'t', 'u', 'v'});
        map.put("9", new Character[]{'w', 'x', 'y', 'z'});

    }

    public List<String> letterCombinations(String digits) {
        for(int i = 0; i < digits.length(); i ++) {

        }

        return null;
    }
}
