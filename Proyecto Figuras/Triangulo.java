import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
public class Triangulo extends Figura
{
   private float base;
   private float altura;
   public Triangulo(int x, int y, float b, float h)
   {
       super(x,y);
       base=b;
       altura=h;
   }
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g.setColor(Color.red);
      
       g2.drawLine(regresaX(),regresaY(),regresaX()+(int)base,regresaY());
       g2.drawLine(regresaX(),regresaY(),regresaX()+(int)base/2,regresaY()-(int)base/2);
       g2.drawLine(regresaX()+(int)base/2,regresaY()-(int)base/2,regresaX()+(int)base,regresaY());
      
   }
   
}
