package com.company;

import java.util.*;

public class SearchForPrimeNumberStream {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            list.add(i);
        }

        List<Integer> prime = new ArrayList<>();

        list = list.stream()
                .dropWhile(l -> l == 0 || l == 1)
                .toList();

        while(true){

            Integer division = list.stream().findFirst().orElse(-1);

            if(division == -1)
                break;

            list = list.stream()
                    .filter((num -> num%division!=0))
                    .toList();
            prime.add(division);
        }

        for(Integer i : prime)
            System.out.print(i + " ");

    }

}
