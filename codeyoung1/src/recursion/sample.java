package recursion;

public class sample {
    //using recursion, print number from 10-1

    public static void printnum(int first){
        if(first>=1){
            System.out.print(first + " ");
            printnum(first-1);
        }
    }

    public static void main(String[] args) {
        printnum(10);
    }
}
