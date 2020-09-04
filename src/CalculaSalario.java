import java.util.Scanner;

public class CalculaSalario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int empleado;
        double horasTrabajadas = (int) 0;
        double sueldoXHora = 10;
        double total = 0;
        String nombreEmpleado = "";

        System.out.println("Ingrese el numero identificador del empleado");
        empleado = entrada.nextInt();

        if (empleado == 1){
            horasTrabajadas += 43;
            nombreEmpleado = "Pablo";
        }
        else if (empleado == 2){
            horasTrabajadas += 30;
            nombreEmpleado = "Laura";
        }
        else if (empleado == 3){
            horasTrabajadas += 28;
            nombreEmpleado = "Jose";
        }
        else {
            System.out.println("La opcion ingresada no pertenece a un empeado en nuestro registro");
        }

        if(horasTrabajadas > 40) {

            total += 40 * sueldoXHora;
            horasTrabajadas -= 40;
            sueldoXHora = sueldoXHora * 1.5;
            total += horasTrabajadas * sueldoXHora;
            horasTrabajadas += 40;
        }
        else{

            total += horasTrabajadas * sueldoXHora;

        }

        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("Horas trabajadas: " + (int) horasTrabajadas);
        System.out.println("Sueldo: " + total);

    }

}
