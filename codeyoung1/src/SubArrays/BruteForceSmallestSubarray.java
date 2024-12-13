package SubArrays;

public class BruteForceSmallestSubarray {

    public static int solve(int[] A){
        int Amax= maxElement(A);
        int Amin = minElement(A);

        int ans = A.length;

                for(int i = 0; i < A.length; i++){
                    if (A[i] == Amin){
                      for (int j = i+1; j < A.length; j++){
                          if (A[j] == Amax){
                              ans = Math.min(ans,j-i+1);
                              break;
                          }
                      }
                    }
                    else if(A[i] == Amax){
                        for(int j=i+1; j<A.length; j++){
                            if(A[j] == Amin){
                                ans = Math.min(ans, j-i+1);
                                        break;
                            }
                        }
                    }
                }
        return ans;
    }

    public static int maxElement(int[] A){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            max = Math.max(max, A[i]);
        }
        return max;
    }

    public static int minElement(int[] A){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i++){
            min = Math.min(min, A[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,1,3,4,6,4,6,3};
        System.out.println(solve(A));
    }

}
