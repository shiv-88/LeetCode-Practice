package SubArrays;

public class maxSubArray {

    /*
    compute prefix sum of array
    iterate over prefix sum, compute sum of K consc. elements
    keep track of max subarray
     */



    public static void maxSubarray(int[] arr, int k){

        int n = arr.length;

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int ans = 0;

        //if sum of subarray > maxSum, update maxsum

        int s = 0;
        int e = k-1;

        while (e < n){
            int sum = 0;
            if (s == 0){
                sum = prefixSum[e];
            }
            else{
                sum = prefixSum[e] - prefixSum[s-1];
            }

            if (sum > ans){
                ans = sum;
            }
            s++;
            e++;
        }

    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        maxSubarray(A, k);
    }

}
