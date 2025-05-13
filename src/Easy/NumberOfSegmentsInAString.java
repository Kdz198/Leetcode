package Easy;

public class NumberOfSegmentsInAString {
    public static void main(String[] args) {

        numberofSegment obj = new numberofSegment();
        System.out.println(obj.countSegments(", , , ,        a, eaefa"));
    }
}

class numberofSegment
{
    public int countSegments(String s) {

        s = s.trim();
        if (s == null || s.length() == 0) return 0;
        String [] arr =s.split("\\s+");



        return arr.length;
    }
}
