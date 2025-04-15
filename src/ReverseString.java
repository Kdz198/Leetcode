public class ReverseString {
    public static void main(String[] args) {

        char[] a = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        reverseString123 reverseString123 = new reverseString123();
        reverseString123.reverse(a);

    }
}

//0ms beat 100%
class reverseString123 {
    public void reverse(char[] s) {

        char [] temp = new char[s.length];
        for (int i=0; i<s.length; i++)
        {
            temp[s.length-1-i] = s[i];
        }
        for (int i=0; i<s.length; i++)
           s[i]=temp[i];
    }
}
