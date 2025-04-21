package Medium;

import java.util.HashSet;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {

        findTheDuplicateNumber123 f = new findTheDuplicateNumber123();
        System.out.println(f.findDuplicate(new int[]{1,2,3,4,3}));
    }
}

class findTheDuplicateNumber123 {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }

        return 0;
    }
}
