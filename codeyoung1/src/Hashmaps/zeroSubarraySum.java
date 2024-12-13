package Hashmaps;

import java.util.HashSet;

public class zeroSubarraySum {

    /*
    public static boolean zeroSub(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum+= arr[j];
                if (sum == 0){
                    return true;
                }
            }
        }
    return false;
    }
    */

    public static boolean zeroSub(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for (int i = 0; i< arr.length; i++){
           // sum = arr[i];
           if (set.contains(prefixSum[i])){
               return true;
           }
           else {
               set.add(prefixSum[i]);
           }


            if (arr[i] == 0){
                return true;
            }

            if (prefixSum[i] == 0){
                return true;
            }

            }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,-3,4,3,1,-2,-3};
        System.out.println(zeroSub(arr));
    }
}
