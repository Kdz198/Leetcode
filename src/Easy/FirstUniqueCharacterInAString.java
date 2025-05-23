package Easy;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        System.out.println("hello 123");

        firstUnique r = new firstUnique();
        System.out.println(r.firstUniqChar("leetcode"));
    }
}

class firstUnique
{
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for ( int i = 0; i < s.length(); i++ )
        {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
