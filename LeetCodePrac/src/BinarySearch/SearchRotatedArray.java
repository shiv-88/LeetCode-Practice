package BinarySearch;

public class SearchRotatedArray {

    public static int searchRotatedArray(int[] array, int target){
        int start = 0;
        int end = array.length - 1;

        while (start <= end){

            int mid = (start + end) / 2;

            if (array[mid] == target){
                return mid;
            }

            if (array[start] <= array[mid]){ // if left half is sorted
                if (array[start] <= target && target < array[mid]){ //if found
                    end = mid - 1; //update end index to search in left
                } else{
                    start = mid + 1; // otherwise update start to search in right
                }
            }
        else { //if right half is sorted
            if (array[mid] < target && target <= array[end]){ //if found
                start = mid + 1; //update start index to search in right
            } else{
                end = mid - 1; //otherwise search left
            }

            }

        }
        return -1;
    }


    public static void main(String[] args){
        int[] array = {4, 5, 6, 7, 8, 1, 2, 3};
        int target = 7;
        int index = searchRotatedArray(array, target);
        System.out.println(index); //expected output = 3
    }
}

/*



 */