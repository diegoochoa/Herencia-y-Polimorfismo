public class Triangulo extends Figura
{
   private float base;
   private float altura;
   
   public Triangulo(float b, float h)
   {
       base=b;
       altura=h;
    }
    
    public void calculaArea()
    {
        area=base*altura/2;
    }
    
    public String dimeInfo()
   {
       return "Triangulo " + super.dimeInfo();
   }
}
