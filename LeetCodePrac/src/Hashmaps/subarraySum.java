package Hashmaps;

import java.util.HashMap;

public class subarraySum {

    public static int subarraySum(int[] arr, int B) {

        int count = 0;
        int sum = 0;

        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        /*
        for (int i = 0; i < arr.length; i++){
            sum = prefixSum[i];
            if (map.containsKey(sum-B)){
                ans += map.get(sum-B);
            }
            map.put(sum, map.get(sum));
        }
        return ans;
      }
    }
*/

        for (int i = 0; i < arr.length; i++){

            if (prefixSum[i] == B){
                count ++;
            }
            if(map.containsKey(prefixSum[i] - B)){
                count += map.get(prefixSum[i]-B);
            }
            if (map.containsKey(prefixSum[i])){
                map.put(prefixSum[i],map.get(prefixSum[i])+1);
            }
            else{
                map.put(prefixSum[i],1);
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,0,1};
        int B = 1;
        System.out.println(subarraySum(arr,B));
    }

}
