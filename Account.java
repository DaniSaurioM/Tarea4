import java.util.Scanner;

public class Account {

    private String dpi,cuenta="10001";
    private double saldo, interes;

    int contador=0;
    //constructor por defecto
    public Account(){
    generarNumeroCuenta();
    }

    //constructor con parametros
    public Account(String dpi, double saldo, double interes){
        this.dpi=dpi;
        this.saldo=saldo;
        this.interes=interes;
    }

    //metodos

    public String generarNumeroCuenta(){
        contador=contador+1;
        String c=getCuenta()+contador;
        return c;
    }

    public void actualizarSaldo(double interesAnual,double saldo){
        double saldoInteres =saldo*interesAnual;
        double saldos=saldo+saldoInteres;
        System.out.println(Math.floor(saldos));
    }

    public double ingresar(double saldo){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese una cantidad a depositar");
        double ingreso =sc.nextDouble();
        saldo =saldo+ingreso;
        System.out.println("Saldo actual: "+ saldo);
        return saldo;
    }
    public double retirar (double saldo){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese saldo a retirar");
        double retiro = sc.nextDouble();
        if(getSaldo()<=retiro){
            System.out.println("no tiene saldo suficiente para retirar");
        }else{
            saldo=saldo-retiro;
        }
        System.out.println("Saldo actual: "+saldo);
        return saldo;
    }





    // setter y getters
    public String getDpi() {
        return dpi;
    }
    public String getCuenta(){
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public void setCuenta(String cuenta){
        this.cuenta=cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
