package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (s == "") {
            s = "empty";
        } else if (s.length() > 4) {

            sb.setCharAt(sb.length() - 1, '*');
            sb.setCharAt(sb.length() - 2, '*');
            sb.setCharAt(sb.length() - 3, '*');

        }
        return s;
    }
}