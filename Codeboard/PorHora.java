public class PorHora extends Empleado
{
    private double shora;
    private double horast;
    private double sueldof;
    public PorHora(String name, double sh, double ht)
    {
        super(name);
        shora=sh;
        horast=ht;
    }
    @Override
    public String toString()
    {
        return "" +super.toString() +" sueldo es: " + sueldof;
    }
    @Override
    public double calculaSueldo()
    {
        if(horast<=40){
            return shora*horast;
        }
        else{
            double aux = horast-40;
            sueldof=shora*40+2*shora*aux;
            return sueldof;
        }
        
    }
}
