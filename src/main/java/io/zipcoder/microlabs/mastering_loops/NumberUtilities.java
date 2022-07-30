package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder n = new StringBuilder();

        for (int a = start; a < stop; a++) {
            if (a % 2 == 0) {
                n.append(Integer.toString(a));
            }

        }

        return n.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder n = new StringBuilder();

        for (int a = start; a < stop; a++) {
            if (a % 2 != 0) {
                n.append(a);
            }

        }
        return n.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        String s = "";

        for (int i = start; i < stop; i += step) {
            s = s + i * i;
        }
        return s;
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange(0, stop, 1);

    }


    public static String getRange(int start, int stop) {

        return NumberUtilities.getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder s = new StringBuilder();

        for (int i = start; i < stop; i += step) {
            s.append(i);
        }

        return s.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder s = new StringBuilder();

        for (int i = start; i < stop; i += step) {
            s.append(String.valueOf((int) Math.pow(i, exponent)));
        }
        return s.toString().toString();
    }
}
