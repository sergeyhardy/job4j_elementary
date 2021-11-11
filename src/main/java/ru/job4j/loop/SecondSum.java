package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i = i + 2) {
            rsl += i;
        }
        return rsl;
    }
}
