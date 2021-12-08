package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchForPrimeNembers {
    public static void main(String[] args) {
        int[] ar = new int[99];
        for (int i = 0; i < 99; i++) {
            ar[i] = i + 2;
        }
        List<Integer> arNum = new ArrayList<>();
        for (int a : ar) {
            int count = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
            if (count == 2){
                arNum.add(a);
            }
        }

        for (Integer i: arNum) {
            System.out.print(i + " ");
        }

    }
}
