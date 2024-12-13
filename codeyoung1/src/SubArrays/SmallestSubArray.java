package SubArrays;

public class SmallestSubArray {

    public static int maxElement(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            max = Math.max(max, A[i]);
        }
        return max;
    }

    public static int minElement(int[] A){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++){
            min = Math.min(min, A[i]);
        }
        return min;
    }

    public static int smallestSubarray(int[] arr){
        int Amax = maxElement(arr);
        int Amin = minElement(arr);

        int lastMinIndex = -1;
        int lastMaxIndex = -1;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == Amax){
                lastMaxIndex = i;
            }
            if(arr[i] == Amin){
                lastMinIndex = i;
            }
            if (lastMinIndex != -1 && lastMaxIndex != -1){
                int length = Math.abs(lastMaxIndex - lastMinIndex) +1;


                if(ans>length){
                    ans = length;
                }
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,4,6,4,6,3};
        //int[] arr = {1,1,1,1,1,1,1,1,1,1};
        System.out.println(smallestSubarray(arr));
    }
}
