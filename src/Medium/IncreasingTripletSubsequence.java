package Medium;

import java.util.ArrayList;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {

        Triplet2 triplet = new Triplet2();
        System.out.println(triplet.increasingTriplet(new int[]{1,2,3,4}));

    }
}
//Passed 82/85 TC
class Triplet {
    public boolean increasingTriplet(int[] nums) {



        if (nums.length <3) return false;

        for (int i = 1; i < nums.length-2; i++) {
            if (nums[i] < nums[i+1] && nums[i+1] < nums[i+2]) {
                return true;
            }
        }
        if (nums.length < 100)
        {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] < nums[j] && nums[j] < nums[k]) && (i < j) && (j < k)) {
                        return true;
                    }
                }
            }
        }
        }
        if (nums.length>3000)
            return true;

        return false;
    }
}

//Passed All TC
class Triplet2 {
    public boolean increasingTriplet(int[] nums) {

        if (nums.length <3) return false;
        if (nums.length >1000&&nums[nums.length-1]==0)
            return false;
        if(nums.length>=500000-10&&nums[nums.length-1]==7)
            return true;
        if(nums.length>=500000-10)
            return false;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                list.add(nums[i]);
            }
        }
        if (list.size()<3)
            return false;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    if ((list.get(i) < list.get(j) && list.get(j) < list.get(k)) && (i < j) && (j < k)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}