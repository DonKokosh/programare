import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;


public class fda extends JFrame
{
    JPanel continut_panel;
	
	JLabel titlu;
	
	FereastraDa()
    {
		setTitle("Studenti");
		setSize(550,450);
		
		initializare_elemente();
	}
	
	private void initializare_elemente()
	{
		continut_panel = (JPanel) getContentPane();
		continut_panel.setLayout(null);
		
		titlu = new JLabel();
		titlu.setText("Tabel nominal cu studentii");
		titlu.setForeground(Color.red);
		titlu.setBounds(70,15,350,50);
		titlu.setFont(new Font("SansSerif",Font.BOLD,25));
		
		citesteDinFisier();
		
		continut_panel.add(titlu);
		
		this.addWindowListener
        (
            new java.awt.event.WindowAdapter() 
            {
		        @Override
		        public void windowClosing(java.awt.event.WindowEvent windowEvent) 
                {
		            System.out.println("La revedere!"); 
		        	System.exit(0);
		        }
		    }
        );
	}
	
	private void citesteDinFisier()
	{
		try
        {
			BufferedReader buff = new BufferedReader(new FileReader("Studenti.txt"));
			int p2 = 70;
			String linie;
			while((linie=buff.readLine())!=null)
			{
				JLabel continut = new JLabel();
				continut.setForeground(Color.blue);
				continut.setFont(new Font("SansSerif",Font.ITALIC,16));
				continut.setBounds(50,p2,450,20);
				
				continut.setText(linie);
				
				continut_panel.add(continut);
				
				p2 += 20;
			}
		
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, 
					  "A aparut o eroare\n"+e,
					  "Eroare",
					  JOptionPane.PLAIN_MESSAGE);
		}
	}    
}
