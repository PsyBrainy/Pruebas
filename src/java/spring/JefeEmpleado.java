package spring;

import java.util.Scanner;

public class JefeEmpleado implements Empleados {


    // Inyeccion con constructor
    public JefeEmpleado(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    private CreacionInformes informeNuevo;

    @Override
    public String getTareas() {

        return "Gestiono las cuestiones relativas a mis empleados de seccion.";
    }

    @Override
    public String getInforme() {
        return "Informe presentado por el jefe con arreglos " + informeNuevo.getInforme();
    }
}
