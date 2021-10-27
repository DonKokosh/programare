import javax.swing.JOptionPane;

public class gui 
{
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null, "salut coilor", "coilor", JOptionPane.PLAIN_MESSAGE);

        int x = JOptionPane.showConfirmDialog(null, "continui??", "coi", JOptionPane.YES_NO_CANCEL_OPTION);

        if (x == 0) 
        {
            JOptionPane.showMessageDialog(null, "valea!!", "n-ai ce cauta", JOptionPane.PLAIN_MESSAGE);    
        }
        else
        {
            //System.out.println("serios?!!?");
            JOptionPane.showMessageDialog(null, "serios?!?!", "esti bulangiu", JOptionPane.PLAIN_MESSAGE);
        }

        
    }    
}
