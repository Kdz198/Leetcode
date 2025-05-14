package Easy;

import java.util.Arrays;
import java.util.HashSet;

public class SetMismatch {
    public static void main(String[] args) {
        setMismatch123 obj = new setMismatch123();
        System.out.println(obj.findErrorNums(new int[] {3,2,2}));
    }
}

class setMismatch123 {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int n =0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                n=nums[i];
                break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i+1)) {
                return new int[] {n,i+1};
            }
        }



        return null;
    }
}
