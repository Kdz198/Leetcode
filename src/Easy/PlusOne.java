package Easy;

import java.math.BigInteger;

public class PlusOne {
    public static void main(String[] args) {

        int[] arr = {5,6,2,0,0,4,6,2,4,9};
        plusOne12 p = new plusOne12();
        int[] newarr = p.plusOne(arr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]);
        }
    }
}
//106/111 test case
class plusOne123 {
    public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9)
            digits[digits.length - 1]++;

        else {
            long temp = 0;
            for (int i = 0; i < digits.length; i++) {
                temp = digits[i] + temp * 10;
            }
            temp++;
            System.out.println(temp);
            // hàm string value of để lấy độ dài của temp để tạo mảng mới mà ko cần phải chạy while
            int i = String.valueOf(temp).length();
            System.out.println(i);
            int[] newdigits = new int[i];
            i = newdigits.length - 1;
            while (temp != 0) {
                long digit = temp % 10;
                newdigits[i] = (int) digit;
                temp = temp / 10;
                i--;
            }
            return newdigits;
        }


        return digits;
    }
}

//Pass all
class plusOne12 {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9)
            digits[digits.length - 1]++;

        else {
            BigInteger temp = BigInteger.ZERO;
            for (int digit : digits) {
                temp = temp.multiply(BigInteger.TEN).add(new BigInteger(String.valueOf(digit)));
            }
            temp = temp.add(BigInteger.ONE);
            System.out.println(temp);

            String tempStr = temp.toString();
            int[] newDigits = new int[tempStr.length()];
            for (int i=tempStr.length()-1; i>=0; i--) {
                newDigits[i] = Integer.parseInt(tempStr.charAt(i)+"");
            }
            return newDigits;

        }

        return digits;
    }
}