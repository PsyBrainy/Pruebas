package com;

import java.util.Scanner;

public class CalculaComision {

    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        double art1 = 239.99;
        double art2 = 129.75;
        double art3 = 99.95;
        double art4 = 350.89;
        double total = 0;
        int contador = 0;
        double sueldo = 200;

        System.out.println("Ingrese el articulo vendido");
        double in= entrada.nextInt();

        while (in != -1){
            System.out.println("Ingrese el articulo vendido");

            in= entrada.nextInt();
            contador++;
            if(in == 1){
                total+=art1;
            }
            else if(in == 2){
                total+=art2;
            }
            else if(in == 3){
                total+=art3;
            }
            else if(in == 4){
                total+=art4;
            }
            else if(in==-1){
                System.out.println("Semana terminada");
            }
            else{
                System.out.println("La opcion ingresada es incorrecta");
                --contador;
            }

        }

        double vendido = total * 0.09;

        sueldo += vendido;

        System.out.printf("%s%d%s%.2f%n","Esta semana usted vendio " , contador ,
                " articulos. Con un total de recaudo de $" , total);

        System.out.printf("%s%.2f","Su sueldo es de: $" , sueldo );

    }
}
