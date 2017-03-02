import java.util.ArrayList;
import java.text.DecimalFormat;
public class Principal
{
   public static void main(String [] args)
   {
       DecimalFormat df = new DecimalFormat("0.00");
       Banco banco = new Banco();
       
       CuentaBancaria c1= new CuentaBancaria(100);
       CuentaBancaria c2= new CuentaBancaria(200);
       CuentaBancaria c3= new CuentaBancaria(300);
       
       banco.agregarCuenta(c1);
       banco.agregarCuenta(c2);
       banco.agregarCuenta(c3);
              
       System.out.println("Saldo promedio = "+banco.calculaProm());
       
       Planeta p = new Planeta();
       
       Pais p1 = new Pais(25);
       Pais p2 = new Pais(32);
       Pais p3 = new Pais(94);
       
       p.agregaPais(p1);
       p.agregaPais(p2);
       p.agregaPais(p3);
       
       System.out.println("Promedio de habitantes = "+df.format(p.promPais()));
   }
}
