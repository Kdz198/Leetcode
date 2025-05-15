package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidPalindromeII {
    public static void main(String[] args) {

        validPalindromeII123 obj = new validPalindromeII123();
        System.out.println(obj.validPalindrome("bddb"));
    }
}

/*
*  Made by TieHung23
*
*
* */

class validPalindromeII123 {
    boolean DeQuy(int left, int right, int cnt, String s2){
        System.out.println(left + "-" + right + "-" + cnt);
        if( cnt > 1) return false;
        if( left == right) return true;
        if ( left > right) return true;
        if( s2.charAt(left)  != s2.charAt(right) ) {
            if(DeQuy(left+1, right, cnt+1, s2)) return true;
            if(DeQuy(left, right-1, cnt+1, s2)) return true;
        }
        if( s2.charAt(left)  == s2.charAt(right)){
            if(DeQuy(left+1, right-1, cnt, s2)) return true;
        }
        return false;
    }
    public boolean validPalindrome(String s) {


//        ìf (s.)
//
//
//
//        int flag =0;
//
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
//                flag++;
//            }
//        }
//        if (flag == 0) {
//            return true;
//        }
//        else {
//            ArrayList<Character> list = new ArrayList<>();
//            for (int i = 0; i < s.length(); i++) {
//                list.add(s.charAt(i));
//            }
//            for (int i = 0; i < s.length(); i++)
//            {
//                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
//                   list.remove(s.length() - 1 - i);
//                    System.out.println(s.charAt(s.length() - 1 - i));
//                    break;
//                }
//            }
//           // String s2 = Arrays.toString(list.toArray()); // bị convert thành dạng array, có dấu , và []
//            String s2 = "";
//            for (int i = 0; i < list.size(); i++) {
//                s2 += list.get(i);
//            }
//
//            for (int i = 0; i < s2.length(); i++) {
//                if (s2.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
//                    return false;
//                }
//            }
//        }


        return DeQuy(0, s.length()-1, 0, s);

    }
}
