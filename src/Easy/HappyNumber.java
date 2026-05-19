package Easy;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {
    HappyNumber123 h = new HappyNumber123();
        System.out.println(h.isHappy(17));
    }
}

class HappyNumber123 {
    public boolean isHappy(int n) {
        return isHappy(n,0);
    }

    public boolean isHappy(int n, int k) {
        if( k == 1000) return false;
        int sum = 0;
        while( n > 0 ){
          sum+=Math.pow(n%10,2);
          n = n/10;
        }

        if( sum == 1) return true;
        return isHappy(sum,k+1);
    }
}
