package com;

import java.util.Arrays;
import java.util.Scanner;

public class TaTeTi {
    

    public static int jugador =1;

    public enum Estado{X,O,VACIO};

    private static final Estado[][]tabla=new Estado[3][3];

    public TaTeTi(Estado[][] tabla) {

        for (Estado[] estados : tabla) {
            Arrays.fill(estados, Estado.VACIO);
        }

    }
    public static void ImprimirTabla(){
        System.out.println("---------------------------------------------");

        for (Estado[] estados : tabla) {
            for (Estado estado : estados) {
                if (estado == Estado.VACIO) {
                    System.out.printf("%10s%5s", estado, "|");
                } else {
                    System.out.printf("%8s%7s", estado, "|");
                }

            }

            System.out.println();
            System.out.println("---------------------------------------------");
        }
    }

    public static boolean Ganar(){

        boolean win=false;

        for (int i=0;i<tabla.length;i++) {
            if(win==true){
                break;
            }
            for (int j = 0; j < tabla[i].length; j++) {

                if(win==true){
                    break;
                }

                if (equals(tabla[0][0], tabla[1][1], tabla[2][2]) && tabla[i][j]!=Estado.VACIO) {
                    win = true;
                    break;
                } else if (equals(tabla[0][0], tabla[1][0], tabla[2][0])) {
                    win = true;
                    break;
                } else if (equals(tabla[0][1], tabla[1][1], tabla[2][1])) {
                    win = true;
                    break;
                } else if (equals(tabla[0][2], tabla[1][2], tabla[2][2])) {
                    win = true;
                    break;
                } else if (equals(tabla[2][0], tabla[2][1], tabla[2][2])) {
                    win = true;
                    break;
                } else if (equals(tabla[1][0], tabla[1][1], tabla[1][2])) {
                    win = true;
                    break;
                } else if (equals(tabla[0][0], tabla[0][1], tabla[0][2])) {
                    win = true;
                    break;
                } else if (equals(tabla[2][0], tabla[1][1], tabla[0][2])) {
                    win = true;
                    break;
                }
            }
        }
        return win;
    }
    public static boolean FinJuego(){
        boolean caca=true;
        for (Estado[] estados : tabla) {
            for (Estado estado : estados) {
                if (estado == Estado.VACIO) {
                    caca = false;
                    break;
                }
            }
        }
        return caca;
    }

    public static void Opcion( int id){

        Scanner  entrada=new Scanner(System.in);

        boolean repetir=false;
        int contador = 0;
        int casillero;

        do{
            System.out.println("Elija jugador "+id);
            casillero = entrada.nextInt();
            while(casillero>9||casillero<0){
                System.out.println("La opcion ingresada es incorrecta, vuelva a intentarlo");
                System.out.println("Sigue el orden de las casillas de la siguiente menera:\n" +
                        "(1)(2)(3)\n" +
                        "(4)(5)(6)\n" +
                        "(7)(8)(9)");
                casillero = entrada.nextInt();
            }
            if(id==1){
                if (casillero==1&& tabla[0][0]==Estado.VACIO){
                    tabla[0][0]=Estado.X;
                    repetir=false;
                }
                else if(casillero==2&& tabla[0][1]==Estado.VACIO){
                    tabla[0][1]=Estado.X;
                    repetir=false;
                }
                else if(casillero==3&& tabla[0][2]==Estado.VACIO){
                    tabla[0][2]=Estado.X;
                    repetir=false;
                }
                else if(casillero==4&& tabla[1][0]==Estado.VACIO){
                    tabla[1][0]=Estado.X;
                    repetir=false;
                }
                else if(casillero==5&& tabla[1][1]==Estado.VACIO){
                    tabla[1][1]=Estado.X;
                    repetir=false;
                }
                else if(casillero==6&& tabla[1][2]==Estado.VACIO){
                    tabla[1][2]=Estado.X;
                    repetir=false;
                }
                else if(casillero==7&& tabla[2][0]==Estado.VACIO){
                    tabla[2][0]=Estado.X;
                    repetir=false;
                }
                else if(casillero==8&& tabla[2][1]==Estado.VACIO){
                    tabla[2][1]=Estado.X;
                    repetir=false;
                }
                else if(casillero==9&& tabla[2][2]==Estado.VACIO){
                    tabla[2][2]=Estado.X;
                    repetir=false;
                }
                else{
                    contador++;
                    repetir=true;
                }
            }
            else if(id==2){
                if (casillero==1&&tabla[0][0]==Estado.VACIO){
                    tabla[0][0]=Estado.O;
                    repetir=false;
                }
                else if(casillero==2&& tabla[0][1]==Estado.VACIO){
                    tabla[0][1]=Estado.O;
                    repetir=false;
                }
                else if(casillero==3&& tabla[0][2]==Estado.VACIO){
                    tabla[0][2]=Estado.O;
                    repetir=false;
                }
                else if(casillero==4&& tabla[1][0]==Estado.VACIO){
                    tabla[1][0]=Estado.O;
                    repetir=false;
                }
                else if(casillero==5&& tabla[1][1]==Estado.VACIO){
                    tabla[1][1]=Estado.O;
                    repetir=false;
                }
                else if(casillero==6&& tabla[1][2]==Estado.VACIO){
                    tabla[1][2]=Estado.O;
                    repetir=false;
                }
                else if(casillero==7&& tabla[2][0]==Estado.VACIO){
                    tabla[2][0]=Estado.O;
                    repetir=false;
                }
                else if(casillero==8&& tabla[2][1]==Estado.VACIO){
                    tabla[2][1]=Estado.O;
                    repetir=false;
                }
                else if(casillero==9&& tabla[2][2]==Estado.VACIO){
                    tabla[2][2]=Estado.O;
                    repetir=false;
                }
                else{
                    contador++;
                    repetir=true;
                }
            }
            if(repetir==true){
                System.out.println("La opcion ingresada ya esta ocupada, por favor, vuelva a intentarlo");
            }
        }while(repetir==true);

    }

    private static boolean equals(Estado estado, Estado estado1, Estado estado2) {

        boolean caca=false;
        if(estado!=Estado.VACIO&&estado1!=Estado.VACIO&&estado2!=Estado.VACIO){
            if(estado.equals(estado1) && estado.equals(estado2)){
                caca=true;
            }
        }
        return caca;
    }


    public static void main(String[] args) {


        System.out.println("|||||¡¡BIENVENDO AL TATETI!!|||||\n\nLa jugabilidad es muy simple:\n\nComienza el jugador 1 con la X, " +
                "cada espacio esta representado por un numero del 1 al 9 " +
                "\nSiguiendo el orden de las casillas de la siguiente menera:" +
                "\n(1)(2)(3)" +
                "\n(4)(5)(6)" +
                "\n(7)(8)(9)\n");


        Scanner entrada =new Scanner(System.in);
        int casillero;

        new TaTeTi(tabla);
        ImprimirTabla();
        while(!Ganar() ||!FinJuego()){

            if(jugador ==1){

                Opcion(jugador);

                ImprimirTabla();
                if(Ganar()){
                    System.out.println("Gana el Jugador "+ jugador+ " :D");
                    break;
                }
                FinJuego();
                jugador++;
            }
            else if(jugador==2){

                Opcion(jugador);

                ImprimirTabla();
                if(Ganar()){
                    System.out.println("Gana el Jugador "+ jugador+ " :D");
                    break;
                };
                FinJuego();
                jugador--;
            }
        }
        if(FinJuego()){
            System.out.println("No quedan mas casilleros");
        }
        else if(Ganar()){
            System.out.println("Felicitaciones");
        }
    }


}