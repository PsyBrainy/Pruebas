package com;

import java.util.Scanner;

public class MenorValor {

    public static int MenorValor(int a, int b, int c)
    {
        int total = a;

        if (total > b){
            total = b;
        }
        if (total > c){
            total = c;
        }
        return total;

    }

    public static void main(String[] args) {

        Scanner entrda = new Scanner(System.in);

        System.out.println("Introduzca el primer entero:");
        int val1 = entrda.nextInt();

        System.out.println("Introduzca el segundo entero");
        int val2 = entrda.nextInt();

        System.out.println("Introduzca el tercer entero");
        int val3 = entrda.nextInt();

        int resultado = MenorValor(val1,val2,val3);

        System.out.println("El menor de los enteros es: " + resultado);
    }

}
