package Hashmaps;

import java.util.HashSet;

public class distinctElement {

    public static int countDistinctElement(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {7,3,2,1,3,7,0};
        System.out.println(countDistinctElement(arr));
    }
}
