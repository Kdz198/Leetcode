package Easy;

public class LengthOfLastWord {
    public static void main(String[] args) {

        lengthOfLastWord123 lengthOfLastWord123 = new lengthOfLastWord123();
        System.out.println(lengthOfLastWord123.lengthOfLastWord("   fly me   to   the moon  "));

    }
}
//0ms beat 100%
class lengthOfLastWord123 {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        char [] chars = s.toCharArray();
        int count =0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                break;
            }
            count++;
        }

        return count;
    }
}