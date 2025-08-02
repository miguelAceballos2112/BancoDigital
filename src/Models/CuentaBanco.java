package Models;

public class CuentaBanco {
    private String tipo;
    private int numeroCuenta;
    private String titular;

    // Getter
    public String getTipo() {
        return tipo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    // Setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public CuentaBanco(String tipo, int numeroCuenta, String titular) {
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }
}
