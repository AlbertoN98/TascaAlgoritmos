package es.iesmz.ed.algoritmes;
/**
 * Esta clase representa un conjunto de cables USB que se van a conectar entre sí.
 *@author: Alberto Nieto
 *@version: 02/06/2023
 */

public class Cablejat {
    private String[] cables;

    /**
     * Constructor de la clase Cablejat.
     *
     * @param cables Un array de cadenas que representa las descripciones de los cables.
     */
    public Cablejat(String[] cables) {
        this.cables = cables;
    }
    /**
     * Verifica si es posible conectar todos los cables formando un círculo.
     *
     * @return true si es posible formar un círculo con los cables, false si no puede conectarse.
     */
    public boolean esPotConnectar() {
        int result = 0;
        for (String cable : cables) {
            for (int i = 0; i < cable.length(); i++) {
                if (cable.charAt(i) == 'H') {
                    result++;
                } else {
                    result--;
                }
            }
        }
        return result == 0;
    }
}