import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class tema_5 
{
    public static void main(String[] args) 
    {
        try 
        {
            ArrayList<Angajat> angajati = new ArrayList<Angajat>();
            angajati.add(new Angajat("Ionescu","Andrei", 25, "programator Java", 2, 1000));
            angajati.add(new Angajat("Popescu","Florin", 32, "programator Cpp", 10, 2500));
            angajati.add(new Angajat("Ionescu","Andreea", 40, "inginer", 17, 3000));
            angajati.add(new Angajat("Andrei","Claudia", 25, "programator C", 1, 1000));
            angajati.add(new Angajat("Florescu","George", 35, "inginer", 11, 2500));
            angajati.add(new Angajat("Popescu","Alexandra", 50, "inginer", 25, 5000));
            angajati.add(new Angajat("Alexandru","Matei", 28, "programator Java", 4, 1500));
            angajati.add(new Angajat("Ionescu","Cosmin", 28, "programator Java", 2, 1200));
            angajati.add(new Angajat("Constantin","Mihai", 42, "programator C", 20, 3500));
            angajati.add(new Angajat("Ionescu","Cristian", 58, "programator Java", 34, 6000));
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Angajati.txt"));
            for(int i=0;i<angajati.size();i++)
            {
                out.writeObject(angajati.get(i));
            }
            System.out.println("Verificati rezultatul in 'Angazati.txt'");
            out.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }    
}
