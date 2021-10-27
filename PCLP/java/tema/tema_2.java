import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.standard.Copies;

import java.util.Arrays;

public class tema_2 
{
    private static void T_2_1() 
    {
        Random rand = new Random();
        Scanner tast = new Scanner(System.in);
        
        int ghici = rand.nextInt(100);
        int incercari = 0;
        int guess;
        
        boolean win = false;

        while (win == false)
        {
            System.out.println("Ghiceste un numar inte 1 si 100");
            guess = tast.nextInt();
            incercari++;

            if (guess == ghici)
            {
                win = true;
            }
            else if (guess < ghici)
            {
                System.out.println("Mai mare");
            }
            else if (guess > ghici)
            {
                System.out.println("Mai mic");
            }
        }
        System.out.println("Ai ghicit!");
        System.out.println("Numarul era: " +ghici);
        System.out.println("Va luat " +incercari+ "incercari");
    }
    
    private static void T_2_2() 
    {
		double produs = 1;
		double dif = 0;
		double suma = 0;
		double tab1[] = new double[15];
		Scanner t = new Scanner(System.in);
		for(int i=0;i<15;i++)
		{
			System.out.print("tab1["+i+"]= ");
			tab1[i] = t.nextDouble();
			
			
		}
		
	
		
		
		int nrpare = 0;
		for(int i=0;i<15;i++)
		{
			if(tab1[i] % 2==0)
			{
				System.out.print(tab1[i] + "\t");
				nrpare++;
				suma += tab1[i];
			}
		}


		int nrImpare = 0;
		for(int i=0;i<15;i++)
		{
			if(tab1[i] % 2==1)
			{
				System.out.print(tab1[i] + "\t");
				nrImpare++;
				dif -= tab1[i];
			}
		}
		
		System.out.println("\nsuma este " + suma + "\t");
		System.out.println("\ndiferenta este " +dif + "\t");
	
		for (int i=0; i<15; i++) 
		{
			if ( tab1[i] == 0) 
			{
				System.out.println("Exista " +i+ " elemente nule");	
			}
			else
			{
				System.out.println("Nu exista elemente nule");
			}
		}
		
		for(int i=9;i>=0;i--)
		{
			System.out.print(tab1[i]+"\t");
		}
		System.out.println();
		
	
		for(int i=0;i<15;i++)
		{
			if (tab1[i] != 0)
			{
				produs *= tab1[i];
			}
		}

		System.out.println("Produsul este " +produs);

		double tab2[] = new double[5];

		Arrays.fill(tab2, -1);

		for(int i=0;i<5;i++)
		{
			tab2[0] = tab1[0];
			tab2[1] = tab1[1];
			tab2[2] = tab1[2];
			System.out.println(tab2[i] + "\t");
		}



		Arrays.sort(tab2);
		
		
		for(int i=0;i<15;i++)
		{
			System.out.print(tab2[i]+"\t");
		}
		System.out.println();
		
			
	}
    public static void main(String[] args) 
    {
        int x;
        Scanner tast = new Scanner(System.in);    
        System.out.println("Alegeti dintre 1 pentru a rula T_2_1 sau 2 pentru T_2_2: ");
        x = tast.nextInt();

        switch(x) 
        {
            case 1:
                T_2_1();
                break;
            
            case 2:
                T_2_2();
                break;
        
            default:
                break;
        }   
    }
}
