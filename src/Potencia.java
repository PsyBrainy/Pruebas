import java.util.Scanner;

public class Potencia {

    public static double Potencia(double nro, double potencia){


        double total=0;
        total=nro * nro;
        int contador = 0;
        contador=2;
        while(contador != potencia)
        {
            contador++;
            total *= nro;
        }
            return total;
        }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el numero");
        int val1 = entrada.nextInt();
        System.out.println("Introduzca el elevado");
        int val2 = entrada.nextInt();

        System.out.println(Potencia((double)val1, (double)val2));
    }

}
