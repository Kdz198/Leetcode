public class PowerOfTwo {
    public static void main(String[] args) {

        powerOfTwo123 p = new powerOfTwo123();
        System.out.println(p.isPowerOfTwo(3));
    }
}
class powerOfTwo123 {
    public boolean isPowerOfTwo(int n) {

        for (int i = 0; i <= 31; i++) {
            if (Math.pow(2,i) == n) {
                return true;
            }
            else if (Math.pow(2,i) > n) {
                break;
            }
        }

        return false;
    }
}
