import java.util.ArrayList;
import java.util.Iterator;
public class Planeta
{
   private ArrayList<Pais> lista;
   private int suma;
   private float prom;
   public Planeta()
   {
       lista = new ArrayList<Pais>();
   }
   
   public void agregaPais(Pais p)
   {
       lista.add(p);
   }
   
   public float calculaProm()
   {
       Iterator<Pais> it = lista.iterator();
       while(it.hasNext())
       {
           Pais p=it.next();
           suma+=p.regresaHab();
       }
       prom=(float)suma/lista.size();
       return prom;
   }
}
