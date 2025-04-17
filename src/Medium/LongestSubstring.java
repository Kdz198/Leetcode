package Medium;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {

        longestSubstring2 ls = new longestSubstring2();
        System.out.println(ls.lengthOfLongestSubstring("pwwkew"));

    }
}
class longestSubstring2 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;
        char[] chars = s.toCharArray();
        int max = 0;

        for (int i = 0; i < chars.length; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int count=0;
            for (int j = i ; j < chars.length; j++) {
                if (map.containsKey(chars[j])) {
                    break;
                }
                else
                {
                    map.put(chars[j], 1);
                    count++;
                }
            }
            if (count > max)
                max = count;
        }


        return max;
    }
}
