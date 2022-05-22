
package com.mycompany.insurancejava;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Login 
{
    private JTextField loginLabel;
    private JTextField passwordText;
    private BazaDanych baza;
    //setters & getters 

    public JTextField getLogowanieLabel() {
        return loginLabel;
    }
  
    public Login(JTextField loginText, BazaDanych baza){
        this.baza=baza;
        this.loginLabel = loginText;
        this.passwordText = passwordText;
        
String userName, password;
    
if(loginLabel.getText().equals("ON-LINE"))
{
JOptionPane.showMessageDialog(null, "You are logged in already\n Loggout first in case login using different account", "Login",JOptionPane.ERROR_MESSAGE);
    System.exit(0); 

}


 for( int i =1; i<=3;i++){
     baza.WypiszLIsteUzytkownikow();
    userName = JOptionPane.showInputDialog("Enter login");
    password = JOptionPane.showInputDialog("Enter password");
    if (baza.szukajHasla(userName,password))
    {
        System.out.println("correct");
        JOptionPane.showMessageDialog(null, "Successful", "Login",JOptionPane.INFORMATION_MESSAGE);
        loginText.setText("ON-LINE");
        loginText.setBackground(Color.green);
        loginText.setForeground(Color.BLACK);

        break;
    }
    else if(i==1)
    {  
    JOptionPane.showMessageDialog(null, "Invalid username or password", "Login",JOptionPane.WARNING_MESSAGE);
    System.out.println("incorrect 0");    
    }
    else if(i==2)
    {
    JOptionPane.showMessageDialog(null, "Try again, That is your last chance", "Login",JOptionPane.WARNING_MESSAGE);
    System.out.println("incorrect 1"); 
    }
    else
    {
    JOptionPane.showMessageDialog(null, "Sorry that was your last chance try again later", "Login",JOptionPane.ERROR_MESSAGE);
    System.exit(0); 
    }
        
    }
    }
}

