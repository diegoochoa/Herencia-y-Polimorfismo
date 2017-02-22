import java.lang.Math;
public class Circulo extends Figura
{
   private float radio;
   
   public Circulo(float r)
   {
       radio=r;
       area=0;
   }
   public void calculaArea()
   {
       //area=(float)Math.PI*(float)radio*(float)radio;
       area=(float)Math.PI*(float)Math.pow(radio,2);
   }
   
   public String dimeInfo()
   {
       return "Circulo " + super.dimeInfo();
   }
}
