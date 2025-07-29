package Principal;
import java.util.Scanner;

import Models.CuentaAhorros;
import Models.CuentaCredito;
import Models.Persona;

public class Main {
    public static void main(String[] args) {

        Persona miguel = new Persona();
        CuentaAhorros cuentaAhorrosMiguel = new CuentaAhorros();
        CuentaCredito cuentaCreditoMiguel = new CuentaCredito();

        // Datos personales
        miguel.cedula = ingresarEntero("Ingrese la cedula: ");
        miguel.nombre = ingresarTexto("Ingrese el nombre: ");
        miguel.apellido = ingresarTexto("Ingrese el apellido: ");

        // Datos cuenta ahorro
        miguel.cuentaAhorros = cuentaAhorrosMiguel;
        miguel.cuentaAhorros.numeroCuenta = ingresarEntero("Ingrese le numero de la cuenta: ");
        miguel.cuentaAhorros.saldo = ingresarRealDouble("Ingrese el saldo de su cuenta: ");
        
        // Datos tarjeta de credito
        miguel.tarjetaCredito = cuentaCreditoMiguel;
        miguel.tarjetaCredito.numeroCuenta = ingresarEntero("Ingrese le numero de la tarjeta: ");
        miguel.tarjetaCredito.cupo = ingresarRealDouble("Ingrese el cupo de su tarjeta: ");
        
        //Presentamos info por consola
        System.out.print(miguel.nombre + " " + miguel.apellido + " con cedula numero : " + miguel.cedula + ".");
        System.out.print("Tiene una cuenta de ahorros con numero: " + miguel.cuentaAhorros.numeroCuenta + " con un saldo de: " + miguel.cuentaAhorros.saldo + ".");
        System.out.print("Tiene una tarjeta de credto con numero: " + miguel.tarjetaCredito.numeroCuenta + " con un cupo de: " + miguel.tarjetaCredito.cupo + ".");

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