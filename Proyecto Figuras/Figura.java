import java.awt.Graphics;
import java.awt.Graphics2D;
public abstract class Figura
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
    public int regresaX()
    {
        return x;
    }
    public int regresaY()
    {
        return y;
    }
    public abstract void dibuja(Graphics g);
}
