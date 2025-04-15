package Easy;

public class SqrtX {
    public static void main(String[] args) {

        Sqrt123 sqrt = new Sqrt123();
        System.out.println(sqrt.mySqrt(4));

    }
}

class Sqrt123 {
    public int mySqrt(int x) {

        if (x == 0)
            return 0;
        if (x<4)
            return 1;
        if (x==5)
            return 2;
        for (long i = 2; i <= x / 2; i++) {
            if (i*i == x)
                return (int)i;
            else if (i*i > x)
                return (int)i-1;
        }

        return 0;
    }
}
