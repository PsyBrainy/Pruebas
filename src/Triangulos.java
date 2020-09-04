import java.util.Scanner;

public class Triangulos { //POTENCIA DE UN NUMERO

    public static double Hipotenusa(int id, double cateto1, double cateto2)
    {
        double hipCuad = Math.pow(cateto1,2) + Math.pow(cateto2,2);
        double hip = Math.sqrt(hipCuad);

        return hip;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca identificador de triangulo rectangulo:");
        int id = entrada.nextInt();
        System.out.println("Introduzca el cateto 1:");
        double caca1 = entrada.nextInt();
        System.out.println("Introduzca el cateto 2:");
        double caca2 = entrada.nextInt();

        double caca3 = Hipotenusa(id,caca1,caca2);

        System.out.println("El valor de la hipotenusa es: " + caca3);

    }



}
