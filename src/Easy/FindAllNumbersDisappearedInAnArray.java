package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {

        FindAllNumbers f = new FindAllNumbers();
        System.out.println(f.findDisappearedNumbers(new int[]{1,1}));
    }
}
class FindAllNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {


        List<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <=nums.length; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
