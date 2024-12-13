package Hashmaps;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class maxConsecutiveSequence {

    // OPTIMIZED APPROACH USING SETS
    public static int maxConSeq(int[] arr) {
        int n = arr.length;
        int maxLen = 0;
        Set<Integer> set = new HashSet<>();

        // Add all elements to set
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        // For each element, count length of sequence starting from that element
        for (int i = 0; i < n; i++) {
            int len = 1;
            int x = arr[i];

            // Check if there are elements greater than x+1 in the set
            while (set.contains(x+1)) {
                len++;
                x++;
            }

            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }


    public static void main(String[] args){

        int[] arr = {100, 4, 200, 1, 3, 2};

        int ans = maxConSeq(arr);
        System.out.println(Arrays.toString(arr) + " > " + ans);

    }

}
