package Easy;

public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {

        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = index; j < nums2.length; j++) {

                if (nums1[i] == nums2[j])
                    return nums1[i];

                if(nums1[i]<nums2[j])
                    break;
                index++;
            }
        }

        return -1;

    }

}
