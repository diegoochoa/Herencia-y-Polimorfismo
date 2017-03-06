public class Pais implements Mesurable
{
    private int habitantes;
    public Pais(int hab)
    {
        habitantes=hab;
    }
    
    public int regresaHab()
    {
        return habitantes;
    }
    
    public float getMeasure()
    {
        return habitantes;
    }
}
