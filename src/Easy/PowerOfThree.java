package Easy;

public class PowerOfThree {
    public static void main(String[] args) {

        powerOfThree123 p = new powerOfThree123();
        System.out.println(p.isPowerOfThree(9));

    }
}
class powerOfThree123 {
    public boolean isPowerOfThree(int n) {

        if (n <= 0) return false;

            for (int i = 0; i <= 30; i++) {

                if (Math.pow(3, i) == n) {
                    return true;
                }
                else if (Math.pow(3, i) > n) {
                    return false;
                }
            }

        return false;
    }
}
class powerOfThree1234 {
    public boolean isPowerOfThree(int n) {

        return n > 0 && 1162261467 % n == 0;
    }
}
