package SubArrays;

public class SubArraySum {

    public static void printSubarraysum(int[] arr){

        int n = arr.length;
        int[] PS = new int [n];
        int sum = 0;

        PS[0] = arr[0];

        for (int i = 1; i < arr.length; i++){
            PS[i] = PS[i-1] + arr[i];
        }


        for (int s = 0; s < n; s++){

            for(int e = s; e < n; e++){

                if (s == 0){
                    sum = PS[e];
                }
                else{
                    sum = PS[e] - PS[s - 1];
                }
               System.out.println(sum);
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {2,8,9};
        printSubarraysum(arr);
    }
}
