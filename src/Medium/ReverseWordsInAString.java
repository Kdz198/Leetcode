package Medium;

public class ReverseWordsInAString {
    public static void main(String[] args) {

        reverseWordsInAString123 r = new reverseWordsInAString123();
        System.out.println(r.reverseWords("example   good a"));

    }
}
class reverseWordsInAString123 {
    public String reverseWords(String s) {
        s = s.trim();

        //Cắt nhiều space, vì nếu chỉ để " " thì những space kế tiếp nhau sẽ tạo index thừa trong array
        String[] words = s.split("\\s+");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if(i!=0)
            reversed += words[i] + " ";
            else
                reversed += words[i];
        }


        return reversed;
    }
}
