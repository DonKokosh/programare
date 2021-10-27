import java.util.Scanner;

public class ex_2
{
    public static void main(String[] args)
    {
        int raza;
        Scanner tast = new Scanner(System.in);
        System.out.println("introduceti raza cercului = ");
        raza = tast.nextInt();
        double arie_cerc = Math.PI*raza*raza;
        System.out.println("ariea cercului = " + arie_cerc);
        double c = 2*Math.PI*raza;
        System.out.println("aria circumferinta a cercului este = " + c);
        double v = (4*Math.PI*raza*raza*raza*raza)/3;
        System.out.println("volumul cercului este = " + v);
        double as = 4*Math.PI*raza*raza;
        System.out.println("aria sferei este = " + as);

    }    
}
