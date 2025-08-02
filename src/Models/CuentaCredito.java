package Models;

public class CuentaCredito extends CuentaBanco {
    private double cupo;
    private double cupoDisponible;

    // Getter
    public double getCupo() {
        return cupo;
    }

    // Setter
    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public CuentaCredito(int numeroCuenta, String titular, double cupo) {
        super("Cuenta de Credito", numeroCuenta, titular);
        this.cupo = cupo;
        this.saldo = 0.0;
        this.cupoDisponible = cupo;
    }

    public void comprar(double montoPagar, int numeroCuotas) {
        if (cupoDisponible >= montoPagar) {
            saldo += montoPagar;
            cupoDisponible = cupo - saldo;
            System.out.println("Comprando a " + numeroCuotas + " cuota");
        } else {
            System.out.println("Compra rechazada, deuda superada");
        }
    }

    public void pagarTarjeta(double montoPagar) {
        if (saldo > 0) {
            saldo -= montoPagar;
            cupoDisponible = cupo - saldo;
            System.out.println("Pago exitoso. Deuda actual: " + saldo + ", nuevo cupo: " + cupo);
        }
    }
}
