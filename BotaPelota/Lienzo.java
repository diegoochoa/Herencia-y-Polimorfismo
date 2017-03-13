import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.awt.Rectangle;

public class Lienzo extends JPanel
{
    private LinkedList<Pelota> pelotas;
    
    public Lienzo()
    {
        pelotas = new LinkedList<Pelota>();
        pelotas.add(new Pelota(100,100,10));
        EscuchadorRaton escuchaRaton = new EscuchadorRaton();
        this.addMouseListener(escuchaRaton);
        
    }
    
    public void actua()
    {
        Rectangle r = this.getBounds();
        for(Pelota p : pelotas)
        {
            p.muevete(r);   
        }
        this.repaint();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        //BORRA EL PANEL PARA DIBUJAR LAS PELOTAS EN UNA NUEVA POSICION
        super.paintComponent(g);
        //BORRA EL PANEL Y DIBUJA LAS PELOTAS
        for(Pelota p : pelotas)
        {
            p.dibujate(g);   
        }
        
    }
    
    class EscuchadorRaton extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            int tamRandom = 10 + (int)(Math.random()*20);
            Pelota pelotaNueva = new Pelota(e.getX(),e.getY(),tamRandom);
            pelotas.add(pelotaNueva);
        }
    }
}
