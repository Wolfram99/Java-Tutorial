package Boock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Choice {
    public static void main(String[] args) {
        Random r = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 30; i++) {
            list.add(r.nextInt(100));
        }
        System.out.println(list);
        System.out.println(SortedVerible(list));
    }
    public static int MinVarible(LinkedList<Integer> lst){
        int tempVarible = lst.getFirst();
        int minIndex = 0;
        int size = lst.size();
        for (int i = 0; i<size;i++){
            if(lst.get(i) < tempVarible){
                tempVarible = lst.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static ArrayList<Integer> SortedVerible(LinkedList<Integer> lst){
        ArrayList<Integer> arrayLst = new ArrayList<>();
        int size = lst.size();
        for(int i = 0; i< size;i++){
            int temp = lst.get(MinVarible(lst));
            arrayLst.add(temp);
            lst.remove(MinVarible(lst));
        }
        return arrayLst;
    }
}
