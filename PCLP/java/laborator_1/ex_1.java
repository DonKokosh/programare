import java.util.Scanner;

public class ex_1
{
    public static void main (String[] args) 
    {
        int nr_1, nr_2;
        Scanner tast = new Scanner(System.in);
        System.out.println("introduceti primul nr = ");
        nr_1 = tast.nextInt();
        System.out.println("introduceti al doilea numar = ");
        nr_2 = tast.nextInt();
        int suma = nr_1+nr_2;
        System.out.println("suma = " + suma);
        int diferenta = nr_1-nr_2;
        System.out.println("diferenta = " + diferenta);
        int produs = nr_1*nr_2;
        System.out.println("produs = " + produs);
        double media = (double)suma/2;
        System.out.println("media = " + media);
        int modul = Math.abs(diferenta);
        System.out.println(modul);

        int max = Math.max(nr_1, nr_2);
        System.out.println("max = " + max);

        int min = Math.min(nr_1, nr_2);
        System.out.println("min = " + min);
    }    
}
