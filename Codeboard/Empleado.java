public abstract class Empleado
{
    private String nombre;
    
    public Empleado(String n)
    {
        nombre=n;
    }
    
    public String regresaNombre()
    {
        return nombre;
    }
    
    public abstract double calculaSueldo();
    
    @Override
    public String toString()
    {
        return nombre;
    }

}
