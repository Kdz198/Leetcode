package Medium;

import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {

        topKFrequentElements123 t = new topKFrequentElements123();
        t.topKFrequent(new int[] {3,0,1,0},1);
    }
}

class topKFrequentElements123 {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        int [] res = new int[k];
        int count =0;

        if (k==1)
        {
            int max = 0;
            int maxvalue=0;
            for ( int num : map.keySet() ) {
                if (map.get(num)>max)
                {
                    max = map.get(num);
                    maxvalue = num;
                }
            }
            res[0] = maxvalue;
            return res;
        }

        while (res[res.length-1]==0)
        {
            int max = 0;
            int maxvalue=0;
            for ( int num : map.keySet() ) {
                if (map.get(num)>max)
                {
                    max = map.get(num);
                    maxvalue = num;
                }
            }
            res[count]=maxvalue;
            count++;
            map.remove(maxvalue);
        }

        for (int i = 0; i < k; i++)
        {
            System.out.println(res[i]);
        }
        return res;
    }
}
