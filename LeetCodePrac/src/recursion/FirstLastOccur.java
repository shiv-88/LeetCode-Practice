package recursion;

public class FirstLastOccur {

    //HW: Check if an array is sorted (strictly increasing). - O(n) {1,2,3,4,5}


        //Find the occurrence of the first and last occurrence of an element using recursion "abaacdaefaah"

        public static int firstOccur (String str,char ch, int index){
            if (index == str.length()) {
                return -1;
            }
            if (str.charAt(index) == ch) {
                return index;
            }
            return firstOccur(str, ch, index + 1);
        }

        public static int lastOccur (String str,char ch, int index){
            if (index == str.length()) {
                return -1;
            }
            int restArray = lastOccur(str, ch, index + 1);
            if (restArray != -1) {
                return restArray;
            }
            if (str.charAt(index) == ch) {
                return index;
            }
            return -1;
        }

        public static void main (String[]args){
            String str = "abaacdaefaah";
            System.out.println(firstOccur(str, 'a', 0));
            System.out.println(lastOccur(str, 'a', 0));
        }

}
