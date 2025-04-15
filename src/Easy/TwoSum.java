package Easy;

public class TwoSum {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int [] a = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }


}

class Solution {
    public int[] twoSum(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] a = {i, j};
                    return a;
                }
            }
        }
        return null;
    }
}
