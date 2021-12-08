package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SearchForPrimeNumbersEratosthenes {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            lst.add(i);
        }
        for (Integer i : lst) {
            if (i == 1 || i == 0) {
                continue;
            }
            int p = i;
            for (Integer j : lst) {
                if (p == j)
                    continue;
                if (j % p == 0) {
                    set.add(j);
                }
            }
        }
        for(Integer q : set){
            System.out.print(q + " ");
        }
        System.out.println();
        for(Integer q : lst){
            if(!set.contains(q))
                System.out.print(q + " ");
        }
    }
}
