package Easy;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {

        MaximumAverageSubarray123 obj = new MaximumAverageSubarray123();
        System.out.println(obj.findMaxAverage(new int[] {1,12,-5,-6,50,3}, 5));

    }
}
class MaximumAverageSubarray123 {
    public double findMaxAverage(int[] nums, int k) {

        double result = Integer.MIN_VALUE;

        for ( int i = 0 ; i <= nums.length-k ; i++){
            double sum = 0;
            for (int j = i ; j < i+k ; j++){
                sum += nums[j];
            }
            System.out.println("sum = " + sum);
            if (sum/k > result){
                result = sum/k;
            }
        }


        return result;
    }
}
