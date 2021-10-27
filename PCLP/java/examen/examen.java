import java.util.Scanner;

public class examen 
{
    public static void main(String[] args) 
    {
        int l, L, s, c, ct;

        boolean da, nu;
        da = true;
        nu = false;
        
        Scanner t = new Scanner(System.in);
        
        System.out.println("\nIntroduceti latime etichetei (in mm): ");
        L = t.nextInt();
        
        System.out.println("\nIntroduceti lungimea etichetei (in mm): ");
        l = t.nextInt();
        
        s = l * L;
        
        
        try    
        {
            System.out.println("\nMai incercati?");
            if (da) 
            {
                System.out.println("\nIntroduceti latime etichetei (in mm): ");
                L = t.nextInt();
                
                System.out.println("\nIntroduceti lungimea etichetei (in mm): ");
                l = t.nextInt();   
            }
            else if (nu) 
            {
                return ;     
            }
        } catch (Exception e) 
        {
            
            
            return;
        }
        
        System.out.println("introduceti cantitatea de addeziv necesara unui cm^2 = ");
        c = t.nextInt();
        ct = c;
        System.out.println("Suprafata este egala cu : " + s);
        System.out.println("cantitatea de adeziv este = " + ct);



    }
}
