import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ex_1 
{
	
	
	
	public static void adDreptunghi(	ArrayList<Dreptunghi> lista) 
    {
		Scanner s = new Scanner(System.in);
		System.out.println("Lungime");
		double lungime = s.nextDouble();
		System.out.println("Latime ");
		double latime = s.nextDouble();
		lista.add( new Dreptunghi(lungime, latime ));
	}
	
	
	public static void main(String args[]) 
    {
		ArrayList<Dreptunghi> lista = new ArrayList<Dreptunghi>();
		
		for(int i=0; i<3; i++) 
        {
			System.out.println("nr Dreptunghi" + i);
			adDreptunghi(lista);
		}
		
		for(int i=0;i<3; i++) 
        {
			System.out.println("Arie Dreptunhi " + i + "= " + lista.get(i).calculeazaAria());
		}
		

		Collections.sort(lista);
		System.out.println("Dupa soratre");
		
		for(int i=0;i<3; i++) 
        {
			System.out.println("Arie Dreptunhi " + i + "= " + lista.get(i).calculeazaAria());
		}
		
		
		
		
		
		
	}

}