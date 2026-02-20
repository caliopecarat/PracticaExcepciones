public class Ejercicio2 {

    public static void main(String[] args) {

        try {
            throw new Exception("Error de prueba");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Se ejecuto el bloque finally");
        }

    }
}