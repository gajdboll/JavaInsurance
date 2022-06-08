package Windows;

import DataBase.DataBase;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Login extends JFrame implements ActionListener, KeyListener {

    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JTextField loginText;
    private JPasswordField passwordText;
    private JButton login;
    private JButton cancel;

    private JTextField status;
    private DataBase baza;
    private Font font = new Font("Helvetica", Font.ITALIC, 15);

    private int i;
    //setters & getters 
    public JLabel getLoginLabel() {
        return loginLabel;
    }

    public JTextField getStatus() {
        return status;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public JTextField getLoginText() {
        return loginText;
    }

    public JPasswordField getPasswordText() {
        return passwordText;
    }

    public JButton getLogin() {
        return login;
    }

    public JButton getCancel() {
        return cancel;
    }

    public void setLoginLabel(JLabel loginLabel) {
        this.loginLabel = loginLabel;
    }

    public void setStatus(JTextField status) {
        this.status = status;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public void setLoginText(JTextField loginText) {
        this.loginText = loginText;
    }

    public void setPasswordText(JPasswordField passwordText) {
        this.passwordText = passwordText;
    }

    public void setLogin(JButton login) {
        this.login = login;
    }

    public void setCancel(JButton cancel) {
        this.cancel = cancel;
    }

    public Login(JTextField status, DataBase baza) {

        super("Login Window");
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
        loginLabel = new JLabel("Login/Username");
        loginLabel.setFont(font);
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(font);
        loginText = new JTextField("");
        loginText.setFont(font);
        passwordText = new JPasswordField(10);
        passwordText.setEchoChar('*');
        passwordText.setFont(font);
        login = new JButton("Login");
        login.setFont(font);
        cancel = new JButton("Cancel");
        cancel.setFont(font);
    }

    public JPanel UstawLayoutElementy() {
        JPanel jpanel = new JPanel();
        jpanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JPanel border = new JPanel(new BorderLayout());

        border.add(new JLabel(""), BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(2, 2));

        grid.add(loginLabel);
        grid.add(new JLabel("", 10));
        grid.add(loginText);
        loginText.addActionListener(this);
        grid.add(passwordLabel);
        grid.add(new JLabel("", 10));
        grid.add(passwordText);
        passwordText.addActionListener(this);

        border.add(grid, BorderLayout.CENTER);

        JPanel footer = new JPanel();
        footer.add(login);
        login.addActionListener(this);
        footer.add(cancel);
        cancel.addActionListener(this);

        border.add(footer, BorderLayout.SOUTH);

        jpanel.add(border);

        return jpanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (status.getText().equals("ON-LINE")) {
            JOptionPane.showMessageDialog(null, "You are logged in already\n Loggout first in case login using different account", "Login", JOptionPane.ERROR_MESSAGE);
              dispose();
              return ;
                

        }

 
            if (baza.szukajHasla(loginText.getText(), passwordText.getText())) {
                System.out.println("correct");
                JOptionPane.showMessageDialog(null, "Successful", "Login", JOptionPane.INFORMATION_MESSAGE);
                status.setText("ON-LINE");
                status.setBackground(Color.green);
                status.setForeground(Color.BLACK);
                dispose();
             
            } else  {
                
                JOptionPane.showMessageDialog(null, "Invalid username or password\nTry again!!!", "Login", JOptionPane.WARNING_MESSAGE);
                System.out.println("incorrect try"+i);
               
            }

    
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
