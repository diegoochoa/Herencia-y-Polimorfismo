public class Principal
{
    public static void main(String [] args)
    {
        Triangulo t1 = new Triangulo(3,4);
        Cuadrado c1 = new Cuadrado(5);
        Circulo c2 = new Circulo(6);
        
        t1.calculaArea();
        System.out.println("El area del triangulo es: "+t1.accederArea());
        
        c1.calculaArea();
        System.out.println("El area del cuadrado es: "+c1.accederArea());
        
        c2.calculaArea();
        System.out.println("El area del circulo es: "+c2.accederArea());
    }
}