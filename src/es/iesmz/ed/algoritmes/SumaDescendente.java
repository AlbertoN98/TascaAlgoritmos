package es.iesmz.ed.algoritmes;

/**
 * Esta clase calcula la suma descendente de un numero.
 *@author: Alberto Nieto
 *@version: 02/06/2023
 */

public class SumaDescendente {
    private long numero;

    /**
     * Constructor de la clase SumaDescendente.
     *
     * @param numero El número en cuestión.
     */
    public SumaDescendente(long numero) {
        this.numero = numero;
    }
    /**
     * Calcula la suma descendente del número.
     *
     * @return La suma descendente.
     */
    public long suma() {
        String num = String.valueOf(numero);
        long suma = 0;

        for (int i = 0; i < num.length(); i++) {
            String subNumero = num.substring(i);
            suma += Long.parseLong(subNumero);
        }
        return suma;
    }
}
