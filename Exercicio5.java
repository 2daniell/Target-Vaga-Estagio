package com.daniel.estagio;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Target");
        System.out.println("========");
        System.out.println(reverseString("Target"));
        //Saida: tegraT
    }

    private static String reverseString(String string) {
        char[] arrayString = string.toCharArray();
        int lastIndex = string.length() - 1;
        for(int i = 0; i < string.length() / 2; i++) {
            arrayString[i] = string.charAt(lastIndex - i);
            arrayString[lastIndex - i] = string.charAt(i);
        }
        return String.valueOf(arrayString);
    }
}
