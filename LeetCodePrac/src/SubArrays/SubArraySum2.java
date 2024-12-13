package SubArrays;

public class SubArraySum2 {

    public static int count(int[] A, int B){

        int n = A.length;
        //create prefix sum array
        int[] prefixSum = new int[n];

        prefixSum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i]; //rest of the array is iterated through and added to the prefix array
        }
        //return prefixSum; //save the array

        int count = 0;
        //iterate through array and add to variable sum
        for (int i = 0; i < n; i++){
            int length = 0;
            int sum = 0;
            for (int j = i; j < n; j++){
                length++;
                sum = prefixSum[j]-prefixSum[i] + A[i];

                //****

                if(length % 2 == 0 && sum < B) {
                    count++;

                }

                else if(length % 2 != 0 && sum > B) {
                    count++;
                }

//                if (sum<B){count++;}
            }

        }
        return count;
    }

public static void main(String[] args) {
        int[] A = {2,5,6};
        int B = 10;
        System.out.println(count(A,B));
    }




}
