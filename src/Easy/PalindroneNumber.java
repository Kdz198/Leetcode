package Easy;

public class PalindroneNumber {

    public static void main(String[] args) {
        System.out.println("Hello fpt");
        xdx palindroneNumber123 = new xdx();
        palindroneNumber123.isPalindrome(322345);
    }
}


class xdx {
    public boolean isPalindrome(int x) {
        int flag = 0;
        long temp = 0;
        int z = x;
        if (x < 0) {
            return false;
        }
        if (x<10)
            return true;
        while (x>0) {
            int y = x % 10;
            x = x / 10;
            if ( flag==0)
            {
                flag++;
                temp = temp+y;
            }
            else
            {
                temp = temp*10+y;
            }

        }
        return temp == z;
    }
}