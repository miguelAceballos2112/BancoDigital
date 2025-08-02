package Models;

public class CuentaCredito extends CuentaBanco {
    public double cupo;
    public int cuotas;
    public double deuda;

    public void comprar(double montoPagar, int numeroCuotas) {
        if (cupo < montoPagar) {
            deuda += montoPagar;
            System.out.println("Comprando a " + numeroCuotas + " cuota");
        } else {
            System.out.println("Compra rechazada, deuda superada");
        }
    }

    public void pagarTarjeta(double montoPagar) {
        if (deuda >= cupo) {
            deuda -= montoPagar;
            cupo = cupo - deuda;
            System.out.println("Pago exitoso. Deuda actual: " + deuda + ", nuevo cupo: " + cupo);
        }
    }
}
