package Easy;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {

        reverseVowelsOfAString123 r = new reverseVowelsOfAString123();
        System.out.println(r.reverseVowels("leetcode"));
    }
}

class reverseVowelsOfAString123 {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        char [] arr2 = new char[s.length()];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i'  || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
                arr2[i] = arr[i];
                arr[i]= 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                for (int j = 0; j < arr.length; j++) {
                    if (arr2[arr.length - j - 1] != 0) {
                        arr[i] = arr2[arr.length - j - 1];
                        arr2[arr.length - j - 1] = 0;
                        break;
                    }
                }
            }


        }

        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
}
