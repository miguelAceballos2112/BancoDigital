package Models;

public class Persona {

    public int cedula;
    public String nombre;
    public String apellido;

    public CuentaAhorros cuentaAhorros;
    public CuentaCredito tarjetaCredito;

    public Persona() {
        System.out.println("Persona creada.");
    }
}
