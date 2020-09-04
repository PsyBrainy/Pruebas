package com;

import java.util.Scanner;

public class CuentaDeAhorros {

    private static double tasaInteresAnual;

    private static double saldoAhorro;

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);


        System.out.println("Ingrese la tasa de interes para sus ahorradores");

        double tasa= entrada.nextInt();

        ModificarTasaInteres(tasa);

        double saldoAhorrador1=2000.0;
        double saldoAhorrador2=3000.0;

        System.out.printf("::::Ahorrador 1::::%n%nSaldo Base: %.1f%nInteres:  %s%.1f%nInteres a favor: %.2f%nSu saldo actual es de: %.2f%n%n", saldoAhorrador1,"% ",tasa,
                CalcularInteresMensual(tasaInteresAnual,saldoAhorrador1),
                (saldoAhorrador1+CalcularInteresMensual(tasaInteresAnual,saldoAhorrador1)));
        System.out.printf("::::Ahorrador 2::::%n%nSaldo Base: %.1f%nInteres:  %s%.1f%nInteres a favor: %.2f%nSu saldo actual es de: %.2f%n", saldoAhorrador2,"% ",tasa,
                CalcularInteresMensual(tasaInteresAnual,saldoAhorrador2),
                (saldoAhorrador2+CalcularInteresMensual(tasaInteresAnual,saldoAhorrador2)));
    }

    public static double CalcularInteresMensual(double tasaInteresAnual, double saldo){

        saldoAhorro=saldo;

        double resultado= (saldoAhorro * tasaInteresAnual)/12;

        return resultado;
    }
    public static void ModificarTasaInteres(double tasa){

        double tasa2=tasa/100;

        tasaInteresAnual=tasa2;
    }
}
