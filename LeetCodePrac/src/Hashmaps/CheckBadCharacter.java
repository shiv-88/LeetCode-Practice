package Hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CheckBadCharacter {

    /*
    Method of approach:
    - ~Create HashMap and store the repetitions of chars in A.~
    - Loop through array A and increase frequency count of each chars

    - Loop through array B to find the frequency of chars in A (repetition)
    - If most frequency in in A is chars in B, return -1
    - otherwise return the frequency of the most char in A.
     */

    public static int checkBad(char[] arrA, char[] arrB){



        HashMap<Character, Integer> freq = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (char c : arrB){
            set.add(c);
        }

        for (char c : arrA){
          if (!set.contains(c)){ //if char is NOT in B
              if(freq.containsKey(c)) {
                  freq.put(c,freq.get(c) + 1);
              }
              else {
                  freq.put(c,1);
              }
          }
        }


        if(freq.isEmpty()) return -1;

        int maxFreq = 0;
        char maxChar = '_';

        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if(entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println(maxChar);


        return maxFreq;

    }

    public static void main(String[] args) {
        char[] arrA = {'a','a','a','b','b','c','c','d'};
        char[] arrB = {'a', 'd'};

        System.out.println(checkBad(arrA,arrB));

    }

}
