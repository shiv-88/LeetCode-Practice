package Arrays;

public class subSequences {



    /*
    // for every a find the numebr of g; brute force
    public static int countPair(String s){
        char[] str = s.toCharArray();
        int ans = 0;

        for (int i = 0; i < str.length; i++){
            if(str[i] == 'a'){
                for(int j = i+1; j < str.length; j++){
                    if (str[j] == 'g'){
                        ans++;
                    }
                }
            }

        }
        return ans;
    }
    */

    /*
    rough work

    countpairs string s{
    ans = 0
    numberA = 0
    numberG = 0

     char[] str = s.toCharArray();

     for int i = 0; i < N; i++
     if str[i] == a
        numberA++
    else if str[i] == g
        numberG++
        ans += numberA

    return ans



    }

     */

    public static int countPair(String s){
        int ans = 0;
        int numberA = 0;
        //int numberG = 0;

        char[] str = s.toCharArray();

        for (int i = 0; i < str.length; i++){
            if (str[i] == 'a'){
                numberA++;
            }
            else if (str[i] == 'g'){
                //numberG++;
                ans += numberA;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String s = "bcaggaag";
        System.out.println(countPair(s));
    }



}
