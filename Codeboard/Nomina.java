import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
public class Nomina
{
    public void nom()
    {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        
        empleados.add(new Asalariado("Jack",800));
        empleados.add(new EmpCom("Phill",10000,6));
        empleados.add(new AsaCom("Mitchell",5000,4,300));
        empleados.add(new PorHora("Luke",16.75,42));
        
        Iterator<Empleado> it = empleados.iterator();
        double sueldos=0;
        while(it.hasNext())
        {
            Empleado e = it.next();
            sueldos+=e.calculaSueldo();
            System.out.println(e.calculaSueldo());
        }
        System.out.println("Sueldo total de la nomina: $"+sueldos);
        
        Iterator<Empleado> et = empleados.iterator();
        String nm="Mitchell";
        while(et.hasNext())
        {
            Empleado e = et.next();
            if(e.regresaNombre()==nm)
            {
                System.out.println(e.toString());
            }
            
        }
        for(int i=0;i<empleados.size()-1;i++)
        {
            if(empleados.calculaSueldo()<5000)
            {
                empleados.remove(i);
            }
        }
        /*
        Empleado [] arrEmp = new Empleado [empleados.size()];
        arrEmp = empleados.toArray(arrEmp);
        Arrays.sort(arrEmp);
        for(Empleado e : arrEmp)
        {
            System.out.println(e.toString());
        }*/
    }
}





















