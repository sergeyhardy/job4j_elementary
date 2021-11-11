package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void nameOfDay() {
        System.out.println(SwitchWeek.nameOfDay(1));
        System.out.println(SwitchWeek.nameOfDay(2));
        System.out.println(SwitchWeek.nameOfDay(3));
        System.out.println(SwitchWeek.nameOfDay(4));
        System.out.println(SwitchWeek.nameOfDay(8));

    }
}