import java.io.*;
import java.util.ArrayList;
public class ex_4 
{



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crearea listei pentru arbori
		ArrayList<Arbore> arbori = new ArrayList<Arbore>();
		//introducerea unor obiecte in lista
		arbori.add(new Arbore("brad","conifere",15,5,"aciforma"));
		arbori.add(new Arbore("mar","foioase",3,2,"ovala"));
		arbori.add(new Arbore("stejar","foioase",15,5,"lobata"));
		arbori.add(new Arbore("tei","foioase",15,5,"rotunde"));
		
		//blocurile try-catch pentru asigurarea tratarii exceptiilor
		try {
		//crearea fluxului
		BufferedWriter out  = new BufferedWriter(new FileWriter("arbori.txt"));
		
		//pentru fiecare obiect din lista se va scrie in fisier
		for(int i=0;i<arbori.size();i++)
		{
			//obtinerea valorilor componente pentru obiectul curent
			String denumireArbore = arbori.get(i).getDenumire();
			String genArbore = arbori.get(i).getGen();
			int inaltimeArbore = arbori.get(i).getInaltime();
			int varstaArbore = arbori.get(i).getVarsta();
			String tipFrunzaArbore = arbori.get(i).getTipFrunza();
			
			//crearea sirului de caractere conform cerintei
			String modelArbore = "Tip arbore: " + denumireArbore + ", face parte din clasa " + genArbore + ", are o inaltime de " + inaltimeArbore + " metri la varsta de " + varstaArbore + " ani, iar tipul frunzelor este " + tipFrunzaArbore;
			//scrierea in fisier
			out.write(modelArbore);
			//trecerea la linie noua
			out.newLine();
		}
		
		System.out.println("Verificati rezultatul in 'arbori.txt'");
		//inchiderea fluxului
		out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}    
}
