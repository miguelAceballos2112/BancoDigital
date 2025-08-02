package Models;

public class CuentaAhorros extends CuentaBanco {
    public double saldo;

    public CuentaAhorros(int numeroCuenta, String titular) {
        super("Cuenta de Ahorros", numeroCuenta, titular);
        this.saldo = 0.0;
    }

    public void pagar(double montoPagar, double saldo) {
        if (saldo >= montoPagar) {
            saldo -= montoPagar;
            System.out.println("Pago exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Pago rechazado. Saldo insuficiente");
        }
    }

    public void transferir(double montoTransferir, double saldo) {
        if (saldo > montoTransferir) {
            saldo -= montoTransferir;
            System.out.println("Transferencia exitosa. Saldo actual: " + saldo);
        } else {
            System.out.println("Transaccion rechazada, saldo insuficiente");
        }
    }

    public void retirar(double montoRetirar, double saldo) {
        if (saldo >= montoRetirar) {
            saldo -= montoRetirar;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Retiro rechazado, saldo insuficiente");
        }
    }

    public void depositar(double montoDepositar, double saldo) {
        saldo += montoDepositar;
        System.out.println("Deposito exitoso. Saldo actual: " + saldo);
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}
