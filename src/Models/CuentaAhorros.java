package Models;
public class CuentaAhorros extends CuentaBanco{
    public double saldo;

    public void pagar(double montoPagar){
        if(saldo>montoPagar) {
            System.out.println("Pagando");
        }else{
            System.out.println("Pago rechazado, saldo insuficiente");
        }
    }
    public void transferir(double montoTransferir){
        if(saldo>montoTransferir) {
            System.out.println("Transaccion exitosa");
        }else{
            System.out.println("Transaccion rechazada, saldo insuficiente");
        }
    }
}
