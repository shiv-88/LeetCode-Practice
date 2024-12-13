package Sorting;

//try to use selection sort
public class FindBthSmallest {

    public static int findBthSmallest(int[] arr, int B){
        //how to use selection sort in this implementation:
        // selection sort is used to select the minimnum element and replace it with its correct position element.
        // possible ways to do: 1:Sort Entire Array and get B, 2:Sort Array only until Bth position is obtained
        // option 2 seems better as if we do option 1, it may be inefficient for large arrays or large B values, therefore we will
        // only sort what is needed

        //use array 9,3,7,1,5,2,8,6,4

        //TODO: Implement selectionSort
        //TODO: Add input validation for B (optional) (done to optimize further, no need)
        //TODO: Perform selectionsort to partially sort the array up to the Bth  element

        int n = arr.length;

        for (int i = 0; i < n; i++){

            int minIndex = i; //where we assume curr index has the minimum value

            for (int j = i + 1; j < n; j++){
                // we start the inner loop with i + 1 as we ensure that i is not compared to itself cuz why would you do that

                if (arr[j] < arr[minIndex]){
                    minIndex = j; //update min index if J is found
                }
            }

            //swap elements now
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        //return B - 1 as if B = 2 then return item at index 1
        return arr[B - 1];
        
    }

    public static void main(String[] args){
        int[] arr = {9,3,7,1,5,2,8,6,4};
        int B = 2;

        int ans = findBthSmallest(arr, B);
        System.out.println(ans);


    }

}
