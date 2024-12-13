package Arrays;

public class reverseSpecified {

    public void reversePart(int arr[], int Si, int Sj){

        int left = Si;
        int right = Sj;

        while (left < right){

            int temp = arr[left]; //save the value of left
            arr[left] = arr[right]; //assign the value of right to left
            arr[right] = temp; //assign the value of left to right
            left++;
            right--;

        }

    }

    public static void main(String[] args){
        int arr[] = {3, -2, 1, 4, 3, 6, 8};
        int Si = 4;
        int Sj = 6;

        reverseSpecified rs = new reverseSpecified();
        rs.reversePart(arr, Si, Sj);

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
