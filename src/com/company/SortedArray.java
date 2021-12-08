package com.company;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] array = new int[7];
        for (int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random()*10);
        }
        for (int a : array){
            System.out.print(a);
            System.out.print(" ");
        }

        for(int i = 0; i<array.length; i++){
            boolean f =false;
            for(int j = 0; j<array.length - i-1; j++ ){
                if(array[j] > array[j+1]){
                    array[j] = (array[j]+array[j+1])-(array[j+1] = array[j]);
                    f = true;
                }
            }
            if (!f)
                break;
        }
        System.out.println();
        for (int a : array){
            System.out.print(a);
            System.out.print(" ");
        }


    }
}
