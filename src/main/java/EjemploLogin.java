import java.sql.SQLOutput;
import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {
        String[] usernames = new String[3];
        String[] passwords = {"1234", "5678", "91011"};
        usernames[0] = "Paula";
        usernames[1] = "Francisco";
        usernames[2] = "Vanina";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su usuario:");
        String u = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String p = scanner.nextLine();
        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true : esAutenticado;
            /*if(usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }*/
        }
        String mensaje = esAutenticado ? "Bienvenido usuario " + u : "Usuario o contraseña incorrectos!!";
        System.out.println("mensaje = " + mensaje);
        /*if(esAutenticado){
            System.out.println("Bienvenido " + u);
        } else System.out.println("Usuario o contraseña incorrectos!!");*/


    }
}
