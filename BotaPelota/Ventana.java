import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class Ventana extends JFrame
{
    private Lienzo dibujo;
    private Timer tiempo;
    public Ventana(int ancho, int alto)
    {
        this.setSize(ancho,alto);
        dibujo=new Lienzo();
        this.add(dibujo);
        
        EscuchadorTeclado escuchaTeclado = new EscuchadorTeclado();
        this.addKeyListener(escuchaTeclado);
        
        EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
        tiempo = new Timer(1000,escuchaTiempo);
        tiempo.start();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class EscuchadorTeclado implements KeyListener
    {
        //Metodos del mouse
        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyChar()=='d'){
                tiempo.stop();
            }
            else if(e.getKeyChar()=='i'){
                tiempo.start();
            }
            //System.out.println("KeyPressed: "+e.getKeyChar());
        }
    
        @Override
        public void keyReleased(KeyEvent e)
        {
            //System.out.println("KeyReleased: "+e.getKeyChar());
        }
    
        @Override
        public void keyTyped(KeyEvent e)
        {
            //System.out.println("KeyTyped: "+e.getKeyChar());
        }
    }
    
    class EscuchadorTiempo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            //System.out.println("Hola Pelota");
            //pelota.muevete(getBounds());//cambia de posicion
            //dibujo.repaint();
            dibujo.actua();
        }
    }
}
