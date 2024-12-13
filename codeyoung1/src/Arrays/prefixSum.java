package Arrays;

public class prefixSum {
    public static int[] prefix(int[] A){
        int[] prefixSum = new int[A.length];

        prefixSum[0] = A[0]; //first element same

        for (int i = 1; i < A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i]; //rest of the array is iterated through and added to the prefix array
        }
        return prefixSum; //save the array
    }

}
