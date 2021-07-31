package com.lb.leetcode.动态规划;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: liuben
 * @date: 2021/7/27
 */
public class 杨辉三角2 {

    public static List<Integer> getRow(int rowIndex) {
        //List<Integer> res = new ArrayList<>();
        //for (int i = 0; i <= rowIndex; i++) {
        //    List<Integer> elements = new ArrayList<>();
        //    for (int j = 0; j <= i; j++) {
        //        if (j == 0 || j == i) {
        //            elements.add(1);
        //        } else {
        //            elements.add(res.get(j) + res.get(j - 1));
        //        }
        //    }
        //    res = elements;
        //}
        //return res;

        Integer[] ans = new Integer[rowIndex+1];
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j>=0; j--) {
                if(j == 0 || j == i) {
                    ans[j] = 1;
                } else {
                    ans[j] = ans[j] + ans[j-1];
                }
            }
        }
        return Arrays.asList(ans);
    }


    public static void main(String[] args) {
        List<Integer> row = 杨辉三角2.getRow(3);
        System.out.println(row);
    }
}
