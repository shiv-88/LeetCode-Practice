package Arrays;

public class EquilibriumIndex {

    public boolean solve(int[] A, int N) {

        int sL = 0;
        int sR = 0;
        //int N = A.length;
        for (int i = 0; i < N; i++) {

            if (i == 0) {
                sL = 0;
            }

            if (i == N - 1) {
                sR = 0;
            } else {

                for (int j = 0; j < i - 1; j++) {
                    sL += A[j];
                }

                for (int k = i + 1; k < N; k++) {
                    sR += A[k];
                }
            }

            if (sL == sR) {
                return true;
            }
        }


        return false;

    }

} //class end




