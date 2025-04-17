package Medium;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {

        findFirstAndLastPosition123 f = new findFirstAndLastPosition123();
        f.searchRange(new int[]{3, 3, 3}, 3);

    }
}

class findFirstAndLastPosition123 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                if (result[0] == -1)
                    result[0] = i;
                else
                    result[1] = i;
            }

        }
        if (result[1] == -1 && result[0] != -1) {
            result[1] = result[0];
        }
        return result;
    }
}
