package Easy;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {

        largestNumberAtLeastTwiceofOthers123 obj = new largestNumberAtLeastTwiceofOthers123();
        System.out.println(obj.dominantIndex(new int[] {0,0,3,2}));
    }
}

class largestNumberAtLeastTwiceofOthers123 {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max2 = max;
                max = nums[i];
                index = i;
            }
            if(nums[i]>max2 && nums[i]<max){
                max2 = nums[i];
            }
        }

        System.out.println("max:"+max + " max2:"+max2);


        return max/2 > max2 ? index : -1;
    }
}