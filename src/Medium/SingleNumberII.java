package Medium;

import java.util.Arrays;

public class SingleNumberII {
    public static void main(String[] args) {

        singleNumberII123 s = new singleNumberII123();
        System.out.println(s.singleNumber(new int[]{2, 2, 3, 2}));

    }
}

class singleNumberII123 {
    public int singleNumber(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        Arrays.sort(nums);
        if (nums[nums.length - 1] != nums[nums.length - 2] && nums[nums.length - 1] != nums[nums.length - 3])
            return nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i = i + 2;
            } else
                return nums[i];
        }

        return 0;
    }
}
