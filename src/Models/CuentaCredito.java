package Models;

public class CuentaCredito extends CuentaBanco {
    public double cupo;
    public int cuotas;

    public void comprar(double montoPagar, int numeroCuotas) {
        if (cupo > montoPagar) {
            cupo -= montoPagar;
            System.out.println("Comprando a " + numeroCuotas + " cuota");
        } else {
            System.out.println("Compra rechazada, cupo superado");
        }
    }

    public void pagarTarjeta(double montoPagar) {
        if (cupo >= montoPagar) {
            cupo += montoPagar;
            System.out.println("Pago realizado, nuevo cupo: " + cupo);
        }
    }
}
