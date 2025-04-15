package Easy;

import java.util.HashMap;

public class MajorityNumber {
    public static void main(String[] args) {

        majority m = new majority();
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(m.majorityElement(arr));

    }
}

class majority {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }

        }
        return 0;
    }
}
