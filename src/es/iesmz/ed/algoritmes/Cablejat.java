package es.iesmz.ed.algoritmes;

public class Cablejat {
    private String[] cables;

    public Cablejat(String[] cables) {
        this.cables = cables;
    }

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