import java.util.Scanner;

public class ex_3 
{
    public static void main(String[] args) 
    {
        int a;
        Scanner tast = new Scanner(System.in);
        System.out.println("introduceti un nr = ");
        a = tast.nextInt();
        double patrat = Math.pow(a, 2);
        System.out.println("numarul la patrat este = " + patrat);
        double cub = Math.pow(a, 3);
        System.out.println("numarul la cub este = " + cub);
        double p4 = Math.pow(a, 4);
        System.out.println("numarul pa puterea a 4 este = " + p4);

    }    
}
