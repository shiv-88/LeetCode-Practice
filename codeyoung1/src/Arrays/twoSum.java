package Arrays;

public class twoSum {

    public static boolean TwoSum(int arr[], int K){

        int N = arr.length;

        for(int i = 0; i < N; i++){
            for (int j = i+1 ; j < N ; j++){
                if (arr[i] + arr[j] == K && i!=j){
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {


        int arr[] = {3, -2, 1, 4, 3, 6, 8};
        //int arr[] = {-1, 4, 3, 2};
        int K = 10;

        boolean answer = TwoSum(arr, K);
        System.out.println(answer);
    }

    }
