public class ClimbingStair {
    public static void main(String[] args) {

        climbingStair123 c = new climbingStair123();
        System.out.println(c.climbStairs(4));
    }
}

class climbingStair123 {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int oneStep = 1;
        int twoSteps = 2;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = oneStep + twoSteps; // Ways to reach current step
            oneStep = twoSteps;         // Update for next iteration
            twoSteps = result;
        }

        return result;
    }
}
