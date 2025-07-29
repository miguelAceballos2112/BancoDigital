import java.util.Scanner;

public class CuentaCredito {
    public double cupo;
    public int cuotas;
    
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

    public void pagar(double montoPagar){
        if(cupo>montoPagar) {
            System.out.println("Pagando");
        }else{
            System.out.println("Pago rechazado, saldo insuficiente");
        }
    }
}
