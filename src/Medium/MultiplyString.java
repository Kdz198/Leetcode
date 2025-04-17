package Medium;

import java.math.BigInteger;

public class MultiplyString {
    public static void main(String[] args) {

        multiplyString123 m = new multiplyString123();
        System.out.println(m.multiply("123","2"));

    }
}
class multiplyString123 {
    public String multiply(String num1, String num2) {

        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger result = n1.multiply(n2);


        return result.toString();
    }
}
