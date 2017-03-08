public class Asalariado extends Empleado
{
    private double ssemanal;
    public Asalariado(String name, double ss)
    {
        super(name);
        ssemanal=ss;
    }
    @Override
    public double calculaSueldo()
    {
        return ssemanal;
    }
    @Override
    public String toString()
    {
        return "" +super.toString() +" sueldo es: " + ssemanal;
    }
    
    public String regresaNombre()
    {
        return super.regresaNombre();
    }
    
}
