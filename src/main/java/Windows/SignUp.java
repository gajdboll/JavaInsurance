package Windows;

import DataBase.DataBase;
import com.mycompany.insurancejava.User;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
/**
 * Okno rejestracji do programu klienckiego.
 * @author Bartosz Wasko i Krzysztof Gajdosz
 */
public class SignUp extends JFrame implements ActionListener{

    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JLabel re_passwordLabel;
    private JTextField loginText;
    private JPasswordField passwordText;
    private JPasswordField re_passwordText;
    private JButton signup;
    private JButton cancel;

    private Font font = new Font("Helvetica", Font.ITALIC, 15);
    private DataBase bazaDanych;

    /**
     * Gettery i Settery
     */
    public DataBase getBazaDanych() {
        return bazaDanych;
    }

    public JLabel getLoginLabel() {

        return loginLabel;

    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public JLabel getRe_passwordLabel() {
        return re_passwordLabel;
    }

    public JTextField getLoginText() {
        return loginText;
    }

    public JPasswordField getPasswordText() {
        return passwordText;
    }

    public JPasswordField getRe_passwordText() {
        return re_passwordText;
    }

    public JButton getSignup() {
        return signup;
    }

    public JButton getCancel() {
        return cancel;
    }

    public Font getFont() {
        return font;
    }

    public void setLoginLabel(JLabel loginLabel) {
        this.loginLabel = loginLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public void setRe_passwordLabel(JLabel re_passwordLabel) {
        this.re_passwordLabel = re_passwordLabel;
    }

    public void setLoginText(JTextField loginText) {
        this.loginText = loginText;
    }

    public void setPasswordText(JPasswordField passwordText) {
        this.passwordText = passwordText;
    }

    public void setRe_passwordText(JPasswordField re_passwordText) {
        this.re_passwordText = re_passwordText;
    }

    public void setSignup(JButton signup) {
        this.signup = signup;
    }

    public void setCancel(JButton cancel) {
        this.cancel = cancel;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setBazaDanych(DataBase bazaDanych) {
        this.bazaDanych = bazaDanych;
    }

    /**
     * Konstruktor
     */
    public SignUp(DataBase bazaDanych) {
        super("Sign UP Window");
        this.bazaDanych = bazaDanych;
        setSize(600, 200);
        init();
        setContentPane(UstawLayoutElementy());
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * Inicjalizacja elementow
     */
    public void init() {
        loginLabel = new JLabel("Login/Username");
        loginLabel.setFont(font);
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(font);
        re_passwordLabel = new JLabel("Re-enter Password");
        re_passwordLabel.setFont(font);
        loginText = new JTextField("");
        loginText.setFont(font);
        passwordText = new JPasswordField(10);
        passwordText.setEchoChar('*');
        passwordText.setFont(font);
        re_passwordText = new JPasswordField(10);
        re_passwordText.setEchoChar('*');
        re_passwordText.setFont(font);
        signup = new JButton("Sign-Up");
        signup.setFont(font);
        cancel = new JButton("Cancel");
        cancel.setFont(font);
    }

    /**
     * Ustawienie layoutu
     */
    public JPanel UstawLayoutElementy() {
        JPanel jpanel = new JPanel();
        jpanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        JPanel border = new JPanel(new BorderLayout());
        border.add(new JLabel(""), BorderLayout.NORTH);
        JPanel grid = new JPanel(new GridLayout(3, 3));
        grid.add(loginLabel);
        grid.add(new JLabel("", 10));
        grid.add(loginText);
        loginText.addActionListener(this);
        grid.add(passwordLabel);
        grid.add(new JLabel("", 10));
        grid.add(passwordText);
        passwordText.addActionListener(this);
        grid.add(re_passwordLabel);
        grid.add(new JLabel("", 10));
        grid.add(re_passwordText);
        re_passwordText.addActionListener(this);
        border.add(grid, BorderLayout.CENTER);
        JPanel footer = new JPanel();
        footer.add(signup);
        signup.addActionListener(this);
        footer.add(cancel);
        cancel.addActionListener(this);
        border.add(footer, BorderLayout.SOUTH);
        jpanel.add(border);
        return jpanel;
    }
    /**
     * Listener do mini okna rejestracji 
     * @param e przyjmuje ActionEvent i wywoluje akcje
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signup) {

            if (bazaDanych.szukajKLientow(loginText.getText())) {
                JOptionPane.showMessageDialog(null, "User name already exist", "Sign-Up Warning", JOptionPane.WARNING_MESSAGE);
            } else if (loginText.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Login field cannot be empty!!!\nPlease try again ", "Sign-Up Warning", JOptionPane.WARNING_MESSAGE);
            } else if (passwordText.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Passwords cannot be empty!!!\nPlease try again ", "Sign-Up Warning", JOptionPane.WARNING_MESSAGE);
            } else if (re_passwordText.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Repeat Passwords field cannot be empty!!!\nPlease try again ", "Sign-Up Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!passwordText.getText().equals(re_passwordText.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords DO NOT MATCH!!!\nPlease try again ", "Sign-Up Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                bazaDanych.getListaKlientow().add(new User(loginText.getText(), passwordText.getText()));
                JOptionPane.showMessageDialog(this, "Successful Sign-Up\n Please login now", "Sign-Up Error", JOptionPane.INFORMATION_MESSAGE);
                bazaDanych.WypiszLIsteUzytkownikow();
                dispose();
            }
        }
        if (e.getSource() == cancel) 
        {
            dispose();
        }
    }
}
    

