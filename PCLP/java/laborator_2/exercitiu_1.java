import java.util.Scanner;
import java.util.Arrays;


public class exercitiu_1
{
    private static void exercitiul_1()
    {
		int a,b,c;
		int max, min, produs;
		
		Scanner tast = new Scanner(System.in);
		
		System.out.print("introduceti a = ");
		a = tast.nextInt();
		System.out.print("introduceti b = ");
		b = tast.nextInt();
		System.out.print("introduceti c = ");
		c = tast.nextInt();
		
		if(a>0 && b>0 && c>0)
		{
			max = Math.max(Math.max(a, b), c);
			System.out.println("Maximul este " + max);
			
		}
		else if(a<0 && b<0 && c<0)
		{
			min = Math.min(Math.min(a, b),c);
			System.out.println("Minimul este " + min);
		}
		else
		{
			produs = a * b * c;
			System.out.println("Produsul este " + produs);
		}
		    
    }
	private static void exercitiul_2() 
	{
		int cifra;
		

		Scanner t = new Scanner(System.in);
		
		System.out.print("Introduceti o cifra: ");
		cifra = t.nextInt();
		
		switch(cifra)
		{
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("unu");
			break;
		case 2:
			System.out.println("doi");
			break;
		case 3:
			System.out.println("trei");
			break;
		case 4:
			System.out.println("patru");
			break;
		case 5:
			System.out.println("cinci");
			break;
		case 6:
			System.out.println("sase");
			break;
		case 7:
			System.out.println("sapte");
			break;
		case 8:
			System.out.println("opt");
			break;
		case 9:
			System.out.println("noua");
			break;
		default:
			System.out.println("nu este specificat in case, baiiiiiiiiiiii !!!!!!!!!!!");
		}	  	
	}
	private static void exercitiu_3() 
	{
		int radical;
		for(int i=1; i<=100; i++)
		{
			radical = (int)Math.sqrt(i);
			if(i == (radical*radical))
				System.out.print(i + "\t");
		}
		System.out.println();
	}
	private static void exercitiul_4() 
	{
		int i = 1;
		long suma = 0;
		double produs = 1;
		
		while(i <= 200)
		{
			if(i % 2 == 1)
				suma += i;
			else
				produs *= i;
			i++;
		}
		System.out.println("Suma primelor 100 de nr impare este " +  suma);
		System.out.println("Produsul primelor 100 de nr pare este " +  produs);	
	}
	private static void exercitiul_5() 
	{
			int i = 1;
		long suma = 0;
		double produs = 1;
		
		do{
			if(i % 2 == 1)
				suma += i;
			else
				produs *= i;
			i++;
		}while(i <= 200);
		
		System.out.println("Suma primelor 100 de nr impare este " +  suma);
		System.out.println("Produsul primelor 100 de nr pare este " +  produs);	
	}
	private static void exercitiul_6() 
	{
		double suma = 0;
		double produs = 1;
		double media = 0;
		double eroarePatratica = 0;
		
	
		double tab1[] = new double[10];
		
	
		Scanner t = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.print("tab1["+i+"]= ");
			tab1[i] = t.nextDouble();
			
			suma += tab1[i];
			if (tab1[i] != 0)
				produs *= tab1[i];
		}
		System.out.println();
		
	
		System.out.println("suma este " + suma);
		
	
		System.out.println("produsul este " + produs);
		
	
		media = suma/10;
		System.out.println("media aritmetica este " +  media);
		
		
		for (int i=0;i<10;i++)
		{
			eroarePatratica += Math.pow(tab1[i] - media,2);
		}
		eroarePatratica = Math.sqrt(eroarePatratica/9);
		System.out.println("Eroarea patratica este " +  eroarePatratica);
		
		
		int tab2[] = new int[10];
		for(int i=0;i<10;i++)
		{
			tab2[i] = (int)Math.abs(tab1[i]);
		}
		
		int nrImpare = 0;
		System.out.print("Numere impare: ");
		for(int i=0;i<10;i++)
		{
			if(tab2[i] % 2==1)
			{
				System.out.print(tab2[i] + "\t");
				nrImpare++;
			}
		}
		System.out.println("\nNrImpare = " + nrImpare);
		
		System.out.print("Patrate perfecte: ");
		for(int i=0;i<10;i++)
		{
			int radical = (int)Math.sqrt(tab2[i]);
			if(tab2[i] == radical*radical)
			{
				System.out.print(tab2[i] + "\t");
			}
		}
		System.out.println();
		for(int i=0;i<10;i++)
		{
			System.out.print(tab1[i]+"\t"+tab2[i]+"\t");
		}
		System.out.println();
		
		for(int i=9;i>=0;i--)
		{
			System.out.print(tab2[i]+"\t");
		}
		System.out.println();
		
		
		Arrays.sort(tab1);
		Arrays.sort(tab2);
		
		
		for(int i=0;i<10;i++)
		{
			System.out.print(tab1[i]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<10;i++)
		{
			System.out.print(tab2[i]+"\t");
		}
		System.out.println();
		
		
		double tab3[] = new double[20];
	
		Arrays.fill(tab3, 1);
		
		for(int i=0;i<10;i++)
		{
			if(tab1[i] != 0)
			{
				tab3[2*i] = tab1[i];
			}
			if(tab2[i] != 0)
			{
				tab3[2*i+1] = tab2[i];
			}
		}
		Arrays.sort(tab3);
		

		for(int i=0;i<20;i++)
		{
			System.out.print(tab3[i] + "\t");
		}
		System.out.println();
		
	
		double nr;
		System.out.print("Introduceti un numar:");
		nr = t.nextDouble();
		int gasit = Arrays.binarySearch(tab3, nr);
		if(gasit>0)
			System.out.println("Numarul " + nr + " a fost gasit");
		else
			System.out.println("Numarul " + nr + " nu a fost gasit");
			
	}
	public static void main(String[] args) 
	{
		Scanner tast = new Scanner(System.in);

		
		// Exercitiul 1
		// exercitiul_1();
		// Exercitul 2
		// exercitiul_2();
		// Exercitiul 3 
		// exercitiu_3();
		// Exercitiul 4
		// exercitiul_4();
		// Exercitiul 5 
		// exercitiul_5();
		// Exercitiul 6 
		// exercitiul_6();
	}
}
