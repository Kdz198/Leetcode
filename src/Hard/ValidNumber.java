package Hard;

public class ValidNumber {
    public static void main(String[] args) {

        validNumber123 v = new validNumber123();
        System.out.println(  v.isNumber(".1"));

    }
}

class validNumber123 {
    public boolean isNumber(String s) {

        if (s.equals("Infinity")|| s.equals("-Infinity")||s.equals("NaN")|| s.equals("+Infinity"))
            return false;

        if (s.endsWith("f")||s.endsWith("F")||s.endsWith("D")||s.endsWith("d"))
            return false;

        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e)
        {

            try{
                double d = Double.parseDouble(s);
                return true;
            }
            catch (NumberFormatException e1)
            {
                return false;
            }
        }

    }
}
