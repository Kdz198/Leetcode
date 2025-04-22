package Easy;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {

        IntersectionOfTwoArraysII2 ii = new IntersectionOfTwoArraysII2();
        ii.intersect(new int[]{1,2,2,1},new int[]{2,2});
    }
}
class IntersectionOfTwoArraysII2 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                if (map.get(nums2[i]) == 0) {
                    map.remove(nums2[i]);
                }
                list1.add(nums2[i]);
            }
        }

        int[] res = new int[list1.size()];
        int i = 0;
        for (int num : list1) {
            res[i++] = num;
        }

        return res;

    }
}
