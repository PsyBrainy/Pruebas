package com;

import java.util.Scanner;

public class KilometrosPorLitros
{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double total = 0;
        int contador = 0;
        double total2 = 0;

        System.out.println("Introduzca los kilomentros recorridos: ");
        double kilometros = entrada.nextInt();

        System.out.println("Introduzca los litros usados: ");
        double litros = entrada.nextInt();

        while (kilometros != -1)
        {
            double y = kilometros / litros;
            total = total + y;
            ++contador;

            System.out.println("Introduzca los kilomentros recorridos o -1 para terminar: ");
            kilometros = entrada.nextInt();

            if (kilometros != -1)
            {
                System.out.println("Introduzca los litros usados: ");
                litros = entrada.nextInt();
            }

        }
        total2 = total/contador;
        System.out.printf("%s%d%s%.3f%s","El promedio de los ", contador , " viajes es de: ", total2 , " kl/lt");
    }
}

