package com.lb.leetcode.哈希表;

/**
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 * <p>
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：ransomNote = "a", magazine = "b"
 * 输出：false
 * 示例 2：
 * <p>
 * 输入：ransomNote = "aa", magazine = "ab"
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：ransomNote = "aa", magazine = "aab"
 * 输出：true
 *  
 * <p>
 * 提示：
 * <p>
 * 你可以假设两个字符串均只含有小写字母。
 * <p>
 *
 * @author: liuben
 * @date: 2021/8/13
 */
public class 三八三$赎金信 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] ransomNoteHash = new int[26];
        for (char c : ransomNote.toCharArray()) {
            ransomNoteHash[c - 'a']++;
        }
        for (char c : magazine.toCharArray()) {
            ransomNoteHash[c - 'a']--;
        }
        for (int noteHash : ransomNoteHash) {
            if (noteHash > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(三八三$赎金信.canConstruct("aaa", "aab"));
    }
}
