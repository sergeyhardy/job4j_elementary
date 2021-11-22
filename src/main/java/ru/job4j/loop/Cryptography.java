package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.length() == 0) {
         s = "empty";
        } else if (s.length() > 4) {
            StringBuilder cardCode = new StringBuilder(s);
            cardCode.replace(0, 12, "############");
            s = cardCode.toString();
      }

        return s;
    }
}

























