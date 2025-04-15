import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {

        containsDuplicateII123 c = new containsDuplicateII123();
        System.out.println(c.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
}

class containsDuplicateII123 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs( map.get(nums[i])-i) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
