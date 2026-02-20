public class Ejercicio4 {

    public void verificarNumero(int numero) throws NumeroNegativoException {

        if (numero < 0) {
            throw new NumeroNegativoException("El numero no puede ser negativo");
        }

        System.out.println("Numero valido");
    }

    public static void main(String[] args) {

        Ejercicio4 obj = new Ejercicio4();

        try {
            obj.verificarNumero(-5);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }

    }
}