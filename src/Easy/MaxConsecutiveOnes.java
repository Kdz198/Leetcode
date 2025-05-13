package Easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        MaxConsecutiveOnes2 obj = new MaxConsecutiveOnes2();
        System.out.println(obj.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }
}

class MaxConsecutiveOnes2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count++;
            else
                count = 0;
            if (count > max)
                max = count;

        }


        return max;
    }
}
