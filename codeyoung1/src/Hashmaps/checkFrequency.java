package Hashmaps;

/*
import java.util.HashMap;

import java.util.Map;

public class checkFrequency {

    //public static HashMap<Integer, Integer> checkFrequency{}
    public static void main(String[] args){
        int[] arr = {2,3,6,2,3,8,3,6};
        int n = arr.length;
        //int q = 3;

        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++){
            if(frequencyMap.containsKey(arr[i])){
                frequencyMap.put(arr[i], frequencyMap.get(arr[i])+1); //update function {might be error}
            }
            else{
                frequencyMap.
            }
        }
    }
}

/*

*/
import java.util.*;

public class checkFrequency {
    /**
     * This method takes an array of integers as input and returns a map where the keys are
     * the distinct integers in the input array, and the values are the frequencies of each
     * integer in the array.
     *
     * @param arr the input array of integers
     * @return a map where the keys are the distinct integers in the input array, and the
     *         values are the frequencies of each integer in the array
     */
public static Map<Integer, Integer> countFrequencies(int[] arr) {
        // Create a new HashMap to store the frequency counts

        Map<Integer, Integer> freqMap = new HashMap<>();

        // Iterate over the input array and count the frequency of each integer

        for (int i = 0; i < arr.length; i++) {
        // If the integer is already in the map, increment its count by 1

        if (freqMap.containsKey(arr[i])) {
        freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
        }

        else {

        // If the integer is not yet in the map, add it with a count of 1
        freqMap.put(arr[i], 1);

            }
        }

        // Return the frequency map
        return freqMap;
}

public static void main(String[] args) {
        int[] arr = {2, 3, 6, 2, 3, 8, 3, 6};
        Map<Integer, Integer> freqMap = countFrequencies(arr);
        System.out.println(freqMap);
    }

}

