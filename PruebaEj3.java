public class PruebaEj3 {
    public static void main(String[] args) {
        try {
            throw new NumeroNegativoException("Prueba del ejercicio 3");
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }
}