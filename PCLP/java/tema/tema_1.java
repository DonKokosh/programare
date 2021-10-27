

import java.util.Scanner;

public class tema_1 
{
    public static void main(String[] args) 
    {   
        double a, b, c, b2, min, max, p, m1, m2, m3;
        Scanner tast = new Scanner(System.in);
        System.out.print ("Introduceti a = ");
        a = tast.nextInt();
        System.out.println("introduceti b = ");
        b = tast.nextInt();
        System.out.println("introduceti c = ");
        c = tast.nextInt();
        
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        
        p = a + b + c;
        System.out.println("perimetrul este " +p);


        if (a==b && b==c && c==a) 
        {
            System.out.println("este triunghi echilateral");

        }
        else
        {
            System.out.println("nu este triunghi echilateral");
        }


        min = Math.pow(Math.min(Math.min(a, b),c), 2);
        System.out.println("minumul este " +min);
        max = Math.max(Math.max(a, b), c);
        System.out.println("maximul este " +max);
        
        
        b2 = Math.pow(b, 2);
        b = Math.pow(a, 2) + Math.pow(c, 2);
        if (b == b2)
        {
            System.out.println("triunghiul este dreptunghic");
        }
        else
        {
            System.out.println("tringhiul nu este dreptunghic");
        }

        
        if (a>b && b>a && a>c && c>a && b>c && c>b) 
        {
            m1 = a / 3;
            m2 = b / 4;
            m3 = c / 5;
            System.out.println("valorile sunt divizibile cu tripletul (3,4,5)" );       
        }
        else
        {
            System.out.println("valorile nu sunt divizibile cu tripletul (3,4,5)" );
        }
       
    }
    
    
    

}
