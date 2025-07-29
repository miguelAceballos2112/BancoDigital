public class CuentaCredito {
    public double cupo;
    public int cuotas;
    
    public void pagar(double montoPagar){
        if(cupo>montoPagar) {
            System.out.println("Pagando");
        }else{
            System.out.println("Pago rechazado, saldo insuficiente");
        }
    }
}
