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
        CuentaBancaria [] arrCuentas = new CuentaBancaria[lista.size()];
        //arrCuentas = lista.toArray(arrCuentas);
        for(int i=0; i<lista.size();i++){
            arrCuentas[i] = lista.get(i);
        }
        return Data.average(arrCuentas);
    }
   
}
