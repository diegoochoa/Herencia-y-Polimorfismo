public class Data
{
   public static float average(Mesurable[] objects)
   {
       float sum=0;
       for(Mesurable obj : objects)
       {
           sum+=obj.getMeasure();
       }
       if(objects.length>0)
       {
           return sum / objects.length;
       }
       else
       {
           return 0;
       }
   }
}
