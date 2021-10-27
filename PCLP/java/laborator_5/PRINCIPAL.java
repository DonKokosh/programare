import javax.swing.*;


public class PRINCIPAL 
{
    public static void main(String[] args) 
    {
		
		int result = JOptionPane.showConfirmDialog(null,
				   "Sunteti un utilizator deja existent?",
				   "Student Online",
				   JOptionPane.YES_NO_OPTION);

		if(result!=0)
		{
			buton buton = new buton();	
			buton.setVisible(true);
		}
		else
		{
			fda fda = new fda();
			fda.setVisible(true);
		}		
	}    
}
