public class Comision extends Empleado
{
   private double vtotal;
   private double comision;
   
   public Comision(String name, double vt, double comi)
   {
       super(name);
       vtotal=vt;
       comision=comi;
   }
   //public abstract double calculaSueldo();
   
   @Override
   public double calculaSueldo()
   {
       return 0;
   }
   
   public double regresaV()
   {
       return vtotal;
   }
   public double regresaC()
   {
       return comision;
   }
}
