package com.daniel.estagio;

public class Exercicio1 {
    public static void main(String[] args) {

        System.out.println("O valor é: " + method());
        //O valor é: 91
    }

    private static int method() {
        int soma = 0;
        int indice = 13;
        int k = 0;
        while (k < indice) {
            k += 1;
            soma += k;
        }
        return soma;
    }
}
