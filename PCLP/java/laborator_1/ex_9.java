import java.util.Scanner;

public class ex_9 
{
    public static void main(String[] args) 
    {
        int lgdrum, consumcarb, pretbilet;
        Scanner tast = new Scanner(System.in);
        System.out.println("lungime drum = ");
        lgdrum = tast.nextInt();
        System.out.println("condum carburant = ");
        consumcarb = tast.nextInt();
        System.out.println("pret bilet de tren = ");    
        pretbilet = tast.nextInt();
        int pretcarb = 5;
        int uzura = 0.05;
        double pretmasina = lgdrum*consumcarb/100*pretcarb + lgdrum * uzura;
        String str = (pretmasina<pretbilet) ;
    }    
}
