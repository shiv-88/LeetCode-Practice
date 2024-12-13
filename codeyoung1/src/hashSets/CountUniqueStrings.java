package hashSets;

import java.util.HashSet;

//this will not work, as when setB is turned into a set, one of the "a"'s is eliminated.
//we are to use hashMaps instead
public class CountUniqueStrings {


    public static int countUniqueStrings(String[] A, String[] B){
        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();

        //strings from arr A to setA
        for (String str : A){
            setA.add(str);
        }

        //strings from arr B to setB
        for (String str : B){
            setB.add(str);
        }

        int uniqueCount = 0;

        //check to find strings that appear only once in both sets
        for(String str : setA){

            if(setB.contains(str)){
                uniqueCount++;
            }

        }
        return uniqueCount;
    }


    public static void main(String[] args) {

        String[] A = {"is", "a", "Java", "language"};
        String[] B = {"a", "is", "a", "language"};

        int count = countUniqueStrings(A, B);
        System.out.println(count);
    }
}
