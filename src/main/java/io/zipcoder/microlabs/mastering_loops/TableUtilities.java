package io.zipcoder.microlabs.mastering_loops;

import javax.swing.text.Utilities;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return TableUtilities.getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return TableUtilities.getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder s = new StringBuilder();

        for(int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                s.append(String.format("%3d |", i * j));
            }
            s.append("\n");
            System.out.print(s);

        }
        return s.toString();
    }
}
