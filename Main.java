import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String dpi;
       double saldo, interes, porcentaje,interesAnual;

       //-----------------------------------------

        System.out.println("Ingrese el DPI del usuario: ");
        dpi=sc.nextLine();
        System.out.println("Ingrese el saldo de la cuenta: ");
        saldo=sc.nextDouble();
        System.out.println("Ingrese el porcetaje de interes: ");
        interes=sc.nextDouble();
        porcentaje=interes/100;
        interesAnual=porcentaje/395;

        Account cuenta1 = new Account(dpi,saldo,interes);
        cuenta1.generarNumeroCuenta();
        cuenta1.ingresar(saldo);
        cuenta1.retirar(saldo);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("DPI del usuario: " +cuenta1.getDpi() );
        System.out.println("Cuenta del usuario: "+cuenta1.getCuenta());
        System.out.println("Saldo del usuario: "+cuenta1.getSaldo());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        //------------------------------------

        System.out.println("Ingrese el DPI del usuario: ");
        dpi=sc.nextLine();
        System.out.println("Ingrese el saldo de la cuenta: ");
        saldo=sc.nextDouble();
        System.out.println("Ingrese el porcetaje de interes: ");
        interes=sc.nextDouble();
        porcentaje=interes/100;
        interesAnual=porcentaje/395;

        Account cuenta2 = new Account(dpi,saldo,interes);
        cuenta2.generarNumeroCuenta();
        cuenta2.ingresar(saldo);
        cuenta2.retirar(saldo);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("DPI del usuario: " +cuenta2.getDpi() );
        System.out.println("Cuenta del usuario: "+cuenta2.getCuenta());
        System.out.println("Saldo del usuario: "+cuenta2.getSaldo());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        //-------------------------------------

        System.out.println("Ingrese el DPI del usuario: ");
        dpi=sc.nextLine();
        System.out.println("Ingrese el saldo de la cuenta: ");
        saldo=sc.nextDouble();
        System.out.println("Ingrese el porcetaje de interes: ");
        interes=sc.nextDouble();
        porcentaje=interes/100;
        interesAnual=porcentaje/395;

        Account cuenta3 = new Account(dpi,saldo,interes);
        cuenta3.generarNumeroCuenta();
        cuenta3.ingresar(saldo);
        cuenta3.retirar(saldo);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("DPI del usuario: " +cuenta3.getDpi() );
        System.out.println("Cuenta del usuario: "+cuenta3.getCuenta());
        System.out.println("Saldo del usuario: "+cuenta3.getSaldo());
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}