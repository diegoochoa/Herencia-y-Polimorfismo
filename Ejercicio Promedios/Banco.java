import java.util.ArrayList;
import java.util.Iterator;
public class Banco 
{
    private ArrayList<CuentaBancaria> lista;
    
    private float prom;
    private int suma;
    public Banco()
    {
        lista = new ArrayList<CuentaBancaria>();   
    }
    public void agregarCuenta(CuentaBancaria c)
    {
        lista.add(c);
    }
    public float calculaProm()
    {
        
        Iterator<CuentaBancaria> it = lista.iterator();
        while(it.hasNext())
        {
            CuentaBancaria c = it.next();
            suma+=c.regresaSaldo();
        }
       prom=(float)suma/lista.size();
       return prom;
    }
   
}
