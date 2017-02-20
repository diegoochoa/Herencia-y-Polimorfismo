public class Principal
{
    public static void main(String [] args)
    {
        Triangulo t1 = new Triangulo(3,4);
        t1.calculaArea();
        System.out.println("El area del triangulo es: "+t1.accederArea());
    }
}
