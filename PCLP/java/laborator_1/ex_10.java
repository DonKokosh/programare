

public class ex_10 
{
    public static void main(String[] args) 
    {
        int contor;
        double depozit = 1000;
        int rata = 50;
        double dobanda = 0.5;
        while (depozit>0) 
        {
            depozit -= rata - dobanda*depozit/100;
            contor++;    
        }    
        int ani = contor/12;
        int luni = contor%12;
        System.out.println(ani + " ani" + luni + " luni");
    }    
}
