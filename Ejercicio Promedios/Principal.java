import java.util.ArrayList;
import java.text.DecimalFormat;
public class Principal
{
   public static void main(String [] args)
   {
       DecimalFormat df = new DecimalFormat("0.00");
       
       Mesurable [] accounts = new Mesurable[3];
       
       accounts[0] = new CuentaBancaria(100);
       accounts[1] = new CuentaBancaria(200);
       accounts[2] = new CuentaBancaria(300);
       
       float averageBalance = Data.average(accounts);
              
       System.out.println("Saldo promedio = "+averageBalance);
       
       Mesurable [] countries = new Mesurable[3];
       
       countries[0] = new Pais(25);
       countries[1] = new Pais(32);
       countries[2] = new Pais(94);
       
       float averageArea = Data.average(countries);
       
       System.out.println("Promedio de habitantes = "+df.format(averageArea));
   }
}
