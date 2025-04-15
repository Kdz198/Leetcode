import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        missingNumber2 m = new missingNumber2();
        System.out.println(m.missingNumber(new int[]{1, 2, 3, 5, 0}));

    }
}

class missingNumber2 {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
