package Easy;

public class DetectCapital {
    public static void main(String[] args) {

    }
}

class DetectCapital123 {

    public boolean detectCapitalUse(String word) {

        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(word.length() - 1))) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        else if (Character.isLowerCase(word.charAt(0))) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        else if (Character.isUpperCase(word.charAt(0))) {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        else
        {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }




        return true;
    }
}
