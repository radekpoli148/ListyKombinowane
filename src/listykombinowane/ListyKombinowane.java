/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listykombinowane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListyKombinowane extends JFrame{

    public ListyKombinowane()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Listy kombinowane");
        this.setBounds(300, 320, 400, 200);
        
        kombinacja.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //kombinacja.getSelectedItem();
                colorHandler handler = (colorHandler)((JComboBox)e.getSource()).getSelectedItem();
                
                ((JComboBox)e.getSource()).setBackground(handler.getColor());
            }
        });
        panel.add(kombinacja);
        
        kombinacja.addItem(new colorHandler(Color.BLACK, "Czarny"));
        kombinacja.addItem(new colorHandler(Color.GREEN, "Zielony"));
        kombinacja.addItem(new colorHandler(Color.BLUE, "Niebieski"));
        kombinacja.addItem(new colorHandler(Color.YELLOW, "Żolty"));
        
        this.getContentPane().add(panel);
        this.setDefaultCloseOperation(3);
    }
    
    private class colorHandler
    {
        public colorHandler(Color kolor, String colorName)
        {
            this.kolor=kolor;
            this.colorName = colorName;
        }
        @Override
        public String toString()
        {
            return this.colorName;
        }
        public Color getColor()
        {
            return this.kolor;
        }
        private Color kolor;
        private String colorName;
    }
    
    private JPanel panel = new JPanel();
    JComboBox kombinacja =new JComboBox();
    
    public static void main(String[] args) {
        new ListyKombinowane().setVisible(true);
    }
    
}
