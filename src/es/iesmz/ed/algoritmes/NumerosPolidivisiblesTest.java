package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosPolidivisiblesTest {

    @Test
    public void test1() {
        Polidivisible polidivisible = new Polidivisible(381654729);
        assertTrue(polidivisible.polidivisibleCheck());
    }

    @Test
    public void test2() {
        Polidivisible polidivisible = new Polidivisible(123456789);
        assertFalse(polidivisible.polidivisibleCheck());
    }

    @Test
    public void test3() {
        Polidivisible polidivisible = new Polidivisible(381654727);
        assertFalse(polidivisible.polidivisibleCheck());
    }

    @Test
    public void test4() {
        Polidivisible polidivisible = new Polidivisible(381604729);
        assertFalse(polidivisible.polidivisibleCheck());
    }

    @Test
    public void test5() {
        Polidivisible polidivisible = new Polidivisible(345654);
        assertTrue(polidivisible.polidivisibleCheck());
    }

    @Test
    public void test6() {
        Polidivisible polidivisible = new Polidivisible(9876);
        assertTrue(polidivisible.polidivisibleCheck());
    }

    @Test
    public void test7() {
        Polidivisible polidivisible = new Polidivisible(102);
        assertTrue(polidivisible.polidivisibleCheck());
    }
}