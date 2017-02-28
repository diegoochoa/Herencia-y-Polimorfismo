import java.lang.Math;
import java.text.DecimalFormat;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class Circulo extends Figura
{
   private float radio;
   DecimalFormat df = new DecimalFormat("0.00");
   public Circulo(int x,int y,float r)
   {
       super(x,y);
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
   
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g2.drawOval(super.regresaX(),super.regresaY(),(int)this.radio,(int)this.radio);
   }
   
}
