import java.util.ArrayList;
import java.util.Iterator; 
public class Principal
{
    public static void main(String [] args)
    {
        Triangulo t1 = new Triangulo(3,4);
        Cuadrado c1 = new Cuadrado(5);
        Circulo c2 = new Circulo(6);
        ArrayList<Figura> lista = new ArrayList<Figura>();
         
        
        lista.add(t1);
        lista.add(c1);
        lista.add(c2);
       
       for(Figura f : lista)
       {
           f.calculaArea();
       } 
       for(Figura f : lista)
       {
           System.out.println(f);
       }
       
       //comprobacion estatica es checar los tipos de datos en el programa
       //comprobacion dinamica ocurre al ejecutar el programa 
       /*
        Triangulo@ff1e5
        Cuadrado@66026e
        Circulo@722258
        //Numero es el identificador del objeto (clave o numero hash)
        */
    }
}
