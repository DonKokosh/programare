import java.util.Scanner;

public class laborator_3 
{
    private static void ex_1() 
    {

		int mat[][] = new int[3][3];
		
		Scanner t = new Scanner(System.in);
		
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print("matrice["+i+"]["+j+"]= ");
				mat[i][j] = t.nextInt();
			}
		}
		
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
		
				System.out.print(mat[j][i] + "\t");
			}
		
			System.out.println();
		}
		
		int suma = 0;
		for(int i=0;i<mat.length;i++)
		{
			suma += mat[i][i];
		}
		System.out.println("Suma este: " + suma);
		int diaPri = 1;
		for(int i=0;i<mat.length;i++)
		{
			diaPri *= mat[i][i];
		}
		int dia2 = mat[0][1]*mat[1][2]*mat[2][0];
		int dia3 = mat[1][0]*mat[2][1]*mat[0][2];
		int diaSec = 1;
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				
				if(i+j == mat.length-1)
				{
					diaSec *= mat[i][j];
				}
			}
		}
		int diaSec2 = mat[0][1]*mat[1][0]*mat[2][2];
		int diaSec3 = mat[1][2]*mat[2][1]*mat[0][0];

		int det = diaPri + dia2 + dia3 
				         - diaSec - diaSec2 - diaSec3;
		System.out.println("Determinantul este: " +  det);

    }    

    private static void ex_2() 
    {
       
		Scanner t = new Scanner(System.in);
		
		
		System.out.println("Introduceti un sir de caractere");		
		String str = t.nextLine();
		
		int nrCuvinte = 1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				
				nrCuvinte++;
			}
		}
		System.out.println("Nr cuvinte in sirul de caractere este " + nrCuvinte);
		String[] cuv = str.split(" ");
		
		for(int i=0;i<cuv.length;i++)
		{
			
			int apar = 0;
			boolean dejaGasit = false;
			for(int k=0;k<i;k++)
			{
				if(cuv[i].compareTo(cuv[k])==0)
				{
					dejaGasit = true;
				}
			}
		
			if(!dejaGasit)
			{
				for(int j=i;j<cuv.length;j++)
				{
					
					if(cuv[i].compareTo(cuv[j])==0)
					{
						apar++;
					}
				}
				
				if(apar>0)
				{
					System.out.println("cuvantul '"+cuv[i]+"' apare de "+apar+" ori");
				}
			}		
		}
		
		System.out.println("Introduceti un  cuvant");
		String cuvant = t.nextLine();
		
		int aparitii = 0;
		for(int j=0;j<cuv.length;j++)
		{
			if(cuvant.compareTo(cuv[j])==0)
			{
				aparitii++;
			}
		}
		if(aparitii>0)
		{
			System.out.println("cuvantul '"+cuvant+"' apare de "+aparitii+" ori");
		}
		else
		{
			System.out.println("Cuvantul nu a fost gasit");
		}

    }

    private static void ex_3() 
    {
      	int nr;
		Scanner t = new Scanner(System.in);
		do
		{
			System.out.println("un nr intre 1 si 99");
			nr = t.nextInt();
			if(nr == 0)
			{
				return;
			}
		}
		while(nr<1 || nr>99);

		if(nr!=0)
		{
			StringBuilder str = new StringBuilder();
			
			int zeci = nr/10;
			int unitati = nr%10;
			
			if(zeci>1)
			{
				switch(zeci)
				{
				case 2:
					str.append("doua");
					break;
				case 3:
					str.append("trei");
					break;
				case 4:
					str.append("patru");
					break;
				case 5:
					str.append("cinci");
					break;
				case 6:
					str.append("sai");
					break;
				case 7:
					str.append("sapte");
					break;
				case 8:
					str.append("opt");
					break;
				case 9:
					str.append("noua");
				}
				str.append("zeci");
				if(unitati!=0)
				{
					str.append(" si ");
				}
			}
			
			switch(unitati)
			{
			case 1:
				if(zeci!=1)
				{
					str.append("unu");
				}
				else
				{
					str.append("un");
				}
				break;
			case 2:
				str.append("doi");
				break;
			case 3:
				str.append("trei");
				break;
			case 4:
				if(zeci!=1)
				{
					str.append("patru");
				}
				else
				{
					str.append("pai");
				}
				break;
			case 5:
				str.append("cinci");
				break;
			case 6:
				if(zeci!=1)
				{
					str.append("sase");
				}
				else
				{
					str.append("sai");
				}
				break;
			case 7:
				str.append("sapte");
				break;
			case 8:
				str.append("opt");
				break;
			case 9:
				str.append("noua");
			}
			
			if(zeci==1)
			{
				if(unitati>=1)
				{
					str.append("spre");
				}
				str.append("zece");
			}
			
			System.out.println(str);
		}
    }

    private static void ex_4() 
    {
		Scanner t = new Scanner(System.in);
		System.out.println("Introduceti un sir de caractere");		
		String str = t.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			char caracterulCurent = str.charAt(i);
			int pozAparitie = i; 
			int nrAparitie = 1;
			
			while (pozAparitie >= 0)
			{
				pozAparitie = str.indexOf(caracterulCurent, pozAparitie+1); 
				if(pozAparitie == i+nrAparitie)
				{
					nrAparitie++;
				}
			}
			if(nrAparitie>=3)
			{
				String secventa = str.substring(i,i+nrAparitie);
				String nouaSecventa = "*"+nrAparitie+caracterulCurent;
				str = str.replaceFirst(secventa, nouaSecventa);
			}
		}
		System.out.println(str);
    }
    public static void main(String[] args) 
    {
        int x;
        Scanner t = new Scanner(System.in);    
        System.out.println("Alegeti dintre 1 pentru a rula ex_1 sau 2 pentru ex_2");
        System.out.println("Ori puteti alege 3 pentru a rula ex_3 sau 4 pentru a rula ex_4 ca doar ce se poate intampla: ");
        x = t.nextInt();
        switch (x) 
    	{
            case 1:
                System.out.println("\nAti ales exercitiul 1");
                ex_1();
                break;

            case 2:
                System.out.println("\nAti ales exercitiul 2");
                ex_2();
                break;
        
            case 3:
                System.out.println("\nAti ales exercitiul 3");    
                ex_3();
                break;

            case 4:
                System.out.println("\nAti ales exercitiul 4");
                ex_4();
                break;
        
            default:
                break;

        }    

    }
}