
package com.mycompany.insurancejava;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 * Klasa zawiera informacje o ostatecznej quote dla insurance
 * 
 */
public class InsuranceQuote extends JFrame implements ActionListener, KeyListener {
    

    private JLabel annualPremiumLabel;
    private JLabel monthlyPremiumLabel;
    private JTextField annualPremiumTekstowe;
    private JPasswordField monthlyPremiumTekstowe;
    private JButton ok;
    
    
    private JTextField status;
    private DataBase baza;
    private Font font = new Font("Helvetica", Font.ITALIC, 15);

    //setters & getters 
    
    public InsuranceQuote(){//(JTextField status, DataBase baza) {

        super("Insurance Quote");
        this.baza = baza;
        this.status=status;
        setSize(600, 200);
        init();
        setContentPane(UstawLayoutElementy());
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void init() {
        annualPremiumLabel = new JLabel("Annual Premium");
        annualPremiumLabel.setFont(font);
        monthlyPremiumLabel = new JLabel("Montly Premium");
        monthlyPremiumLabel.setFont(font);
        
        annualPremiumTekstowe = new JTextField("");
        annualPremiumTekstowe.setFont(font);
        
        monthlyPremiumTekstowe = new JPasswordField(10);
        monthlyPremiumTekstowe.setFont(font);
        ok = new JButton("OK");
        ok.setFont(font);
    }

    public JPanel UstawLayoutElementy() {
        JPanel jpanel = new JPanel();
        jpanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JPanel border = new JPanel(new BorderLayout());

        border.add(new JLabel(""), BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(2, 2));

        grid.add(annualPremiumLabel);
        grid.add(new JLabel("", 10));
        grid.add(annualPremiumTekstowe);
        annualPremiumTekstowe.addActionListener(this);
        grid.add(monthlyPremiumLabel);
        grid.add(new JLabel("", 10));
        grid.add(monthlyPremiumTekstowe);
        monthlyPremiumTekstowe.addActionListener(this);

        border.add(grid, BorderLayout.CENTER);

        JPanel footer = new JPanel();
        footer.add(ok);
        ok.addActionListener(this);

        border.add(footer, BorderLayout.SOUTH);

        jpanel.add(border);

        return jpanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
    dispose();
}
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}


