public class Principal
{
    public static void main(String [] args)
    {
        Triangulo t1 = new Triangulo(3,4);
        Cuadrado c1 = new Cuadrado(5);
        Circulo c2 = new Circulo(6);
        Figura [] array = new Figura[3];
        Figura aux;
        
        array[0]=t1;
        array[1]=c1;
        array[2]=c2;
        
        for(int i=0; i<array.length ; i++)
        {
            array[i].calculaArea();
        }
        for(int i=0; i<array.length ; i++)
        {
            System.out.println("El area es: " +array[i].accederArea());
        }
        
        
        /*
        t1.calculaArea();
        System.out.println("El area del triangulo es: "+t1.accederArea());
        
        c1.calculaArea();
        System.out.println("El area del cuadrado es: "+c1.accederArea());
        
        c2.calculaArea();
        System.out.println("El area del circulo es: "+c2.accederArea());
        */
       
       //comprobacion estatica es checar los tipos de datos en el programa
       //comprobacion dinamica ocurre al ejecutar el programa 
    }
}
