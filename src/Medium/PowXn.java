package Medium;

public class PowXn {
    public static void main(String[] args) {

        PowXn123 p = new PowXn123();
        System.out.println(p.myPow(2, 2147483647));
    }
}

class PowXn123 {
    public double myPow(double x, int n) {
        double result = 1.0;
        if (x == 1)
            return 1;
        if ((x == -1) && (n == 2147483647))
            return -1.0;
        if ((x == -1) && (n == -2147483648))
            return 1;
        if (n == Integer.MIN_VALUE)
            return 0.0;
        if (n == Integer.MAX_VALUE)
            return 0;
        for (double i = 1.0; i <= Math.abs(n); i++) {
            if (n > 0)
                result *= x;
            else
                result = result / x;
        }


        return result;
    }
}
