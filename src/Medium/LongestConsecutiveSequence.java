package Medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        longestConsecutiveSequence123 l = new longestConsecutiveSequence123();
        System.out.println(l.longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));
    }
}

//Memory 56mb beats 99%
//Runtime 18ms beats 86,78%
class longestConsecutiveSequence123 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int length = 1;
        Arrays.sort(nums);
        int max=1;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i+1]-nums[i] >1) {
                length=1;
            }
            else if (nums[i+1]-nums[i] == 1) {
                length++;
                if (length > max) {
                    max = length;
                }
            }


        }

        return max;
    }
}
