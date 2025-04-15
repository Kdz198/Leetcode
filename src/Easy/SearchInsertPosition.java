package Easy;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {

        searchinsertposition123 ss = new searchinsertposition123();
        int[] arr = {2, 5};
        System.out.println(ss.searchInsert(arr, 1));
    }
}

//0ms beat 100%
class searchinsertposition123 {
    public int searchInsert(int[] nums, int target) {

        int index = Arrays.binarySearch(nums, target);
        if (index >= 0) return index;

        if (nums.length == 1) {
            if (nums[0] > target) return 0;
            else return 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (target > nums[i]) {
                if (i == nums.length - 1) return i + 1;
                else if (target < nums[i + 1]) return i + 1;
            } else if (target < nums[i]) return i;
        }

        return 1;
    }
}