import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class ClasaPrincipala {
	static double valoaree=0;
	public static void adaugare_planeta(ArrayList<Planeta> lista,ArrayList<String> list2){
		Scanner scrie = new Scanner(System.in);
		String nouaPlaneta;
		boolean lock;
		do {
			lock =false;
			nouaPlaneta="";
			System.out.println("Introduceti numele planetei");
			String nume_planeta = scrie.nextLine(); 
			nume_planeta= nume_planeta.toLowerCase();
	     
			for(int i=0; i<nume_planeta.length(); i++) { 
				char litera = nume_planeta.charAt(i); 
				if(litera!=' ') {
					nouaPlaneta +=nume_planeta.substring(i,i+1);	
				}
				for(int j=0; j<list2.size(); j++) {
					if(nouaPlaneta.equals(list2.get(j))) {
						System.out.println("Planeta este deja introdusa");
						lock=true;
					}	
				}		
			}
		}while(lock);
		list2.add(nouaPlaneta);
		System.out.println("Introduceti X");
		double x = scrie.nextDouble();
		System.out.println("Introduceti Y");
		double y = scrie.nextDouble();
		System.out.println("Introduceti Z");
		double z = scrie.nextDouble();
		Planeta a = new Planeta(nouaPlaneta,x,y,z); 
		lista.add(a);
	}
	public static void stergere_planeta(ArrayList<Planeta> lista) {  
		Scanner scrie = new Scanner(System.in);
		System.out.println("Introduceti  planeta care sa fie stersa");
		String planeta = scrie.nextLine();
		planeta =planeta.toLowerCase();
		String nouaPlaneta="";
		
		for(int i=0; i<planeta.length(); i++) {
			char litera = planeta.charAt(i);
			if(litera!=' ') {
				nouaPlaneta +=planeta.substring(i,i+1);	
			}	
		}
		int index  =-1; 
		for(int i=0; i<lista.size(); i++) { 
			if(lista.get(i).nume_Planeta.equals(nouaPlaneta)) {
				index = i;
			}
		}
		if(index>=0) { 
			lista.remove(index);
		}
		else {
			System.out.println("Planeta nu se afla ");
		}		
	}
	public static void drum(ArrayList<Planeta> lista,ArrayList<String> list2) { 
		Scanner t = new Scanner(System.in);
		
		ArrayList<String> cv;
	
		boolean lock;
		do {
			int a=0;
			cv= new ArrayList<String>();
			lock=true;
			System.out.println("Introduceti itinerariu: ");
			String drum= t.nextLine();
			String p ="";
			drum = drum.toLowerCase();
			int start=0;
			for(String  s: drum.split(",")) {
				cv.add(s);
			}
			
	
			/*
			for(int i=0; i<drum.length(); i++)
			{
				if(drum.charAt(i)==',')
				{
					 p = drum.substring(start,i);
					start=i+1;
					cv.add(p);
				}
				if(i==drum.length()-1)
				{
					p = drum.substring(start,i+1);
					start=i+1;
					cv.add(p);
				}
				}
				*/
			for(int i=0; i<cv.size(); i++) {
				for(int j=0; j<list2.size(); j++) {
					if(cv.get(i).equals(list2.get(j))) {
						a++;
						
					}
					
					
				}
			}
			if(a==cv.size()) {
				lock=false;
			}
			else {
				System.out.println("Ne pare rau, dar drumul specificat, nu se poate realiza(planeta inexistenta)");
			}
				
			
			
		}while(lock);
		
		int v[] = new int[cv.size()];
		
		for(int i=0; i<cv.size(); i++) {
			for(int j=0; j<lista.size(); j++) {
				if(cv.get(i).equals(lista.get(j).nume_Planeta)) {
					v[i]=j;	
				}
			}	
		}
		double dis=0;
		for(int i=0; i<v.length-1; i++) {
			dis+=Math.abs(lista.get(v[i]).coordonate_Planeta_X - lista.get(v[i+1]).coordonate_Planeta_X) + Math.abs(lista.get(i).coordonate_Planeta_Y - lista.get(v[i+1]).coordonate_Planeta_Y) + Math.abs(lista.get(v[i]).coordonate_Planeta_Z - lista.get(v[i+1]).coordonate_Planeta_Z);
		}
		valoaree = dis;
		}
	public static void afisaretimpNecesar() {
		System.out.println("sa vedem  " + valoaree);
		double aux=valoaree;
		aux=aux*365.25*1.07*Math.pow(10, 9);  //transformarea 299792458 m/s in km/h//iti fac video 
		aux=aux/40000;
		System.out.println("Timpul necesar parcurgerii drumului introdus este: " +aux+" zile");
	}
	
	public static void parseci(ArrayList<Planeta> lista) throws IOException { // Am creiat o functie 
	    double par=0;// variabila asta este folosita pentru a stoca distanta, si dupa impart la parseci astia 
			BufferedWriter scriere = new BufferedWriter(new FileWriter("Fisier.txt")); // am folsit Buffer, pentru a baga in fisier 
		for(int i=0; i<lista.size(); i++) {
			for (int j=i+1; j<lista.size(); j++) {
				par = Math.sqrt(Math.pow(lista.get(j).coordonate_Planeta_X-lista.get(i).coordonate_Planeta_X, 2)+Math.pow(lista.get(j).coordonate_Planeta_Y-lista.get(i).coordonate_Planeta_Y, 2)+Math.pow(lista.get(j).coordonate_Planeta_Z-lista.get(i).coordonate_Planeta_Z, 2));
				par=(par*365.25*24*1.07*Math.pow(10, 9));
				System.out.print(lista.get(i).nume_Planeta + "->");
				System.out.print(lista.get(j).nume_Planeta + "=");
				System.out.print(par/3.26 + " pc");
				System.out.println();
				scriere.write(lista.get(i).nume_Planeta + "->" + lista.get(j).nume_Planeta + "=" + par/3.26 + " pc" );
				scriere.newLine();
			
			}
			
		}
		scriere.close();
		
		
		
	}

	public static void main(String[] args) {
		Scanner scrie = new Scanner(System.in);
		boolean lock = true;
		ArrayList <String> vPlaneta = new ArrayList<String>();
		ArrayList<Planeta> lista = new ArrayList<Planeta>(); 
		String decizie;
		do {
			System.out.println("-------Meniu------------\n"
					            + "Bun venit la meniul de navigare\n"
					            + "Aveti uramtoarele optiuni\n"
					            + "a.Pentru adaugare planeta\n"
					            + "b.Pentru eliminare planeta\n"
					            + "c.Pentru a introduce itinerariu\n"
					            + "d.Pentru afisare\n"
					            + "e.Pentru iesire din aplicatie\n"
					            + "f. Pentru bagare in fisier distanta in parseci"
					            + "-------Sfarsit--------------");
			decizie  =scrie.nextLine();
			switch(decizie) {
			case "a":
				adaugare_planeta(lista,vPlaneta);
				break;
			case "b":
				stergere_planeta(lista);
				break;
			case "c":
				drum(lista,vPlaneta);
				break;
			case "d" :
				afisaretimpNecesar();
				break;
			case "e":
				System.out.println("Program inchis, la revedere");
				lock=false;
				break;
			case "f":
				try {
					parseci(lista);
				} catch (IOException e) {
					
					System.out.println("Eroare " + e);
				}
				break;
				default :
					System.out.println("Date invalide, va rugam, incercati din nou");
			}
			
		}while(lock);
	}
}