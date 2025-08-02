package Models;

public class CuentaCredito extends CuentaBanco {
    private double cupo;
    private double deuda;
    private double cupoDisponible;

    // Getter
    public double getCupo() {
        return cupo;
    }

    public double getDeuda() {
        return deuda;
    }

    // Setter
    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public CuentaCredito(int numeroCuenta, String titular, double cupo) {
        super("Cuenta de Credito", numeroCuenta, titular);
        this.cupo = cupo;
        this.deuda = 0.0;
        this.cupoDisponible = cupo;
    }

    public void comprar(double montoPagar, int numeroCuotas) {
        if (cupoDisponible >= montoPagar) {
            deuda += montoPagar;
            cupoDisponible = cupo - deuda;
            System.out.println("Comprando a " + numeroCuotas + " cuota");
        } else {
            System.out.println("Compra rechazada, deuda superada");
        }
    }

    public void pagarTarjeta(double montoPagar) {
        if (deuda > 0) {
            deuda -= montoPagar;
            cupoDisponible = cupo - deuda;
            System.out.println("Pago exitoso. Deuda actual: " + deuda + ", nuevo cupo: " + cupo);
        }
    }
}
