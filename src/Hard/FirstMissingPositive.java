package Hard;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] a = {1,2};
        firstMissingPositive2 f = new firstMissingPositive2();
        System.out.println(f.firstMissing(a));

    }
}

class firstMissingPositive2 {
    public int firstMissing(int[] nums) {

       Arrays.sort(nums);

        if (nums[nums.length-1] <=0)
            return 1;
       if (nums.length == 1)
       {
           for (int i = 1; i < 10; i++)
           {
               if (i!=nums[0])
                   return i;
           }
       }

        int expected = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < expected) continue;
            if (nums[i] == expected) expected++;
            else if (nums[i] > expected) return expected;
        }

        return expected;
    }
}
