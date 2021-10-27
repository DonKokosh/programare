import java.util.ArrayList;
import java.util.Scanner;

public class ex_5 
{
    private static void adaugaAutovehicul(ArrayList<Autovehicul> autovehicule)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		String nrInmatriculare;
		double consumD0;
		double consumPU;
		double consumPA;
		
		
		try 
        {
			
			System.out.println("nr inmatriculare:");
			nrInmatriculare = keyboard.nextLine();
			System.out.println("consum D0(drum cu panta neglijabila):");
			consumD0 = keyboard.nextDouble();
			System.out.println("consum PU(panta usoara): ");
			consumPU = keyboard.nextDouble();
			System.out.println("consum PA(panta accentuata):");
			consumPA = keyboard.nextDouble();
			
			
			Autovehicul auto = new Autovehicul(nrInmatriculare.trim(),consumD0,consumPU,consumPA);
			
			autovehicule.add(auto);
		}
		catch(Exception e)
		{
			System.out.println("Eroare: "+ e);
			
		}
	}
	
	
	private static void eliminaAutovehicul(ArrayList<Autovehicul> autovehicule)
	{
		Scanner keyboard = new Scanner(System.in);
		String nrInmatriculare;
		
		try 
        {
		
			System.out.println("nr inmatriculare:");
			nrInmatriculare = keyboard.nextLine();
			
		
			int indexGasit = -1;
			for(int i=0;i<autovehicule.size(); i++)
			{
		
				if(autovehicule.get(i).getNrInmatriculare().equals(nrInmatriculare.trim()))
				{
					indexGasit = i;
					break;
				}
			}
		
			if(indexGasit>=0)
				autovehicule.remove(indexGasit);
			else
		
				System.out.println("Elementul nu se afla in lista");
		}
		catch(Exception e)
		{
			System.out.println("Eroare: " + e);
		}
	}
	
	
	private static String introduTraseu()
	{
		Scanner keyboard = new Scanner(System.in);
		String traseu;
		
		System.out.println("traseu:");
		traseu = keyboard.nextLine();
		
	
		return traseu;
	}
	
	
	private static void consumuri(String traseu, ArrayList<Autovehicul> autovehicule)
	{
	
		ArrayList<String> drum = new ArrayList<String>();
		
	
		for(int i=0;i<traseu.length()-1;i++)
		{
			String portiuneDrum = traseu.substring(i,i+2);
	
			if(portiuneDrum.equals("D0") || portiuneDrum.equals("PU") || portiuneDrum.equals("PA")) 
			{
				drum.add(portiuneDrum);
			}
		}
		
		System.out.print("drum->");
		for(int i=0;i<drum.size();i++)
		{
			System.out.print(drum.get(i)+"->");
		}
		System.out.println();

		
		for(int i=0;i<autovehicule.size();i++)
		{
		
			double consum = 0;
		
			for(int j=0;j<drum.size();j++)
			{
				if(drum.get(j).equals("D0"))
				{
					System.out.println();
					consum += autovehicule.get(i).getConsumD0()/10;
				}
				if(drum.get(j).equals("PU"))
				{
					consum += autovehicule.get(i).getConsumPU()/10;
				}
				if(drum.get(j).equals("PA"))
				{
					consum += autovehicule.get(i).getConsumPA()/10;
				}
			}
		
			autovehicule.get(i).setConsumTotal(consum);
		}
		
				
		System.out.println("Autovehicule(nesortat)");
		for(int i=0;i<autovehicule.size();i++)
		{
			System.out.println(autovehicule.get(i).toString());
		}	
		System.out.println();
		
		
		for (int i = 0; i < autovehicule.size(); i++) 
		{
	          for (int j = autovehicule.size() - 1; j > i; j--)
	          {
	              if (autovehicule.get(i).getConsumTotal() > autovehicule.get(j).getConsumTotal()) 
                  {

	                  Autovehicul aux = autovehicule.get(i);
	                  autovehicule.set(i,autovehicule.get(j)) ;
	                  autovehicule.set(j,aux);
	              }
	          }
	    }
		
		
		System.out.println("Autovehicule(sortat)");
		for(int i=0;i<autovehicule.size();i++)
		{
			System.out.println(autovehicule.get(i).toString());
		}	
		System.out.println();
	}
	
	
	private static void afisare(ArrayList<Autovehicul>autovehicule)
	{
	
		for(int i=0;i<autovehicule.size();i++)
		{
			System.out.println(autovehicule.get(i).toString());
		}
	}
	
	
	

	
	
	public static void main(String[] args) 
    {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		ArrayList<Autovehicul> autovehicule = new ArrayList<Autovehicul>();
		
		String traseu = new String();
		
		
		do 
        {
			System.out.println("-----------MENIU-----------\n"
					         + "a. Adaugare autovehicul\n"
					         + "b. Eliminare autovehicul\n"
					         + "c. Introducere traseu\n"
					         + "d. Consumuri\n"
					         + "e. Iesire\n"
					         + "---------------------------\n"
					         + "Introduceti o optiune:");
		
			String comanda = keyboard.nextLine();
		
			switch(comanda)
			{
			case "a":
				adaugaAutovehicul(autovehicule);
				break;
			case "b":
		
				afisare(autovehicule);
		
				eliminaAutovehicul(autovehicule);
		
				afisare(autovehicule);
				break;
			case "c":
		
				traseu = introduTraseu();
				break;
			case "d":
		
				consumuri(traseu, autovehicule);
				break;
			case "e":
			{
		
				System.out.println("Multumim!");
				return;
			} 
			
			default:
				System.out.println("Nu este o optiune valida");
			}
		}
        while(true);    
    }
}
