package Medium;

public class UglyNumberII {
    public static void main(String[] args) {

        uglyNumberII123 u = new uglyNumberII123();
        System.out.println(u.nthUglyNumber(1352));

    }
}
//Passed 500/596TC
class uglyNumberII123 {
    public int nthUglyNumber(int n) {

        int count=0;
        int i =0;
        while (count<n){

            i++;
            if (isUgly(i)) {
                count++;
            }

        }

        return i;
    }

    public boolean isUgly(int n) {

        if (n==0)
            return false;


        while (n % 5 == 0) n /= 5;

        while (n % 3 == 0) n /= 3;

        while (n % 2 == 0) n /= 2;

        return n==1;

    }
}

//Pass All
class uglyNumberII1234 {
    public int nthUglyNumber(int n) {
        long[] ugly = new long[n];
        ugly[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;

        long next2 = 2, next3 = 3, next5 = 5;


        for (int i = 1; i < n; i++) {
            long nextUgly = Math.min(next2, Math.min(next3, next5));
            ugly[i] = nextUgly;

            // Tăng con trỏ và cập nhật giá trị tiếp theo
            if (nextUgly == next2) {
                i2++;
                next2 = ugly[i2] * 2;
            }
            if (nextUgly == next3) {
                i3++;
                next3 = ugly[i3] * 3;
            }
            if (nextUgly == next5) {
                i5++;
                next5 = ugly[i5] * 5;
            }
        }

        // Trả về số xấu thứ n
        return (int) ugly[n-1];
    }
}