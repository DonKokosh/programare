import java.util.ArrayList;
import java.util.Collections;

public class ex_3 {

	public static void main(String[] args) 
    {
		

		
		ArrayList<dreptunghi> dreptunghiuri = new ArrayList<dreptunghi>();
		ArrayList<patrat> patrate = new ArrayList<patrat>();

		
		dreptunghiuri.add(new dreptunghi(2.5,10));
		dreptunghiuri.add(new dreptunghi(5.5,6));
		dreptunghiuri.add(new dreptunghi(2.5,15));
		dreptunghiuri.add(new dreptunghi(1.5,2));
		
		
		patrate.add(new patrat(2.5));
		patrate.add(new patrat(5.5));
		patrate.add(new patrat(15));
		patrate.add(new patrat(1.5));
		
		
		dreptunghiuri.sort(new dreptunghi());
		
		Collections.sort(patrate);
	
		
		System.out.println(dreptunghiuri.toString());
		
		System.out.println(patrate.toString());
	}

}