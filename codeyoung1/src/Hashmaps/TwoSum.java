package Hashmaps;

import java.util.HashSet;

public class TwoSum {

    public static boolean twoSum(int[] arr, int k){

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++){
            if (set.contains(k - arr[i])){
                return true;
            }

            else set.add(arr[i]);
        }

        return false;
    }

    public static void main(String[] args){
        int arr[] = {3, -2, 1, 4, 3, 6, 8};
        int k = 10;

        boolean ans = twoSum(arr, k);
        System.out.println(ans);
    }
}
