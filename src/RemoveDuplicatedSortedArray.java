import java.util.HashMap;
import java.util.TreeMap;

public class RemoveDuplicatedSortedArray {

    public static void main(String[] args) {

        remove2 remove = new remove2();
        int [] nums = {1,1,2};
        System.out.println(remove.removeDuplicates(nums));


    }


}

class remove {
    public int removeDuplicates(int[] nums) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }

        int index = 0;
        for (int key : map.keySet()) {
            nums[index++] = key;
        }
        System.out.println(map.toString());

        return map.size();
    }
}

class remove2 {
    public int removeDuplicates(int[] nums) {
        int k=1;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        return k;
    }
}