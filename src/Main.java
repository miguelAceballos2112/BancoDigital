import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona miguel = new Persona();

        CuentaAhorros cuentaAhorrosMiguel = new CuentaAhorros();

        miguel.cedula = ingresarEntero("Ingrese la cedula");
        miguel.nombre = ingresarTexto("Ingrese el nomnbre");
        miguel.apellido = ingresarTexto("Ingrese el apellido");
        miguel.CuentaAhorros = cuentaAhorrosMiguel;
        miguel.CuentaAhorros.saldo = ingresarRealDouble("Ingrese el saldo de su cuenta");

        System.out.print(miguel.nombre + " " + miguel.apellido + " con cedula numero : ");
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