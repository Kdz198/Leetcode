package Easy;

import java.util.HashMap;

public class LongestPalindrone {
    public static void main(String[] args) {

        longestPalindrone123 obj = new longestPalindrone123();
        System.out.println(obj.longestPalindrome("ccc"));
    }
}

class longestPalindrone123
{
    public int longestPalindrome(String s) {

        if (s == null || s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;

        int max =0;
        int maxcenter=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (map.size() == 1)
            return map.get(s.charAt(0));

        for (char c : map.keySet()) {
            System.out.println(c + ": " + map.get(c));
            if (map.get(c) %2 ==0) {
                max += map.get(c);
            }
            else
            {
                if (map.get(c) > maxcenter) {
                    maxcenter = map.get(c);
                }
                if (map.get(c)>1)
                {
                    max += map.get(c)-1;
                }
            }

        }
        if (maxcenter ==1 )
            max += maxcenter;
        else if (maxcenter!=0)
            max++;

        return max;
    }
}
