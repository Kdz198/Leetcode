package Easy;

import java.util.ArrayList;

public class MoveZero {
    public static void main(String[] args) {
        moveZero123 m = new moveZero123();
        int [] nums = {0,1,0,2,3,4,5,6,7,8,9};
        m.moveZeroes(nums);
    }
}
class moveZero123 {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) list.add(nums[i]);
            else
                count++;
        }
        for (int i=0;i<count;i++)
            list.add(0);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }

    }
}
