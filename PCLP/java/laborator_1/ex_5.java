import java.util.Scanner;

public class ex_5
{
    public static void main(String[] args) 
    {
        int a, b;
        Scanner tast = new Scanner(System.in);
        System.out.println("introduceti lungimea = ");
        a = tast.nextInt();
        System.out.println("introduceti latimea = ");
        b = tast.nextInt();
        int arie = a*b;
        System.out.println("aria dreptunghiului este = " + arie);
        int perimetru = 2*(a+b);
        System.out.println("perimetrul dreptunghiului este = " + perimetru);
        double d = Math.pow(a, 2) + Math.pow(b, 2);
        System.out.println("diagonala dreptunghiului este = " + d);

    }    
}
