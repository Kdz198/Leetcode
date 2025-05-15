package Easy;

import java.util.Arrays;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {

    }
}
class smallestLetterGreaterThanTarget123 {
    public char nextGreatestLetter(char[] letters, char target) {


        Arrays.sort(letters);
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }


        return letters[0];
    }
}
