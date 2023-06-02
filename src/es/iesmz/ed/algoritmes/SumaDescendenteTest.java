package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaDescendenteTest {

    @Test
    public void test1() {
        SumaDescendente sumaDescendent = new SumaDescendente(4578);
        assertEquals(5242, sumaDescendent.suma());
    }

    @Test
    public void test2() {
        SumaDescendente sumaDescendent = new SumaDescendente(9);
        assertEquals(9, sumaDescendent.suma());
    }

    @Test
    public void test3() {
        SumaDescendente sumaDescendent = new SumaDescendente(7545);
        assertEquals(8140, sumaDescendent.suma());
    }

    @Test
    public void test4() {
        SumaDescendente sumaDescendent = new SumaDescendente(0);
        assertEquals(0, sumaDescendent.suma());
    }
}