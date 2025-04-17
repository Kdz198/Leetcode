package Medium;

public class DivideTwoInteger {
    public static void main(String[] args) {

        divideTwoInteger123 d = new divideTwoInteger123();
        System.out.println(d.divide(-2147483648,-1));

    }
}

class divideTwoInteger123 {
    public int divide(int dividend, int divisor) {

        if (dividend == -2147483648 && divisor == -1)
            return Integer.MAX_VALUE;

        if (dividend == 0)
        {
            return 0;
        }
        return dividend/divisor;
    }
}
