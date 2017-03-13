import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;
public class Pelota
{
    private int posx;
    private int posy;
    private int radio;
    private int mx;
    private int my;
    public Pelota(int x, int y, int r)
    {
        posx=x;
        posy=y;
        radio=r;
        int aleatorio = (int)(Math.random()*2);
        if(aleatorio == 0){
            aleatorio = -1;
        }
        mx=aleatorio*20;
        my=aleatorio*20;
    }
    
    public void muevete(Rectangle r)
    {
        //System.out.println("Mueve pelota...");
        //System.out.println("Tamaño de la ventana: "+r.getWidth() + "," +r.getHeight());
        
        posx+=mx;
        posy+=my;
        if(posy+radio>=r.getHeight()){
            my*=-1;
        }
        else if(posx+radio>=r.getWidth()){
            mx*=-1;
        }
        else if(posy-radio<=0){
            my*=-1;
        }
        else if(posx-radio<0){
            mx*=-1;
        }
    }
    
    public void dibujate(Graphics g)
    {
        g.drawOval(posx,posy,radio*2,radio*2);
    }
    
    
   
    
}
