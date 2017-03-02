import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public class Cuadrado extends Figura
{
   private float lado;
   public Cuadrado(int x, int y, float l)
   {
       super(x,y);
       lado=l;
       area=0;
   }
  
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g.setColor(Color.green);
       g2.fillRect(regresaX(),regresaY(),(int)this.lado,(int)this.lado);
       //g2.drawRect(regresaX(),regresaY(),(int)this.lado,(int)this.lado);
       
   }
}