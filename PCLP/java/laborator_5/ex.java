public class ex 
{
    private static void metoda_care_arunca_exceptii() throws Exeception
    {
        String str = "laborator pclp";
        System.out.println(str.charAt(100));    
    }
    public static void main(String[] args) 
    {
        
        try 
        {
            int a = 13;
            System.out.println(a/0);
            
            double vector [] = new double [27];
            System.out.println(vector[27]);
        }
        catch (ArithmeticException e) 
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("coie ai facut o eroare");
        
       
            
    }
}
