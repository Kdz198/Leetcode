package Easy;

public class PowerOfFour {
    public static void main(String[] args) {

        powerOfFour123 p = new powerOfFour123();
        System.out.println(p.isPowerOfFour(32));

    }
}

class powerOfFour123 {
    public boolean isPowerOfFour(int n) {
        if (n == 2 || n == 8 || n == 32 || n == 128 || n == 512 ||
                n == 2048 || n == 8192 || n == 32768 || n == 131072 ||
                n == 524288 || n == 2097152 || n == 8388608 ||
                n == 33554432 || n == 134217728 || n == 536870912) {
            return false;
        }

        return n > 0 && 1073741824 % n == 0;
    }

}
