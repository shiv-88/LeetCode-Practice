package SubArrays;

public class MaxSubrarry {

    public static void maxSubarray(int[] arr, int k) {

        int n = arr.length;

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int ans = 0;

        //int s = 0;
        int e = k - 1;

        for (int s = 0; s< n ; s++) {
            int sum = 0;

            for (e = s; e < n; e++){
                sum += arr[e];
            }

           // ans = max(sum, ans);

            /*
            if (s == 0) {
                sum = prefixSum[e];
            } else {
                sum = prefixSum[e] - prefixSum[s - 1];
            }

            if (sum > ans) {
                ans = sum;
            }
            s++;
            e++;

             */


        }
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,-2,5};
        //expected output: 9

        //
        //System.out.println(maxSum);

    }
}
