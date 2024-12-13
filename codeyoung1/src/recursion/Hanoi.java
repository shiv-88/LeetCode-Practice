package recursion;
import java.util .*;
public class Hanoi {


    /*
    Move all the disks stacked on the first tower over to the last tower using a helper tower in the middle. While moving the disks, certain rules must be followed. These are :

1. Only one disk can be moved.

2. A larger disk can not be placed on a smaller disk.

     */

    public static void towerofhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        //Transfer top n-1 from src to helper using dest as helper
        towerofhanoi(n - 1, src, dest, helper);
        //Transfer nth from src to dest
        System.out.println("Transfer disk " + n + "from " + src + "to " + helper);
        //Transfer n-1 from helper to dest using src as helper
        towerofhanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerofhanoi(n, "A", "B", "C");
    }
}


