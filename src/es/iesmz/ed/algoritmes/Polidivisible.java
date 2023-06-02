package es.iesmz.ed.algoritmes;
/**
 * Esta clase representa representa un número polidivisible.
 *@author: Alberto Nieto
 *@version: 02/06/2023
 */
public class Polidivisible {
    private long numero;
    /**
     * Constructor de la clase Polidivisible.
     * @param numero El número polidivisible.
     */

    public Polidivisible(long numero) {
        this.numero = numero;
    }
    /**
     * Verifica si el número es divisible.
     * @return true si el número es divisible, false en caso contrario.
     */
    public boolean divisible() {
        if (numero < 10)
            return true;
        int longitud = 1;
        long copiaNumero = numero;
        while (copiaNumero > 9) {
            copiaNumero /= 10;
            longitud++;
        }
        if (numero % longitud != 0)
            return false;
        else
            return new Polidivisible(numero / 10).divisible();
    }
    /**
     * Verifica si el número es polidivisible.
     * @return true si el número es polidivisible, false en caso contrario.
     */

    public boolean polidivisibleCheck() {
        return divisible();
    }
}