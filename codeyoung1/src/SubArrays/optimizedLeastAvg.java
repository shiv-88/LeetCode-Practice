package SubArrays;

public class optimizedLeastAvg {

   public static int leastAVG(int[] arr, int k){

       int s = 0;
       int e = k-1;
       int sum = 0;
       int N = arr.length;

       for(int i = s; i <= e; i ++){
           sum+=arr[i];
       }
       int minSum = sum;

       //Moving window by one element at a time

       s = 1;
       e = k;

       while (e < N) {
           sum = sum - arr[s - 1] + arr[e];

           if (sum < minSum){
               minSum = sum;
           }

           s++;
           e++;

       }

       int ans = (int) minSum / k;
       return ans;

   }

   public static void main(String[] args){

       int[] arr = {3,7,5,20,-10,0,12}; //
       int k = 2;
       //expected output = -5

       int subArr = leastAVG(arr, k);
       System.out.println(subArr);
   }


}
