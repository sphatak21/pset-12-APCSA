import java.util.ArrayList;

public class ProblemSet12 {
    public static void main(String[] args) {
        int[] data = new int[]{11, 11};
        System.out.println(new ProblemSet12().strDist("cccatcowcatxx", "cat"));
    }

    public long factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n >= 1) {
            return n * factorial(n - 1);
        }
        return 1;

    }

    public long fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public long triangle(int rows) {
        if (rows < 0) {
            return -1;
        } else if (rows == 0) {
            return 0;
        }
        return rows + triangle(rows - 1);
    }

    public long sumDigits(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public long powerN(int base, int exponent) {
        if (base < 1 || exponent < 1) {
            return -1;
        }
        if (base == 1) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        return base * powerN(base, exponent - 1);
    }

    public String changeXY(String text) {
        if (text == null) {
            return null;
        }
        int i = text.indexOf("x");
        if (i >= 0) {
            String s1 = text.substring(0, i);
            String s2 = text.substring(i + 1);
            s1 += "y" + s2;
            return changeXY(s1);
        }
        return text;
    }

    public int array11(int[] data, int index) {
        if (data == null || index < 0 || index > data.length) {
            return -1;
        }
        if (index == data.length) {
            return 0;
        }
        if (data[index] == 11) {
            return array11(data, index + 1) + 1;
        } else {
            return array11(data, index + 1);
        }

    }

    public int strCount(String text, String sub) {
        if (text == null || sub == null || sub.equals("")) {
            return -1;
        }
        int i = text.indexOf(sub);
        if (i >= 0) {
            String str = text.substring(0, i);
            String str2 = text.substring(i + sub.length());
            return 1 + strCount(str + str2, sub);
        }
        return 0;
    }


    public boolean strCopies(String text, String sub, int n) {
        if (text == null || sub == null || sub.equals("") || n < 0) {
            return false;
        }
        return overlapping(text, sub, 0) == n;

    }

    public int strDist(String text, String sub) {
        if(text == null || sub == null || sub.equals("")){
            return -1;
        }
        return checkLongest(text, sub, 0) - text.indexOf(sub) + sub.length() - 1;

    }


    private int overlapping(String text, String sub, int index){
        index = text.indexOf(sub, index);
        if(index >= 0){
            return 1 + overlapping(text, sub, index+1);
        }
        return 0;
    }
    private int checkLongest(String text, String sub, int index){
        int newIndex = text.indexOf(sub, index);
        if(newIndex >= 0){
            return checkLongest(text, sub, newIndex+1);
        }
        return index;
    }

}