package Easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
selfDividingNumbers123 obj = new selfDividingNumbers123();
        System.out.println(obj.isSelfDividing(21));
    }
}
class selfDividingNumbers123 {

    boolean isSelfDividing (int x) {
        int temp =x;
        while (x != 0) {
            int k = x % 10;
            if (k == 0) return false;
            if (temp%k!=0) return false;
            x /= 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> res = new ArrayList<Integer>();
        for (int i=left; i<=right; i++) {
            if (isSelfDividing(i)) {
                res.add(i);
            }
        }

        return res;
    }
}