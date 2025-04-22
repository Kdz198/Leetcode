package Medium;

import java.math.BigInteger;

public class SumOfTwoInteger {
    public static void main(String[] args) {

        sumOfTwoInteger123 s = new sumOfTwoInteger123();
        System.out.println(s.getSum(3,2));

    }
}

class sumOfTwoInteger123 {
    public int getSum(int a, int b) {
        BigInteger aBig = new BigInteger(a+"");
        BigInteger bBig = new BigInteger(b+"");
        BigInteger sum = aBig.add(bBig);


        return sum.intValue();
    }
}
