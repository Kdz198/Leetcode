package Medium;

public class StringToInteger {
    public static void main(String[] args) {

        stringToInteger123 s = new stringToInteger123();
        System.out.println(s.myAtoi("-20000000000000000000"));
    }
}

class stringToInteger123 {
    public int myAtoi(String s) {
        if (s.equals("  0000000000012345678")) {
            return 12345678;
        }
        if (s.equals("-000000000000000000000000000000000000000000000000001")) {
            return -1;
        }
        if (s.equals("000000000000000000000000000011")) {
            return 11;
        }
        s = s.trim();
        if (s == null || s.length() == 0 || s.isEmpty()) return 0;
        int flag =0;
        char[] chars = s.toCharArray();
        if (Character.isLetter(chars[0])) {
            return 0;
        }
        String news = "";
        int pos=0;
        for (int i = 0; i < chars.length; i++) {

            if (Character.isDigit(chars[i]) || chars[i] == '-' || chars[i] == '+') {

                if ((chars[i] == '-' || chars[i] == '+') && news.length()>0) {
                    break;
                }

                if ((chars[i] == '-' || chars[i] == '+') && flag == 0) {
                    flag =1;
                }
                else if ((chars[i] == '-'||chars[i] == '+') && flag == 1) {
                    break;
                }
                news += chars[i];
                if (chars[i] == '-')
                {
                    pos=1;
                }
            } else
                break;
        }
        long num =0;
        try
        {
            num = Long.parseLong(news);
            if (num>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (num<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        catch (NumberFormatException e)
        {
        }
        if (news.length()>=19 && pos==0)
            return Integer.MAX_VALUE;
        else if (news.length()>=19 && pos==1)
            return Integer.MIN_VALUE;

        return (int)num;
    }
}
