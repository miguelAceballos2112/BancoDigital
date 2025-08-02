package Models;

public class CuentaBanco {
    public String tipo;
    public int numeroCuenta;
    public String titular;

    public CuentaBanco(String tipo, int numeroCuenta, String titular) {
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }
}
