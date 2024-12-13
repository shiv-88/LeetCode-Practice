package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class countUnique {

    public static int countUniqueString(String[] A, String[] B){
        HashMap<String,Integer> mapA = new HashMap<>();
        HashMap<String, Integer> mapB = new HashMap<>();


        for (String str : A){
            if(mapA.containsKey(str)) {
                mapA.put(str, mapA.get(str) + 1);
            } else {
                mapA.put(str, 1);
            }
        }

        for (String str : B){
            if(mapB.containsKey(str)) {
                mapB.put(str, mapB.get(str) + 1);
            } else {
                mapB.put(str, 1);
            }
        }

        int uniqueCount = 0;

        //check for string

        for(Map.Entry<String,Integer> entry : mapA.entrySet()){

            /*
            String str = entry.getKey();
            int frequencyA = entry.getValue();
            int frequencyB = mapB.get(str);

            if (frequencyA == 1 && frequencyB ==1){
                uniqueCount++;
            }

             */

            if (mapB.containsKey(entry.getKey())){
                if (entry.getValue() == 1 && mapB.get(entry.getKey()) == 1){
                    uniqueCount++;
                }
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {

        String[] A = {"is", "a", "Java", "language"};
        String[] B = {"a", "is", "a", "language"};

        int count = countUniqueString(A, B);
        System.out.println(count);
    }
}
