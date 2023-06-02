package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CablejatTest {

    @Test
    public void test1() {
        String[] connectors = { "HM" };
        Cablejat cablejat = new Cablejat(connectors);
        assertTrue(cablejat.esPotConnectar());
    }

    @Test
    public void test2() {
        String[] connectors = { "HH" };
        Cablejat cablejat = new Cablejat(connectors);
        assertFalse(cablejat.esPotConnectar());
    }

    @Test
    public void test3() {
        String[] connectors = { "HM", "MH" };
        Cablejat cablejat = new Cablejat(connectors);
        assertTrue(cablejat.esPotConnectar());
    }

    @Test
    public void test4() {
        String[] connectors = { "HM", "HH", "MM" };
        Cablejat cablejat = new Cablejat(connectors);
        assertTrue(cablejat.esPotConnectar());
    }
}