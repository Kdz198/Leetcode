package Easy;

import java.util.Arrays;

public class FindTheDifference {
    public static void main(String[] args) {

        findTheDifference123 f = new findTheDifference123();
        System.out.println(f.findTheDifference("abcd", "abcde"));

    }
}

class findTheDifference123
{
    public char findTheDifference(String s, String t) {

        char [] chars = s.toCharArray();
        char [] chars2 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);
        for(int i = 0; i < chars.length; i++)
        {
            if (chars[i] != chars2[i])
                return chars2[i];
        }

        return chars2[chars2.length - 1];
    }
}
