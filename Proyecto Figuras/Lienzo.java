import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Lienzo extends JPanel
{
    private ArrayList<Figura> lista = new ArrayList<Figura>();
    public Lienzo()
    {
        Triangulo t1 = new Triangulo(150,150,100,120);
        Cuadrado c1 = new Cuadrado(200,200,100);
        Circulo c = new Circulo(300,300,100);
        Rombo r = new Rombo(400,400,100,200);
        lista.add(t1);
        lista.add(c1);
        lista.add(c);
        lista.add(r);
        
    }
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        for(Figura f : lista)
        {
            f.dibuja(g);
        }
     
    }
}
