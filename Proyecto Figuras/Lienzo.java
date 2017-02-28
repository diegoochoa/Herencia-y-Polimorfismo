import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
public class Lienzo extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        ArrayList<Figura> lista = new ArrayList<Figura>();
        Triangulo t1 = new Triangulo(150,150,100,120);
        Cuadrado c1 = new Cuadrado(200,200,100);
        Circulo c = new Circulo(300,300,100);
        lista.add(t1);
        lista.add(c1);
        lista.add(c);
        for(Figura f : lista)
        {
            f.dibuja(g);
        }
        /*
        //Circulo
        g2.drawOval(100,100,50,50);
        //Triangulo
        g2.drawLine(0,100,50,0);
        g2.drawLine(50,0,100,100);
        g2.drawLine(100,100,0,100);
        //Cuadrado
        g2.drawRect(200,200,100,100);
        */
    }
}
