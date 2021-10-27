import java.util.Scanner;

public class program_1 
{
    public static void main(String [] args) 
    {
        int a= 5;
        float b= 2.3f;
        double c= 5.6;

        final double pi= 3.14;

        float suma = a+b;
        System.out.println("suma este " + suma + " a doua numere");

        Scanner tastatura = new Scanner(System.in);
        System.out.println("Introduceti un int");
        int nr1 = tastatura.nextInt();
        System.out.println("nr1=" + nr1);
    }    
}
