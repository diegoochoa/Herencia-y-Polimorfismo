import java.awt.Graphics;
import java.awt.Graphics2D;
public class Circulo extends Figura
{
   private float radio;
   public Circulo(int x,int y,float r)
   {
       super(x,y);
       radio=r;
       area=0;
   }
   
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g2.drawOval(regresaX(),regresaY(),(int)radio,(int)radio);
   }
   
}
