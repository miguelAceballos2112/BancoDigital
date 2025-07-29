package Principal;
import java.util.Scanner;

import Models.CuentaAhorros;
import Models.CuentaCredito;
import Models.Persona;

public class Main {
    public static void main(String[] args) {

        Persona miguel = new Persona();

        CuentaAhorros cuentaAhorrosMiguel = new CuentaAhorros();

        miguel.cedula = ingresarEntero("Ingrese la cedula: ");
        miguel.nombre = ingresarTexto("Ingrese el nombre: ");
        miguel.apellido = ingresarTexto("Ingrese el apellido: ");
        miguel.cuentaAhorros = cuentaAhorrosMiguel;
        miguel.cuentaAhorros.numeroCuenta = ingresarEntero("Ingrese le numero de la cuenta: ");
        miguel.cuentaAhorros.saldo = ingresarRealDouble("Ingrese el saldo de su cuenta: ");
        
        
        CuentaCredito cuentaCreditoMiguel = new CuentaCredito();
        
        miguel.tarjetaCredito = cuentaCreditoMiguel;
        miguel.tarjetaCredito.numeroCuenta = ingresarEntero("Ingrese le numero de la tarjeta: ");
        miguel.tarjetaCredito.cupo = ingresarRealDouble("Ingrese el cupo de su tarjeta: ");
        double precio = ingresarRealDouble("Ingrese el precio de producto a comprar: ");
        int cuotas = ingresarEntero("Ingrese el numero de cuotas: ");
        miguel.tarjetaCredito.comprar(precio, cuotas);

        System.out.print(miguel.nombre + " " + miguel.apellido + " con cedula numero : " + miguel.cedula + " Con numero de cuenta " + miguel.cuentaAhorros.numeroCuenta + " Tiene un saldo de: " + miguel.cuentaAhorros.saldo);
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