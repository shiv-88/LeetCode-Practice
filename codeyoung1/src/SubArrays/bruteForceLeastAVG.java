package SubArrays;

//Array: [3,7,5,9,2,8]
// size = k = 3

import java.util.Arrays;

//method to use: Sliding Window
public class bruteForceLeastAVG {

    public static int findSubarrayWithLeastAverage(int[] arr, int k) {

        /*
        int n = arr.length;
        int start = 0;
        double minAvg = Double.MAX_VALUE;

        //iterate over each subarray of size k
        for (int i = 0; i <= n - k; i++){
            //calculate sum of curr subarray
            int currSum = 0;
            for (int j = i; j < i + k; j++){
                currSum += arr[j];
            }
            double avg = (double) currSum / k;
            if (avg < minAvg){
                minAvg = avg;
                start = i;
            }
        }
    return Arrays.copyOfRange(arr, start, start + k);
    }

    public static void main(String[] args) {

        int[] arr = {3,7,5,9,2,8};
        int k = 3;

        int[] subArr = findSubarrayWithLeastAverage(arr, k);
        System.out.println(Arrays.toString(subArr));
    }
    */

        int s = 0;
        int e = k - 1;
        int ans = Integer.MAX_VALUE;
        int N = arr.length;

        while (e < N){
            int sum = 0;
            int avg = 0;

            for (int i = s; i <= e; i++){
                sum += arr[i];
            }

            avg = sum / k;

            if (avg < ans){
                ans = avg;
            }

            s++;
            e++;

        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {3,7,5,20,-10,0,12}; //
        int k = 2;
        //expected output = -5

        int subArr = findSubarrayWithLeastAverage(arr, k);
        System.out.println(subArr);
    }



}