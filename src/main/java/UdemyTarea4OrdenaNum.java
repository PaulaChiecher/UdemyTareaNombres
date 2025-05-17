import java.util.Scanner;

public class UdemyTarea4OrdenaNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pido 2 numeros al usuario
        System.out.println("Ingrese el primer numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = scanner.nextInt();
        // Comparo con el ternario para ver el mayor
        String resultado = (numero1 > numero2) ? numero1 + " Luego " + numero2 : numero2 + " Luego " + numero1;
        // Muestro el resultado
        System.out.println("El orden es: " + resultado);
    }
}
