public class PracticaExcepciones {

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio4();
        ejercicio5();
        ejercicio6();
    }

    // EJERCICIO 1
    public static void ejercicio1() {
        try {
            throw new Exception("Esta es mi primera excepcion");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // EJERCICIO 2
    public static void ejercicio2() {
        try {
            throw new Exception("Error de prueba");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Se ejecuto finally");
        }
    }

    // EJERCICIO 4
    public static void ejercicio4() {
        try {
            verificarNumero(-5);
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }

    // EJERCICIO 5
    public static void ejercicio5() {
        PracticaExcepciones obj = null;
        try {
            obj.verificarNumero(-5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // EJERCICIO 6
    public static void ejercicio6() {
        try {
            b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verificarNumero(int numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("Numero negativo detectado");
        }
    }

    public static void a() throws NumeroNegativoException {
        throw new NumeroNegativoException("Error en metodo A");
    }

    public static void b() throws Exception {
        try {
            a();
        } catch (NumeroNegativoException e) {
            throw new Exception("Error en metodo B");
        }
    }
}

// Clase de la excepcion (NO public)
class NumeroNegativoException extends Exception {

    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}