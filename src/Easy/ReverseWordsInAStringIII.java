package Easy;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {

        ReverseWordsInAStringII123 solution = new ReverseWordsInAStringII123();
        System.out.println(solution.reverseWords("Let's take LeetCode contest"));
    }
}
class ReverseWordsInAStringII123 {
    public String reverseWords(String s) {

        String [] words = s.split(" ");
        String s1 ="";
        for (int i=0; i<words.length; i++){

            for (int j=words[i].length()-1; j>=0; j--){
                s1 += words[i].charAt(j);

            }
            if (i!=words.length-1){
                s1 += " ";
            }
        }


        return s1;
    }
}
