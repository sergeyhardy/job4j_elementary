package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        boolean rsl = false;
        String str = String.valueOf(i);
        int dln = str.length();
        int v = 1;
        for (int j = 0; j < str.length() / 2; j++) {
            rsl = str.charAt(j) == str.charAt(dln - v);
            v++;
        }

        return rsl;
    }


}