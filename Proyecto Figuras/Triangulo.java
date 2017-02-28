import java.awt.Graphics;
import java.awt.Graphics2D;
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
    
    public void calculaArea()
    {
        area=base*altura/2;
    }
    
    public String dimeInfo()
   {
       return "Triangulo " + super.dimeInfo();
   }
   
   @Override
   public String toString()
   {
       return "Triangulo con area: "+super.toString();
   }
   
   public void dibuja(Graphics g)
   {
       Graphics2D g2 = (Graphics2D)g;
       g2.drawLine(super.regresaX(),super.regresaY(),super.regresaX()+(int)base,super.regresaY());
       g2.drawLine(super.regresaX(),super.regresaY(),super.regresaX()+(int)base/2,super.regresaY()-(int)base/2);
       g2.drawLine(super.regresaX()+(int)base/2,super.regresaY()-(int)base/2,super.regresaX()+(int)base,super.regresaY());
      
   }
   
}
