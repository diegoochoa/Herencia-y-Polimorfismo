import java.awt.Graphics;
import java.awt.Graphics2D;
public class Figura
{
    protected float area;
    private int x;
    private int y;
    public Figura(int a, int b)
    {
        area=0;
        x=a;
        y=b;
    }
    
    public float accederArea()
    {
        return area;
    }
    
    //Se agrego para que pase la comrobacion estatica de los datos
    public void calculaArea()
    {
        System.out.println("Ups");
    }
    
    public String dimeInfo()
    {
        String s = Float.toString(area);
        return s;
    }
    @Override
    public String toString()
    {
        return "" + area;
    }
    @Override
    public boolean equals(Object obj)
    {
        return this.area==((Figura)obj).area;
    }
    public int regresaX()
    {
        return x;
    }
    public int regresaY()
    {
        return y;
    }
    public void dibuja(Graphics g)
    {
         System.out.println("Printing");
    }
}
