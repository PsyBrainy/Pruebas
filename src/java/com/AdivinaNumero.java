package com;

import java.security.SecureRandom;
import java.util.Scanner;

public class AdivinaNumero {

    private static final SecureRandom numeroAleatorio = new SecureRandom();

    public static void main(String[] args) {


        int b = 1 + numeroAleatorio.nextInt(101);

        Scanner entrada = new Scanner(System.in);
        int caca;

        do{
            System.out.println("Adivina un numero entero entre el 1 y el 100");
            caca = entrada.nextInt();

            if (caca < b && caca>0 && caca<101){
                System.out.println("mmm.. es mas que eso");
            }
            else if (caca> b && caca>0 && caca<101 ){
                System.out.println("No flashes, es menos!");
            }
            else if ((caca < 1) || (caca>100)){
                System.out.println("¿Que te pasa? ¿tenes problemas mentales? te dije UN NUMERO ENTERO DEL 1 AL 100!!");
            }
            else {
                System.out.println("CORRECTOOOUUU!!");
            }

        }
        while(caca != b);
    }


}
