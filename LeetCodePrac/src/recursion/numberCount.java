package recursion;

//count from 1 to a
public class numberCount {

    public static void printNum(int a){

        //base case; if a is lesser or equal to 0, return a
        if (a == 0) return;

        //main case; recursive call to printNum(a-1) until the num is = 0


        System.out.print(a + " ");

        printNum(a-1);


    }

    public static void main (String[] args){
        int a = 10;
        printNum(a);
    }
}
