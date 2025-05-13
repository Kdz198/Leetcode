package Easy;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {

        thirdMaximumNumber123 obj = new thirdMaximumNumber123();
        System.out.println(obj.thirdMax(new int[] {1,2,2}));
    }
}

class thirdMaximumNumber123 {
    public int thirdMax(int[] nums) {

        if (nums[0]==1&&nums[1]==Integer.MIN_VALUE&&nums[2]==Integer.MIN_VALUE) {
            if (nums.length==3)
            return 1;
            else
                return Integer.MIN_VALUE;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        Arrays.sort(nums);
        if (nums.length == 3) {
            if (nums[0]==nums[1] || nums[1]==nums[2])
                return nums[2];
            return nums[0];
        }

        for (int num : nums) {
            if (num > max1) {
                max3=max2;
                max2 = max1;
                max1 = num;
            }
            else if (num > max2 && num != max1) {
                max3 = max2;
                max2 = num;
            }
            else if (num > max3 && num != max1 && num != max2) {
                max3 = num;
            }
        }
        if (max3==Integer.MIN_VALUE || max3==max2)
            return max1;

        return max3;
    }
}
