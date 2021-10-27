import java.util.ArrayList;

public class clasa_principala 
{
    public static void main(String[] args) 
    {
        casa c1 = new casa(100, 4);
        c1.afis_sup();
        c1.afis_nr_cam();
        
        casa c2 = new casa(150, 5);

        System.out.println(c1.compareTo(c2));

        ArrayList <casa> listacase = ArrayList <casa>();
        listacase.add(c1);
        listacase.add(c2);
        listacase.add (new casa(50, 2));

        Collections.sort(listacase);
        System.out.println(listacase.toString());
    }
    
}