import java.lang.Math;
import java.text.DecimalFormat;
public class Circulo extends Figura
{
   private float radio;
   DecimalFormat df = new DecimalFormat("0.00");
   public Circulo(float r)
   {
       radio=r;
       area=0;
   }
   public void calculaArea()
   {
       //area=(float)Math.PI*(float)radio*(float)radio;
       area=(float)Math.PI*(float)Math.pow(radio,2);
       df.format(area);
   }
   
   public String dimeInfo()
   {
       return "Circulo " + super.dimeInfo();
   }
   @Override
   public String toString()
   {
       return "Circulo con area: "+super.toString();
   }
   
   @Override
   public boolean equals(Object obj)
   {
       if(obj instanceof Circulo)
       {
          return this.radio==((Circulo)obj).radio;
       }
       else{
           return false;
       }
   }
   
}
