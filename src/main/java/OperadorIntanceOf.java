public class OperadorIntanceOf {
    public static void main(String[] args) {
        String texto = ("Creando un bjeto de la clase String....");
        Integer num = 10;
        boolean b1 = texto instanceof String;
        System.out.println("texto instanceof String = " + b1);
        // Se puede usar el operador instanceof para verificar si un objeto es de un tipo específico
        b1 = texto instanceof Object;
        System.out.println("texto instanceof Object = " + b1);
        boolean b2 = num instanceof Integer;
        System.out.println("num instanceof Integer = " + b2);
        // Se puede usar el operador instanceof para verificar si un objeto es de un tipo específico
        b2 = num instanceof Number;
        System.out.println("num instanceof Number = " + b2);
        b2 = num instanceof Object;
        System.out.println("num instanceof Object = " + b2);
    }
}
