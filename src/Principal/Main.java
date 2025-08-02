package Principal;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import Models.CuentaAhorros;
import Models.CuentaCredito;
import Models.Persona;

public class Main {
    public static void main(String[] args) {

        // Datos personales
        int cedula = ingresarEntero("Ingrese la cedula: ");
        String nombre = ingresarTexto("Ingrese el nombre: ");
        String apellido = ingresarTexto("Ingrese el apellido: ");
        Persona miguel = new Persona(cedula, nombre, apellido);

        // Datos cuenta ahorro
        int numeroCuentaAhorros = ingresarEntero("Ingrese el numero de la cuenta de ahorros: ");
        CuentaAhorros cuentaAhorrosMiguel = new CuentaAhorros(numeroCuentaAhorros, miguel.nombre + " " + miguel.apellido);
        miguel.cuentaAhorros = cuentaAhorrosMiguel;
        
        // Datos tarjeta de credito
        int numeroCuentaCredito = ingresarEntero("Ingrese el numero de la tarjeta de credito: ");
        double cupo = ingresarRealDouble("Ingrese el cupo de su tarjeta de credito: ");
        CuentaCredito cuentaCreditoMiguel = new CuentaCredito(numeroCuentaCredito, miguel.nombre + " " + miguel.apellido, cupo);
        miguel.tarjetaCredito = cuentaCreditoMiguel;
        
        // Presentamos info por consola
        System.out.println(miguel.nombre + " " + miguel.apellido + " con cedula numero : " + miguel.cedula + ".");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        String saldoFormateado = formatoMoneda.format(miguel.cuentaAhorros.saldo);
        System.out.println("Tiene una cuenta de ahorros con numero: " + miguel.cuentaAhorros.numeroCuenta
                + " con un saldo de: " + saldoFormateado + ".");
        String cupoFormateado = formatoMoneda.format(miguel.tarjetaCredito.cupo);
        System.out.println("Tiene una tarjeta de credito con numero: " + miguel.tarjetaCredito.numeroCuenta
                + " con un cupo de: " + cupoFormateado + ".");

        // Realizamos una compra
        double precio = ingresarRealDouble("Ingrese el precio de producto a comprar: ");
        int cuotas = ingresarEntero("Ingrese el numero de cuotas: ");
        miguel.tarjetaCredito.comprar(precio, cuotas);
    }

    public static String ingresarTexto(String mensaje) {
        String texto;
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        texto = scanner.nextLine();
        return texto;
    }

    public static int ingresarEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int valorEntero = scanner.nextInt();
        return valorEntero;

    }

    public static double ingresarRealDouble(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        double valorReal = scanner.nextFloat();
        return valorReal;
    }

}