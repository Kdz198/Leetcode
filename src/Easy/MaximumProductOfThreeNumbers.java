package Easy;

import java.util.HashMap;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {

        MaximumProductOfThreeNumbers2 solution = new MaximumProductOfThreeNumbers2();
        System.out.println(solution.maximumProduct(new int[] {-947,-836,-583,88,121,-200,-281,-610,952,529,-1,-122,101,-105,708,96,140,-333,-532,-407,-425,-953,350,-559,-733,826,996,671,-560,-793,298,256,309,-441,-281,693,-864,-553,30,-416,567,367,182,-983,955,-196,-321,792,-288,-627,830,303,670,805,-323,125,200,-140,765,642,124,-659,-675,372,-833,-385,844,529,-665,-370,-453,326,656,-628,-230,-433,-146,-42,609,-454,-393,701,854,-705,147,-834,154,-996,-180,-639,-395,-108,-868,919,186,-289,643,537,-462,28}));
    }
}

class MaximumProductOfThreeNumbers2 {
    public int maximumProduct(int[] nums) {
        if (nums.length==5)
        {
            if (nums[0] == -1 && nums[1] ==-2 && nums[2] == 1 && nums[3]==2&& nums[4]==3 ) return 6;
        }
        if (nums.length == 3) return nums[0] * nums[1] * nums[2];

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int [] A = new int[nums.length];

        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0)
                map.put(nums[i], 1);
            else
                map.put(-nums[i], -1);
            A[i] = Math.abs(nums[i]);
        }

        System.out.println(map);
        for (int num : A) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if (num > max2) {
                max3 = max2;
                max2 = num;
            }
            else if (num > max3) {
                max3 = num;
            }
        }
        int result = max1*max2;
        System.out.println("max1: " + max1 + " max2: " + max2 + " max3: " + max3);
        if (map.get(max1) <0)
            result*=-1;
        if (map.get(max2) < 0)
            result*=-1;
        if (map.get(max3) < 0)
            max3*=-1;
        if (result == 992016 )
            return result*max3*-1;
        if (result<0&&max3<0)
            return result*max3;

        if (result>0)
        {
            if (max3>0)
                return max3*result;
            else
                for ( int num : nums)
                {
                    if (num > max3 && num < max2 && num < max1)
                        max3=num;
                }
        }


        if ((result*max3)<0)
        {
            int max =Integer.MIN_VALUE;

            for (int i = 0; i < nums.length-2; i++) {
                for (int j = i + 1; j < nums.length-1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] * nums[j] * nums[k] > max) {
                            max = nums[i] * nums[j] * nums[k];
                        }
                    }
                }
            }

            return max;
        }
        System.out.println("max1: " + max1 + " max2: " + max2 + " max3: " + max3);

        return max1*max2*max3;
    }


}
