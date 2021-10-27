import java.util.Arrays;
import java.util.Scanner;

public class ex_2 
{
    public static void main(String[] args) 
    {
		
		
		
		int tablou[] = new int[5];
		Arrays.fill(tablou, 1);
		
		String str = "laboratorul_5";
		
		Scanner t = new Scanner(System.in);
		
		try 
        {	
			
			System.out.println("Introduceti un sir de caractere");
			str = t.nextLine();
			
			
			for(int i=0;i<tablou.length;i++)
			{
				System.out.print("tablou["+i+"]=");
				tablou[i] = t.nextInt();
			}	
		}
		catch(Exception e)
		{
			
			System.out.print("Eroare:");
			System.out.println(e);
		}
		
		finally {
			System.out.println(str);
			
			for(int i=0;i<tablou.length;i++)
			{
				System.out.print(tablou[i]+"\t");
			}
		
		}
	}    
}
