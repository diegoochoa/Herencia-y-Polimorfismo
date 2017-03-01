import java.awt.Graphics;
import java.awt.Graphics2D;
public class Rombo extends Figura
{
   private float dm;
   private float dM;
   public Rombo(int x, int y, float d1, float d2)
   {
       super(x,y);
       dm=d1;
       dM=2;
   }
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g2.drawLine(regresaX(),regresaY(),regresaX()-(int)dM/2+(int)dm/2,regresaY()-(int)dM/2+(int)dm/2);
       //g2.drawLine(regresaX()-(int)dM/2+(int)dm/2,regresaY()-(int)dM/2+(int)dm/2,);
    }
}
