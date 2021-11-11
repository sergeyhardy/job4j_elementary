package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int index = 0; index <= 4; index++) {
            if (hours[index] <= 8) {
                salary = salary + hours[index] * 10;
            } else if (hours[index] > 8) {
                salary = salary + 80 + (hours[index] - 8) * 15;
            }
        }
        for (int index = 5; index <= 6; index++) {
            if (hours[index] <= 8) {
                salary = salary + (hours[index] * 10) * 2;
            } else if (hours[index] > 8) {
                salary = salary + 80 * 2 + (hours[index] - 8) * 15 * 2;
            }
        }
        return salary;
    }
}