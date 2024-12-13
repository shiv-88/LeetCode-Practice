package bitManipulation;

public class checkbit {

    public boolean checkbit(int N, int i){

        if (((N >> i) & 1) == 0){
            return false;
        }

        else return true;

    }

    public static void main(String[] args) {
        checkbit cb = new checkbit();
        System.out.println(cb.checkbit(10, 3));
    }
}
