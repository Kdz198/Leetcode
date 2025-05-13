package Easy;

import java.math.BigInteger;

public class AddStrings {
    public static void main(String[] args) {

        AddStrings2 obj = new AddStrings2();
        System.out.println(obj.addStrings("11", "123"));

    }
}
class AddStrings2 {
    public String addStrings(String num1, String num2) {

        BigInteger bi1 = new BigInteger(num1);
        BigInteger bi2 = new BigInteger(num2);


        return (bi1.add(bi2))+"";
    }
}
