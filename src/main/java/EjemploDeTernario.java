public class EjemploDeTernario {
    public static void main(String[] args) {
        // Ejemplo de operador ternario
        int a = 10;
        int b = 20;

        // Se usa el operador ternario para determinar el mayor
        // Si a es mayor se devuelve el primer valor, si no el segundo
        int mayor = (a > b) ? a : b;

        // Se imprime el resultado
        System.out.println("El mayor es: " + mayor);

        // Ejemplo de operador ternario con String
        String resultado = (a > b) ? "a es mayor" : "b es mayor";
        System.out.println(resultado);

    }
}
