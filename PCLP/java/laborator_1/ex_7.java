import java.util.Scanner;

public class ex_7 
{
    public static void main(String[] args) 
    {
        
        Scanner tast = new Scanner(System.in);
        double pi = 1;
        int i = 1;
        int j = 1;
        while (1<1000000) 
        {
            pi = pi +Math.pow(-1, i) *1/(j+2);
            i++;
            j+=2;       
        }
        pi = pi*4;
        System.out.println(pi + "fata de " +Math.PI);
    }
}
