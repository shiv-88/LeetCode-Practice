package Sorting;

import java.util.ArrayList;

public class selectionSortDescending {
    //Implement Selection Sort to sort an ArrayList of integers in descending order.

    public static void selectionSort(ArrayList<Integer> list){

    int n = list.size();

    for (int i=0; i< n-1; i++){
        int minIndex = i;
        for (int j = i+1; j < n; j++){
            if (list.get(j)>list.get(minIndex)){
                minIndex=j;
            }
        }
        int temp = list.get(minIndex);
        list.set(minIndex,list.get(i));
        list.set(i,temp);
    }
    }

    public static void printList(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        list.add(-1);

        selectionSort(list);
        printList(list);
    }


}
