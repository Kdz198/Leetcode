import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {

        singleNumber2 s = new singleNumber2();
        System.out.println(s.singleNumber(new int[]{4,1,2,1,2}));
    }
}
//11ms
class singleNumber123 {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            if (map.containsKey(num))
                map.put(num, 2);
            else map.put(num, 1);

        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) return num;
        }
        return 0;
    }
}

//1ms
class singleNumber2 {
    public int singleNumber(int[] nums) {
        int result = 0;
        // Phép XOR dùng để triệt tiêu các bit nhau với những số bị trùng
        // Nó + lại các số lần đầu, lần sau gặp thì tự - ra
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
