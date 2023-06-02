package es.iesmz.ed.algoritmes;

public class SumaDescendente {
    private long numero;

    public SumaDescendente(long numero) {
        this.numero = numero;
    }
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
