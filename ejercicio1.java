public class ejercicio1 {

    public static void main(String[] args) {

        try {
            throw new Exception("Este es el ejercicio 1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}