package com;

import java.util.Scanner;

public class CalculaCredito {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int nroCuenta;
    double saldoInicial = 0;
    int cargos ;
    double creditos = 0;
    double tope = 1000d;

    System.out.println("Ingrese el numero de cuenta: ");
    nroCuenta = entrada.nextInt();

    if (nroCuenta == 1){
        saldoInicial += 5000;
        creditos += 900;
        tope -= creditos;
    }

    if (nroCuenta == 2){
        saldoInicial += 4000;
        creditos += 1200;
        tope -= creditos;
    }

    if (nroCuenta == 3){
        saldoInicial += 3000;
        creditos += 800;
        tope -= creditos;
    }
    System.out.println("Ingrese el total de los articulos cargados");
    cargos = entrada.nextInt();

    double saldo = saldoInicial + cargos - creditos;

    if(tope <= 0){

        System.out.println("Se excedio el limite de su credito");
    }
    else {
        System.out.println("Su saldo restante es de: "+ saldo);
        System.out.println("Su limite de credito es de: $" + tope);
    }
    }
}
