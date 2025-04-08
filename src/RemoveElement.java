import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        removeElement1 remove1 = new removeElement1();
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        remove1.removeElement2(nums,2);
    }
}

class removeElement1 {
    public int removeElement2(int[] nums, int val) {

        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }
        list.sort(null);
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}
