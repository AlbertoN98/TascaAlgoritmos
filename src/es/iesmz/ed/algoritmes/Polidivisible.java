package es.iesmz.ed.algoritmes;

public class Polidivisible {
    private long numero;

    public Polidivisible(long numero) {
        this.numero = numero;
    }

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

    public boolean polidivisibleCheck() {
        return divisible();
    }
}