package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] ar = new int[7];
        for (int i = 0; i<ar.length; i++){
            ar[i] = (int) (Math.random() * 10);
        }
        for (int b: ar){
            System.out.print(b + " ");
        }
        System.out.println();

        int max = 0;
        int min = 0;
        double sr = 0;
        int c = 0;
        for(int i = 0; i<ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
            if (min > ar[i]) {
                min = ar[i];
            }
            c +=ar[i];
        }
        sr += (double) c / ar.length;
        System.out.println("Максимальное значение: "+max+" Минимальное значение: "+min+" Среднее значение: "+sr);
    }
}
