package Models;

public class Persona {

    public int cedula;
    public String nombre;
    public String apellido;

    public CuentaAhorros cuentaAhorros;
    public CuentaCredito tarjetaCredito;

    public Persona(int cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
