package Hashmaps;

import java.util.HashMap;

public class pairWithTwoSum {

    public static int twoSum(int[] arr, int k){

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;

        for (int i = 0; i < arr.length; i++){

            int add = k - arr[i];

            if (map.containsKey(add)){
                count += map.get(add);
            }

            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i],1);
            }


        }
        return count;
    }

    public static void main(String[] args){
        int arr[] = {3, -2, 1, 4, 3, 6, 8};
        int k = 10;

        //boolean ans = twoSum(arr, k);
        int ans = twoSum(arr,k);
        System.out.println(ans);
    }
}
