/*
package Arrays;

import java.lang.reflect.Array;

public class arraySearch {

    //given N array element, count the no of elements having at least one element greater than itself
    public static int ArraySearch(int arr[], int N){

        int current = arr[i];
        int counter = 0;

        for (int i = N-1; i >= 0; i--){
            if (arr[i] > current){counter++;}
            if (arr[i] <= current){current = arr[i];}

        }
        return counter;
    }


    public static void main(String[] args)
    {
        int arr[] = {-3, -2, 6, 8, 4, 8, 5};
        int N = arr.length;

        int answer = ArraySearch(arr,N);
        System.out.println(answer);




    }

}
*/
package Arrays;

public class arraySearch {

    //given N array element, count the no of elements having at least one element greater than itself
    public static int ArraySearch(int arr[], int N) {

        int max = Integer.MIN_VALUE; //to find Max value, use MIN_VALUE, vice versa if you want the maximum value
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
                //count++;
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] == max) {
                count++;
            }
        }

        return N - count;
    }


    public static void main(String[] args) {
        //int arr[] = {-3, -2, 6, 8, 4, 8, 5};
        int arr[] = {-1,-1,-1,-1,-2};
        int N = arr.length;

        int answer = ArraySearch(arr, N);
        System.out.println(answer);
    }
}

