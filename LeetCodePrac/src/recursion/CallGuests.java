package recursion;
//Question = Find the number of ways in which you can invite n people to your Party,single or in pairs. n =4
public class CallGuests {
    public static int callguest(int n) {
            if(n<=1) {
                return 1;
            }
            //single
            int ways1 = callguest(n-1);

            //pair
            int ways2 = (n-1) * callguest (n-2);

            return ways1 + ways2;
        }
        public static void main(String args[]) {
            int n= 4;
            System.out.println(callguest(n));
        }
    }

//the formula looks like " callguest(4) = callguest(3) + (3 * callguest(2)) "