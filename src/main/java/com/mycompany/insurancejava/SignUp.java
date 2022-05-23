package com.mycompany.insurancejava;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SignUp extends JFrame implements ActionListener, KeyListener {

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
     * Gettery & Settery
     */

    public void setCancel(JButton cancel) {
        this.cancel = cancel;
    }

    public JButton getCancel() {
        return cancel;
    }

    public JButton getSignin() {
        return signup;
    }

    public void setSignin(JButton signin) {
        this.signup = signin;
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

    public JTextField getPasswordText() {
        return passwordText;
    }

    public JTextField getRe_passwordText() {
        return re_passwordText;
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
        setDefaultCloseOperation(EXIT_ON_CLOSE);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        //potrzebne implementacja bazy danych i przeszukanie bazy
        if (e.getSource() == signup) {

            if (bazaDanych.szukajKLientow(loginText.getText())) {
                JOptionPane.showMessageDialog(null, "User name already exist", "Sign-Up Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!passwordText.getText().equals(re_passwordText.getText())) {
                JOptionPane.showMessageDialog(null, "Passwords DO NOT MATCH!!!\nPlease try again ", "Sign-Up Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                bazaDanych.listaKlientow.add(new User(loginText.getText(), passwordText.getText()));
                JOptionPane.showMessageDialog(this, "Successful Sign-Up\n Please login now", "Sign-Up Error", JOptionPane.INFORMATION_MESSAGE);
                bazaDanych.WypiszLIsteUzytkownikow();
                dispose();
            }
        }
        if (e.getSource() == cancel) {
            //poprawic by tylko z okna wychodzil
            // dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
            dispose();
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
