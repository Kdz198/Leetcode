package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        IntersectionOfTwoArrays2 i = new IntersectionOfTwoArrays2();
        i.intersection(new int[]{1,2,3},new int[]{2,2});
    }
}
class IntersectionOfTwoArrays2 {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                set.add(nums2[i]);
            }
        }
        // có thể dùng 2 cái set, set1.retainAll(set2) là sẽ tự động thực hiện phép giao trên set1
        int[] res = new int[set.size()];
        int i = 0;
        for (int num : set) {
            res[i++] = num;
        }

        return res;
    }
}
