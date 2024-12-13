package Hashmaps;

import java.util.HashMap;

public class numPairs {

    public static int numPairs(int[] arr, int k){

        HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();

        int count = 0;

        for (int i = 0; i < arr.length; i++){

            //check complement of the current element is already in the Hashmap
            int compliment = arr[i] - k;
            if (freq.containsKey(compliment)){
                count += freq.get(compliment);
            }

            //check if inverse of curr element is in Hashmap
            int invCompliment = arr[i] + k;
            if (freq.containsKey(invCompliment)){
                count+=freq.get(invCompliment);
            }

            //Update freq of curr element in HashMap
            freq.put(arr[i],freq.get(arr[0]+1));


        }
        return count;
    }

    //public static void main(String[] args){


}
