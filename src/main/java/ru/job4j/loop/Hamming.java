package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int rsl = 0;
        for (int index = 1; index <= left.length(); index++) {
            if (left.charAt(index - 1) != right.charAt(index - 1)) {
                rsl++;
            }
        }
        return rsl;
    }
}