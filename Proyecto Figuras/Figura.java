public class Figura
{
    protected float area;
    public Figura()
    {
        area=0;
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
}
