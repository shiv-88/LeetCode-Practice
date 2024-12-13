package Hashmaps;

import java.util.HashMap;

public class CountSubarrays {

    public static int countSubarrays(int[] arr, int k){

        /*
        //BRUTE FORCE
        int n = arr.length;
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            prefixSum[i] = prefixSum [i-1] + arr[i];
        }

        int count = 0;

        for (int s = 0; s < n; s++){
            for (int e = s; e < n; e++){
                //calc sum of currr sub arr

                int sum = 0;
                        //prefixSum[e] - prefixSum[s-1];

                if (s ==0){
                sum = prefixSum[e]; //+ arr[s];
                }
                else {
                    sum = prefixSum[e] - prefixSum[s-1];
                }

                if (sum == k) {
                    count ++;
                }
            }

        }
        return count;

         */

        //prefixSumFreq
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int prefixSum = 0;
        int count = 0;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        //loop thru prefix array
        for (int i = 0; i < prefix.length;i++){

            //check if prefix arr - k is in hashmap
            if (map.containsKey(prefix[i] - k)){
                count += map.get(prefix[i] - k);
            }

            //if prefix elem = k, count ++
            if (prefix[i] == k){
                count++;
            }

            //Updating frequency of prefix array in HashMap
            if(map.containsKey(prefix[i])) {
                map.put(prefix[i],map.get(prefix[i])+1);
            }
            else {
                map.put(prefix[i],1);
            }


        }
        return count;
    }

    public static void main(String[] args){
        int arr[] = {1,0,1};
        int k = 1;

        int count = countSubarrays(arr,k);
        System.out.println(count);
    }
}
