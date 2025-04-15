package Easy;

public class AddDigits {
    public static void main(String[] args) {

        addDigits123 a = new addDigits123();
        System.out.println(a.addDigits(38));
    }
}

class addDigits123 {
    public int addDigits(int num) {

        if (num < 10) {
            return num;
        }
        int sum = 0;

        while (true) {
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            if (sum <= 9)
                break;
            else {
                num = sum;
                sum = 0;
            }
        }

        return sum;
    }
}
