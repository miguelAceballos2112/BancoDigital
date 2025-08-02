package Models;

public class Persona {

    private int cedula;
    private String nombre;
    private String apellido;

    private CuentaAhorros cuentaAhorros;
    private CuentaCredito tarjetaCredito;

    // Getter
    public int getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public CuentaAhorros getCuentaAhorros() {
        return this.cuentaAhorros;
    }

    public CuentaCredito getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    // Setter
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCuentaAhorros(CuentaAhorros cuentaAhorros) {
        this.cuentaAhorros = cuentaAhorros;
    }

    public void setCuentaCredito(CuentaCredito cuentaCredito) {
        this.tarjetaCredito = cuentaCredito;
    }

    public Persona(int cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
