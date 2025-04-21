package Medium;

public class CountPrime {
    public static void main(String[] args) {

        countPrime123 c1 = new countPrime123();
        System.out.println(c1.countPrimes(1500000));

    }
}
class countPrime123 {
    public int countPrimes(int n) {
        if (n <= 2) return 0;


        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Sàng Eratosthenes: đánh dấu các bội số của số nguyên tố là không nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (long j = (long)i * i; j < n; j += i) {
                    isPrime[(int)j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}

