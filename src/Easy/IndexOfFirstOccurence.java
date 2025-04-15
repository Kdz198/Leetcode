package Easy;

public class IndexOfFirstOccurence {
    public static void main(String[] args) {

        index index = new index();
        System.out.println(index.strStr("abc", "c"));
    }
}

class index {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;
        if (haystack.equals(needle)) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (needle.length() == 1) return i;

                boolean match = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (i + j >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) return i;
            }
        }
        return -1;
    }
}
