public class Ejercicio5 {

    public static void main(String[] args) {

        Ejercicio4 obj = null;

        try {
            obj.verificarNumero(-5);
        } catch (Exception e) {
            System.out.println("Se produjo una excepcion:");
            e.printStackTrace();
        }

    }
}