import java.util.ArrayList;
public class Principal
{
   public static void main(String [] args)
   {
       Banco banco = new Banco();
       CuentaBancaria c1= new CuentaBancaria(100);
       CuentaBancaria c2= new CuentaBancaria(200);
       CuentaBancaria c3= new CuentaBancaria(300);
       
       banco.agregarCuenta(c1);
       banco.agregarCuenta(c2);
       banco.agregarCuenta(c3);
       banco.calculaProm();
       
       System.out.println("El promedio es: "+banco.calculaProm());
   }
}
