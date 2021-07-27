package com.lb.leetcode.动态规划;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author: liuben
 * @date: 2021/7/27
 */
public class 杨辉三角 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> elements = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    elements.add(1);
                } else {
                    elements.add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
                }
            }
            res.add(elements);
        }
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> generate = 杨辉三角.generate(5);
        System.out.println(generate);
    }
}
