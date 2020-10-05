package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UsoEmpleado {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext contexto;                                                // Cargo el arcrivo XML
        contexto = new ClassPathXmlApplicationContext("applicationContext.xml");    //

        DirectorEmpleado Juan=contexto.getBean("miEmpleado", DirectorEmpleado.class);   /* utilizo el metodo getBean de la clase
                                                    ^                              ClassPathXmlApplicationContext para llamar
                                      pide el bean de miEmpleado                   al bean del arcrivo XML... Me pide dos
                                                                                   argumentos = alias y el nombre de la
                                                                                   interfaz*/

        System.out.println(Juan.getTareas()); //utiliza el metodo sobreescrito de la interfaz

        System.out.println(Juan.getInforme());

        System.out.println("Email: "+Juan.getEmail());
        System.out.println("Empresa: "+Juan.getNombreEmpresa());


        /*
        // Inyeccion por setter
        SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class );

        System.out.println(Maria.getTareas());
        System.out.println(Maria.getInforme());

        System.out.println("Email: "+Maria.getEmail());
        System.out.println("Empresa: "+Maria.getNombreEmpresa());  */



        contexto.close();  // cierra el arcrivo XML para liberar recursos

    }

}
