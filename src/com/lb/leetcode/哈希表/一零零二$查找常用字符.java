package com.lb.leetcode.哈希表;



import java.util.*;

/**
 * @author liuben
 * @date 2021/8/1 9:20 下午
 **/
public class 一零零二$查找常用字符 {
    public static List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        int[] hash = new int[26];
        for (char c : words[0].toCharArray()) {
            hash[c - 'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] hashOt = new int[26];
            for (char c : words[i].toCharArray()) {
                hashOt[c - 'a']++;
            }
            for (int j = 0; j < hash.length; j++) {
                hash[j] = Math.min(hash[j], hashOt[j]);
            }
        }
        for (int i = 0; i < hash.length; i++) {
            while(hash[i]!=0){
                res.add(String.valueOf((char) ('a' + i)));
                hash[i]--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(
                Arrays.toString(一零零二$查找常用字符.commonChars(words).toArray())
        );
//        int a = 98;
//        char c = (char) (a-1);
//        System.out.println(c);

    }
}
