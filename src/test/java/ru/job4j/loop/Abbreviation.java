package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                builder.append(s.charAt(i + 1));
            }
        }
        s = builder.toString();
        return s;
    }
}