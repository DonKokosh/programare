import java.util.Scanner;

public class ex_4 
{
    public static void main(String[] args)
    {
        int a;
        Scanner tast = new Scanner(System.in);
        System.out.println("introduceti numarul de metri = ");
        a = tast.nextInt();
        double mile = a*0.000621;
        System.out.println("conversia in mile = " + mile);
        double feet = a*3.280839;
        System.out.println("conversia in feet = " + feet);
        double inch = a*39.370078;
        System.out.println("conversia in inch = " + inch);
    }    
}
