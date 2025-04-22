package Easy;

public class ValidPerfectSquare {
    public static void main(String[] args) {

    }
}

class validPerfectSquare123 {
    public boolean isPerfectSquare(int num) {

        int k;
        k= (int) Math.sqrt((double) num);

        if(k*k == num )
            return true;

        return false;
    }
}
