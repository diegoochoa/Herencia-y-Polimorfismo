import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class Lienzo extends JPanel
{
    private Pelota pelota;
    public Lienzo()
    {
        pelota = new Pelota(100,100,10);
        EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        Timer tiempo = new Timer(100,escuchaTiempo);
        tiempo.start();
    }
    class EscuchadorTiempo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            //System.out.println("Hola Pelota");
            pelota.muevete(getBounds());//cambia de posicion
            repaint();
        }
    }
    @Override
    public void paintComponent(Graphics g)
    {
        pelota.dibujate(g);
    }
}
