public class EmpCom extends Comision
{
    private double sueldof;
   public EmpCom(String name, double vt, double com)
   {
       super(name,vt,com);
   }
   @Override
   public double calculaSueldo()
   {
       sueldof=super.regresaV()*(super.regresaC()/100);
       return sueldof;
   }
   @Override
    public String toString()
    {
        return "" +super.toString() +" sueldo es: " + sueldof;
    }
}
