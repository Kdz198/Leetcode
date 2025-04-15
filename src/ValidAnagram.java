import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        validAnagram1234 v = new validAnagram1234();
        System.out.println(v.isAnagram("anagram", "nagaram"));
    }
}
class  validAnagram123 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1.length; j++) {
                if (s1[i] == t1[j]) {
                    t1[j] = 0;
                    break;
                }
            }
        }
        for (char c : t1) {
            if (c != 0) return false;
        }

        return true;
    }
}

class  validAnagram1234 {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }
}