package com.daniel.estagio;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int number = scanner.nextInt();

        System.out.println(isFib(number));
    }

    private static String isFib(int number) {
        int a = 0;
        int b = 1;
        while (b < number) {
            int temp = b;
            b += a;
            a = temp;
        }
        return b == number ? "O número " + number + " pertence à sequência" : "O número " + number + " NÃO pertence à sequência";
    }
}