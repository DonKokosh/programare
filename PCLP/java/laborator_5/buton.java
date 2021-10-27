import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class buton extends JFrame
{
    JPanel continut;
    JLabel nume_eticheta = new JLabel();
    JLabel facultate_eticheta = new JLabel();
    JLabel specializare_eticheta = new JLabel();
    JLabel an_eticheta = new JLabel();

    JTextField nume = new JTextField();
    JTextField facultate = new JTextField();
    JTextField specializare = new JTextField();
    JTextField an = new JTextField();

    JButton adauga = new JButton();

    public fereastra_nu()
    {
        setTitle("student nou");
        setSize(600, 600);

        continut = (JPanel) getContentPane();
        continut.setLayout(null);

        nume_eticheta.setBounds(20, 50, 250, 30);
        nume_eticheta.setText("numele si prenumele");
        nume_eticheta.setForeground(Color.GREEN);
        
        facultate_eticheta.setBounds(20, 100, 250, 30);
        facultate_eticheta.setText("numele faultati: ");
        
        specializare_eticheta.setBounds(20, 150, 250, 30);
        specializare_eticheta.setText("specializare:");

        an_eticheta.setBounds(20, 200, 250, 30);
        an_eticheta.setText("anul de studii:");

        nume.setBounds(300, 50, 200, 30);
        nume.setFont(new Font("TimesNewRoman", Font.ITALIC, 14));
        nume.setBackground(Color.CYAN);

        facultate.setBounds(300, 100, 200, 30);
        facultate.setFont(new Font("TimesNewRoman", Font.ITALIC, 14));
        facultate.setBackground(Color.CYAN);

        specializare.setBounds(300, 150, 200, 30);
        specializare.setFont(new Font("TimesNewRoman", Font.ITALIC, 14));
        specializare.setBackground(Color.CYAN);

        an.setBounds(300, 200, 200, 30);
        an.setFont(new Font("TimesNewRoman", Font.ITALIC, 14));
        an.setBackground(Color.CYAN);

        adauga.setBounds(275, 300, 100, 20);
        adauga.setText("adauga student");
        adauga.addActionListener(new java.awt.event.ActionListener()
            {
                public void action_performed() 
                {
                    try 
                    {
                        BufferedWriter t = new BufferedWriter
                        (
                            new FileWriter("student.txt", true)
                        );

                        t.write(nume.getText() + ", " + facultate.getText() + ", " + specializare.getText() + ", " + an.getText());
                        t.newLine();
                        t.close();
                    } 
                    catch (Exception ex) 
                    {
                        System.out.println(ex);
                        continut.add(an_eticheta);
                        continut.add(nume);
                        continut.add(facultate);
                        continut.add(specializare);
                        continut.add(an);
                        continut.add(adauga);    
                    }}});
        
        continut.add(nume_eticheta);
        continut.add(facultate_eticheta);
        continut.add(specializare_eticheta);
        continut.add(an_eticheta);
        continut.add(nume);
        continut.add(facultate);
        continut.add(specializare);
        continut.add(an);
        continut.add(adauga);
    }

}
