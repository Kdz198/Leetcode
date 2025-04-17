package Medium;

public class ReverseInteger {
    public static void main(String[] args) {

        reverseInteger123 reverseInteger = new reverseInteger123();
        System.out.println(reverseInteger.reverse(1534236469));

    }
}

class reverseInteger123 {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;

        return (int)res;
    }
}
