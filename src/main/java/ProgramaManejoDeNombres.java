import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se pide al usuario que ingrese los 3 nombres de un familiar
        String[] nombres = new String[3];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre de un familiar:");
            nombres[i] = scanner.nextLine(); // Guardar el nombre en el arreglo
        }

        // Procesamos cada nombre con el mismo metodo
        String resultado1 = procesarNombre(nombres[0]);
        String resultado2 = procesarNombre(nombres[1]);
        String resultado3 = procesarNombre(nombres[2]);

        // Mostramos el resultado con guion bajo _
        System.out.println(resultado1 + "_" + resultado2 + "_" + resultado3);

        // Cerramos el scanner
        scanner.close();
    }

    // Metodo que transforma el nombre como pide el enunciado
    private static String procesarNombre(String nombre) {
        char segundaLetraMayus = Character.toUpperCase(nombre.charAt(1));
        // Tomar los 2 últimos caracteres
        String ultimosCaracteres = nombre.substring(nombre.length() - 2);
        // Concatenar los resultados
        return segundaLetraMayus + "." + ultimosCaracteres;
    }
}

