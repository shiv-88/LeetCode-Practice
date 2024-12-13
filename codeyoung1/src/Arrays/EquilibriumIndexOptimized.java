package Arrays;

public class EquilibriumIndexOptimized {


    public static int[] prefix(int[] A){
       int[] prefixSum = new int[A.length];

       prefixSum[0] = A[0]; //first element same

       for (int i = 1; i < A.length; i++) {
           prefixSum[i] = prefixSum[i - 1] + A[i]; //rest of the array is iterated through and added to the prefix array
       }
        return prefixSum; //save the array
    }



    public boolean solve(int[] A) {

        int[] ps = prefix(A);
        int N = A.length;

        int sL = 0;
        int sR = 0;

        for (int i = 0; i < N; i++){



            if(i == 0) {
                sL = 0;
                sR = ps[N-1] - ps[i];
            }

            else if(i == N-1) {
                sL = ps[N-2];
                sR = 0;
            }

            else {
                sL = ps[i-1]; //calculate sL for every index
                sR = ps[N-1] - ps[i]; //calculate sR for every index

            }



            if (sL == sR){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] A = {1,2,3,4,8,10};
        int[] B = {5,-1,1};
        int[] C = {1,-1,5};
        //int N = A.length;

        EquilibriumIndexOptimized eio = new EquilibriumIndexOptimized();
        boolean answer = eio.solve(A);
        boolean answer2 = eio.solve(B);
        boolean answer3 = eio.solve(C);

        System.out.println(answer);
        System.out.println(answer2);
        System.out.println(answer3);
    }

}
