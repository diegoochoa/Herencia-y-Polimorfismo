import java.awt.Graphics;
import java.awt.Graphics2D;
public class Cuadrado extends Figura
{
   private float lado;
   public Cuadrado(int x, int y, float l)
   {
       super(x,y);
       lado=l;
       area=0;
   }
   public void calculaArea()
   {
       area=lado*lado;
   }
    public String dimeInfo()
   {
       return "Cuadrado " + super.dimeInfo();
   }
   
   @Override
   public String toString()
   {
       return "Cuadrado con area: "+super.toString();
   }
   
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g2.drawRect(super.regresaX(),super.regresaY(),(int)this.lado,(int)this.lado);
   }
}
