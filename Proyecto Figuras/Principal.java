import java.util.ArrayList;
import java.util.Iterator;
public class Principal
{
    public static void main(String [] args)
    {
        Triangulo t1 = new Triangulo(3,4);
        Cuadrado c1 = new Cuadrado(5);
        Circulo c2 = new Circulo(6);
        ArrayList<Figura> lista = new ArrayList<Figura>();
        
        lista.add(t1);
        lista.add(c1);
        lista.add(c2);
       
       Iterator<Figura> it = lista.iterator();
       while(it.hasNext())
       {
           Figura aux=it.next();
           aux.calculaArea();
        }
        
       it=lista.iterator();
       while(it.hasNext())
       {
           Figura aux=it.next();
           System.out.println("El area es: "+aux.accederArea());
       }
       //comprobacion estatica es checar los tipos de datos en el programa
       //comprobacion dinamica ocurre al ejecutar el programa 
    }
}
