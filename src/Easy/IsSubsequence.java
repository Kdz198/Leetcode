package Easy;

public class IsSubsequence {
    public static void main(String[] args) {

        isSubsequence123 obj = new isSubsequence123();
        System.out.println(obj.isSubsequence("aaaaaa", "bbaaaa"));

    }
}

//0ms beat 100%
class isSubsequence123 {
    public boolean isSubsequence(String s, String t) {

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        if (t.contains(s))
            return true;

        int index = 0;
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = index; j < t1.length; j++) {
                if (s1[i] == t1[j]) {
                    if (j == t1.length-1)
                        index = j;
                    else
                        index = j + 1;
                    count++;
                    break;
                }
            }
            if (index==t1.length-1)
                break;
        }
        return count == s1.length;
    }
}