import javax.swing.JPanel;
import java.awt.Graphics;

import java.awt.Color;
public class Lienzo extends JPanel
{
    private Pelota pelota;
    public Lienzo()
    {
        pelota = new Pelota(100,100,10);
        
    }
    
    public void actua()
    {
        pelota.muevete(this.getBounds());
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibujate(g);
    }
}
