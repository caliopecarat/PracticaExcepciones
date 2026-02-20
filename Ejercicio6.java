public class Ejercicio6 {

    public void a() throws NumeroNegativoException {
        throw new NumeroNegativoException("Error en metodo A");
    }

    public void b() throws Exception {

        try {
            a();
        } catch (NumeroNegativoException e) {
            throw new Exception("Error en metodo B");
        }

    }

    public static void main(String[] args) {

        Ejercicio6 obj = new Ejercicio6();

        try {
            obj.b();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}