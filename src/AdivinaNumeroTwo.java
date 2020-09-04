import javax.swing.*;
import java.security.SecureRandom;


public class AdivinaNumeroTwo {

    private static final SecureRandom numeroAleatorio = new SecureRandom();

    public static void main(String[] args) {

        int b = 1 + numeroAleatorio.nextInt(100);

        String caca;
        int lechuza;
        int contador=0;

        JOptionPane.showMessageDialog(null, " | | | | | Bienvenido a Jueguito Pedorro 2 | | | | | ",
                "Jueguito Pedorro 2", JOptionPane.INFORMATION_MESSAGE);

        caca = JOptionPane.showInputDialog("Estoy pensando en un numero entre el 1 y el 100" + " ¡¡Adivina cual es!!");

        do{

            lechuza =  Integer.parseInt(caca);
            contador++;

            if (lechuza < b && lechuza>0 && lechuza<101){
                JOptionPane.showMessageDialog(null, "mmmm... Es mas que eso",
                        "Jueguito Pedorro 2", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (lechuza> b && lechuza>0 && lechuza<101 ){
                JOptionPane.showMessageDialog(null, "No flashes, es menos",
                        "Jueguito Pedorro 2", JOptionPane.INFORMATION_MESSAGE);
            }
            else if ((lechuza < 1) || (lechuza>100)){
                JOptionPane.showMessageDialog(null, "¿Que te pasa? ¿tenes problemas mentales?" +
                                " te dije UN NUMERO ENTERO DEL 1 AL 100!!",
                        "Jueguito Pedorro 2", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "COOORRECTOOOUU!!",
                        "Jueguito Pedorro 2", JOptionPane.INFORMATION_MESSAGE);
            }
            if (lechuza != b ){
                switch (contador){
                    case 1:
                    case 2:
                        caca = JOptionPane.showInputDialog("Volve a intentarlo");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        caca = JOptionPane.showInputDialog("Pensa bien, intentalo de nuevo");
                        break;
                    case 6:
                        caca = JOptionPane.showInputDialog("Metele pata que tengo cosas que hacer");
                        break;
                    case 7:
                    case 8:
                        caca = JOptionPane.showInputDialog("Dale!!!");
                        break;
                    case 9:
                        caca = JOptionPane.showInputDialog("No te parece que estas tardanto mucho?");
                        break;
                    default:
                        caca = JOptionPane.showInputDialog("La Puta Que Te Pario");
                        break;
                }
            }
        }
        while(lechuza != b);

        switch (contador){
            case 1:
            case 2:
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "Felicitaciones! "+"Lo lograste en "+ contador +
                                " intentos! IMPOSIBLE",
                        "Jueguito Pedorro 2", JOptionPane.PLAIN_MESSAGE);
                break;
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null, "Felicitaciones!"+"Lo lograste en "+ contador +
                                " intentos. "+"Te ganaste la posibilidad " +
                                "de que tu inteligencia no sea comparada con la de un simio",
                        "Jueguito Pedorro 2", JOptionPane.PLAIN_MESSAGE);
                break;
            case 7:
            case 8:
            case 9:
                JOptionPane.showMessageDialog(null, "Malisimo " + contador +
                                " intentos... Te ganaste un pedo en la cara",
                        "Jueguito Pedorro 2", JOptionPane.PLAIN_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Deja, no juegues mas, me haces perder el tiempo!" +
                                " ¿Te das cuenta que gastaste " + contador + " intentos para un juego re simple?",
                        "Jueguito Pedorro 2", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
