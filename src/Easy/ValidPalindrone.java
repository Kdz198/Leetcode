package Easy;

public class ValidPalindrone {
    public static void main(String[] args) {

        validPalindrone123 v = new validPalindrone123();
        System.out.println(v.isPalindrome("A man, a plan, a canal: Panama"));

    }
}

class validPalindrone123 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
