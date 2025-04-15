package Easy;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {

        containsDuplicate123 c = new containsDuplicate123();
        System.out.println(c.containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}

class containsDuplicate123 {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }

        return false;
    }
}
