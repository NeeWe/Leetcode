package com.hello;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * @author Administrator
 */
public class Solution17 {

    private static Map<String, List<String>> map = new HashMap<>();

    static {
        map.put("2", Arrays.asList("a", "b", "c"));
        map.put("3", Arrays.asList("d", "e", "f"));
        map.put("4", Arrays.asList("g", "h", "i"));
        map.put("5", Arrays.asList("j", "k", "l"));
        map.put("6", Arrays.asList("m", "n", "o"));
        map.put("7", Arrays.asList("p", "q", "r", "s"));
        map.put("8", Arrays.asList("t", "u", "v"));
        map.put("9", Arrays.asList("w", "x", "y", "z"));

    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if(digits.length() <= 0) {
            return ans;
        }
        List<String> collect = Arrays.stream(digits.split("")).collect(Collectors.toList());




        for (String s : collect) {
            ans = mix(ans, map.get(s));
        }

        return ans;
    }

    private List<String> mix(List<String> first, List<String> second) {
        List<String> list = new LinkedList<>();
        if(first.size() <= 0) {
            return second;
        }
        first.forEach(f -> second.forEach(s -> list.add(f + s)));
        return list;
    }

    public static void main(String[] args) {
        List<String> strings = new Solution17().letterCombinations("22");
        strings.forEach(System.out::println);
    }
}
