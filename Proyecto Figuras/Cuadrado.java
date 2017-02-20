public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(float l)
    {
        lado=l;
        area=0;
    }
    
    public void calculaArea()
    {
        area=lado*lado;
    }
}
