public class AsaCom extends Comision
{
    private double sueldo;
    private double sueldof;
    public AsaCom(String name, double vt, double com, double suel)
    {
        super(name,vt,com);
        sueldo=suel;
    }
    
    @Override
    public double calculaSueldo()
    {
        sueldof=super.regresaV()*(super.regresaC()/100)+(sueldo+sueldo*.1);
        return sueldof;
    }
    @Override
    public String toString()
    {
        return super.toString() +" sueldo es: " + sueldof;
    }
}
