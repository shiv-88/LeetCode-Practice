package Arrays;

public class SpecialIndex {

    public static int countSpecialIndexes(int[] arr) {
        int count = 0;
        int[] prefixSum = prefix(arr); // Calculate prefix sum array

        for (int i = 0; i < arr.length; i++) {
            int oddSum = prefixSum(arr, i + 2, arr.length - 1); // Calculate sum of odd indexed elements
            int evenSum = prefixSum(arr, i + 1, arr.length - 1); // Calculate sum of even indexed elements

            if (oddSum == evenSum) {
                count++; // Increment count if sums are equal
            }
        }

        return count; // Return the count of special indexes
    }

    public static int[] prefix(int[] arr) {
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0]; // First element of prefix sum array is the same as the input array

        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i]; // Calculate prefix sum by adding previous sum and current element
        }

        return prefixSum; // Return the prefix sum array
    }

    public static int prefixSum(int[] arr, int start, int end) {
        if (start > end) {
            return 0; // If start index is greater than end index, return 0 (no elements to sum)
        }

        int[] prefixSum = prefix(arr); // Calculate prefix sum array

        if (start == 0) {
            return prefixSum[end]; // If start index is 0, return prefix sum at the end index
        }
        return prefixSum[end] - prefixSum[start - 1]; // Return the sum of elements between start and end index
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 4};
        int specialIndexes = countSpecialIndexes(arr);
        System.out.println("Number of special indexes: " + specialIndexes);
    }
}
