package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas10Then3() {
        int[] data = {7, 8, 9, 10};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot15ThenMin1() {
        int[] data = {11, 12, 13, 14};
        int el = 15;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind5() {
        int[] data = new int[] {3, 1, 4, 2, 5, 3, 6};
        int el = 3;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFoundThenMinus1() {
        int[] data = new int[] {11, 4, 5, 3, 15, 23, 6};
        int el = 2;
        int start = 0;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}