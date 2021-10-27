import java.util.Comparator;

import exem_2.locuinta;

public class casa implements locuinta, Comparable <casa>, Comparator
{
    private double suprafata;
    private double nr_camere;

    public casa(double suprafata, double nr_camere) 
    {
        super();
        this.suprafata = suprafata;
        this.nr_camere = nr_camere;    
    }

    public casa() 
    {
            
    }

    public void afis_sup() 
    {
        System.out.println("suprafata = " + suprafata);    
    }

    public void afis_nr_cam() 
    {
        System.out.println("nr_camere = " + nr_camere);    
    }

    @Override
    public int compareTo(casa o) 
    {
        if(this.suprafata < o.suprafata)
            return -1;
        else if (this.suprafata == o.suprafata)
            return 0;
        else
            return 1;   
    }

    @Override
    public int compare(Object o1, Object o2) 
    {
        casa c1 = (casa) o1;
        casa c2 = (casa) o2;
        if (c1.nr_camere < c2.nr_camere) 
        {
            return 1;    
        } 
        else if(c1.nr_camere == c2.nr_camere)
        {
            return 0;    
        }  
        else
            return 1;
    }

    @Override
    public String toString() {
        return "casa [nr_camere=" + nr_camere + ", suprafata=" + suprafata + "]";
    }
    

}
