import java.util.Arrays;
import java.util.Scanner;

public class tema_3 
{

	private static int varf(int mat[][], int i, int j, int n, int m)
	{
		if (n==1 && m==1)
			return 1;
		
		if (i==0 && j==0)
		{
			if(mat[i][j]>mat[i][j+1] && mat[i][j]>mat[i+1][j] && mat[i][j]>mat[i+1][j+1])
				return 1;
			else
				return 0;
		}
		
		if (i==0 && j<m-1)
		{
			if(mat[i][j]>mat[i][j-1] && mat[i][j]>mat[i][j+1] && mat[i][j]>mat[i+1][j-1] &&
					mat[i][j]>mat[i+1][j] && mat[i][j]>mat[i+1][j+1])
				return 1;
			else
				return 0;
		}
		
		if (i==0 && j==m-1)
		{
			if(mat[i][j]>mat[i][j-1] && mat[i][j]>mat[i+1][j-1] && mat[i][j]>mat[i+1][j])
				return 1;
			else
				return 0;
		}
		
		if (i<n-1 && j==0)
		{
			if(mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i+1][j] && mat[i][j]>mat[i-1][j+1] &&
					mat[i][j]>mat[i][j+1] && mat[i][j]>mat[i+1][j+1])
				return 1;
			else
				return 0;
		}
		
		if (i==n-1 && j==0)
		{
			if(mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i-1][j+1] && mat[i][j]>mat[i][j+1])
				return 1;
			else
				return 0;
		}
		
		if (i<n-1 && j<m-1)
		{
			if(mat[i][j]>mat[i-1][j-1] && mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i-1][j+1] &&
					mat[i][j]>mat[i][j-1] && mat[i][j]>mat[i][j+1] && mat[i][j]>mat[i+1][j-1] && 
					mat[i][j]>mat[i+1][j] && mat[i][j]>mat[i+1][j+1])
				return 1;
			else
				return 0;
		}
		
		if (i==n-1 && j<m-1)
		{
			if(mat[i][j]>mat[i-1][j-1] && mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i-1][j+1] &&
					mat[i][j]>mat[i][j-1] && mat[i][j]>mat[i][j+1])
				return 1;
			else
				return 0;
		}
	
		if (i<n-1 && j==m-1)
		{
			if(mat[i][j]>mat[i-1][j-1] && mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i][j-1] && 
					mat[i][j]>mat[i+1][j-1] && mat[i][j]>mat[i+1][j])
				return 1;
			else
				return 0;
		}
		
		if (i==n-1 && j==m-1)
		{
			if(mat[i][j]>mat[i-1][j-1] && mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i][j-1])
				return 1;
			else
				return 0;
		}
		return 0;
	}
	
	private static void ex1()
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Nr linii: ");
		int n = user_input.nextInt();
		System.out.print("Nr coloane: ");
		int m = user_input.nextInt();
		
		int mat[][] = new int[n][m];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				System.out.print("mat[" + i + "][" + j + "]=");
				mat[i][j] = user_input.nextInt();
			}
		
		System.out.println("Afisare: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
				System.out.print(mat[i][j] + "\t");
			System.out.println();
		}
		
		int k;
		do 
		{
			System.out.print("Introduceti o valoare ce apartine intervalului [0," + m + "]: ");
			k = user_input.nextInt();
		}
		while (!((k>=0)&&(k<=m)));
		
		System.out.print("Liniile cu " + k + " elemente nule: ");
		
		for(int i=0;i<n;i++)
		{
			int nr_elemente_nule=0;
			for(int j=0;j<m;j++)
			{
				if(mat[i][j]==0)
					nr_elemente_nule++;
			}
			if (nr_elemente_nule == k)
				System.out.print(i + " ");
		}
		
		int sum[] = new int[m];
		Arrays.fill(sum, 0);
		
		for(int i=0;i<m;i++)
		{
			int max = mat[0][i];
			for(int j=1;j<n;j++)
			{
				if(mat[j][i]>max)
					max = mat[j][i];
			}
			while(max!=0)
			{
				sum[i] += max%10;
				max /= 10;
			}
		}
		
		System.out.println();
		System.out.print("Tablou suma: ");
		for(int i=0;i<m;i++)
			System.out.print(sum[i] + " ");
		
		System.out.println("Elemente varf: ");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				if(varf(mat,i,j,n,m)==1)
				System.out.print(mat[i][j] + " ");
			}
		
		
	}

	private static int consoana(char c)
	{
		if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='A' && c!='E' && c!='I' && c!='O'
				&& c!='U')
			return 1;
		else
			return 0;
	}
	
	private static void ex2()
	{
		Scanner user_input = new Scanner(System.in);
		
		String fraza = user_input.nextLine();
		
		String[] cuvinte = fraza.split(" ");
		
		fraza = "";
		
		for(int i=0;i<cuvinte.length;i++)
		{
			cuvinte[i] = cuvinte[i].substring(0,1).toUpperCase() + cuvinte[i].substring(1, cuvinte[i].length());
			fraza = fraza + cuvinte[i] + " ";
		}
		
		System.out.println(fraza);
		
		System.out.print("Grupuri de 2 litere identice:");
		
		for (int i=0;i<fraza.length();i++)
		{
			char caracter = fraza.charAt(i);
			int pozitia = i;
			int nr_aparitii = 1;
			while (pozitia >= 0)
			{
				pozitia = fraza.indexOf(caracter, pozitia+1);
				if(pozitia == i+nr_aparitii)
				{
					nr_aparitii++;
				}
			}
			if(nr_aparitii == 2)
			{
				String grup = caracter + "" + caracter + ";";
				System.out.print(grup);
			}
		}
		
		for (int i=0;i<fraza.length();i++)
		{
			if(fraza.charAt(i)!=' ' && fraza.charAt(i)!=':')
				if(consoana(fraza.charAt(i))==1)
					fraza = fraza.replace(fraza.charAt(i), ':');
		}
		
		System.out.println();
		System.out.println(fraza);
	}
	
	public static void main(String [] args ) 
	{
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Nr exercitiu: ");
		int ex = user_input.nextInt();
		
		switch(ex)
		{
		case 1: ex1();
			break;
		case 2: ex2();
			break;
		default: System.out.println("Exercitiul nu exista");
		}
	}
}
