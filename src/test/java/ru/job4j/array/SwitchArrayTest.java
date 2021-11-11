package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to2() {
        int[] input = {5, 6, 7, 8, 9};
        int source = 1;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 7, 6, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to2() {
        int[] input = {10, 11, 12, 13};
        int source = 0;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {12, 11, 10, 13};
        Assert.assertArrayEquals(expected, result);
    }
}