import java.util.Scanner;


public class exercitiu_2 
{

    public static void main(String[] args) 
    {
        int cifra;
		

		Scanner tastatura = new Scanner(System.in);
		
		System.out.print("Introduceti o cifra: ");
		cifra = tastatura.nextInt();
		
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
			System.out.println("numarul nu este o cifra");
		}	    
    }
		
}
