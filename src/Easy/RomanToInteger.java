package Easy;

public class RomanToInteger {
    public static void main(String[] args) {
        roman roman = new roman();
        System.out.println(roman.romanToInt("MCMXCIV"));
    }
}

class roman {
    public int romanToInt(String s) {
        int temp = 0;
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

            if (a[i] == 'I') {
                if (i + 1 < a.length) {
                    if (a[i + 1] == 'V') {
                        temp += 4;
                        i++;
                    } else if (a[i + 1] == 'X') {
                        temp += 9;
                        i++;
                    } else {
                        temp += 1;
                    }
                } else {
                    temp += 1;
                }
            } else if (a[i] == 'V') {
                temp += 5;
            } else if (a[i] == 'X') {
                if (i + 1 < a.length) {
                    if (a[i + 1] == 'L') {
                        temp += 40;
                        i++;
                    } else if (a[i + 1] == 'C') {
                        temp += 90;
                        i++;
                    } else {
                        temp += 10;
                    }
                } else {
                    temp += 10;
                }
            } else if (a[i] == 'L') {
                temp += 50;
            } else if (a[i] == 'C') {
                if (i + 1 < a.length) {
                    if (a[i + 1] == 'D') {
                        temp += 400;
                        i++;
                    } else if (a[i + 1] == 'M') {
                        temp += 900;
                        i++;
                    } else {
                        temp += 100;
                    }
                } else {
                    temp += 100;
                }
            } else if (a[i] == 'D') {
                temp += 500;
            } else if (a[i] == 'M') {
                temp += 1000;
            }
        }
        return temp;
    }
}