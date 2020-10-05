package spring;

import spring.Empleados;

public class DirectorEmpleado implements Empleados {

    // Campo del tipo CreacionInforme (Interfaz)
    private CreacionInformes informeNuevo;

    private String email;

    private String nombreEmpresa;



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }



    //Constructor que inyecta la dependencia
    public DirectorEmpleado(CreacionInformes informeNuevo){

        this.informeNuevo=informeNuevo;

    }

    @Override
    public String getTareas() {

        return "Gestionar la plantilla de la empresa";
    }

    @Override
    public String getInforme() {

        return "Informe creado por el Director: " + informeNuevo.getInforme();
    }
}
