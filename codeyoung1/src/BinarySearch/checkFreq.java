package BinarySearch;

public class checkFreq {

    public static int freq(int[] arr, int target){
        //low = s
        //high = e
        int s = 0;
        int e = arr.length - 1;
        int firstIndex = -1;
        int lastIndex = -1;



        //First Occcurrence of target value

        while (s <= e){

            int mid = (s + e) / 2;
            if (arr[mid] == target){
                firstIndex = mid;
                e = mid - 1;
            }
            else if (arr[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }

        //Reset Low and High (s and e) values for next search
        s = 0;
        e = arr.length - 1;


        //Last occurrence of target value
        while (s <= e){
            int mid = (s + e)/2;

            if (arr[mid] == target){
                lastIndex = mid;
                s = mid + 1;
            }
            else if (arr[mid] < target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }

        //target not found? set freq to 0
        if (firstIndex == -1){
            return 0;
        }

        return lastIndex - firstIndex + 1;
    }

    public static void main(String[] args){

        int[] arr = {-5, -5, 3, 0, 0, 1, 1, 1, 1, 5, 5, 5, 5,5, 5,5, 9, 10};
        int target = 5;
        int frequency = freq(arr,target);
        System.out.println(frequency);
    }





}
