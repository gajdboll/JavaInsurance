package com.mycompany.insurancejava;

import javax.swing.*;



public class MenuDesign 
{
    // konstruktor
    public MenuDesign(){}
    //ikony
        Icon r1 = new ImageIcon("save.png");
     //tworzenie menu gornego
    public void tworzenieMenu(){
     //tworzę listwę menu
        JMenuBar mBar = new JMenuBar();
        
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Options");
        JMenu m3 = new JMenu("About");
        // konstrukcja pierwszej głównej pozycji menu
        m1.add(new JMenuItem("New") );
        m1.addSeparator();
        m1.add(new JMenuItem("Open") );
        m1.addSeparator();        
        //a tu dam nowe podmenu
        JMenu podmenu = new JMenu("Save");
        //dodaję elementy do podmenu
        podmenu.add(new JMenuItem("Save Now", r1) );
        podmenu.add(new JMenuItem("Save As...") );
        //dodaje podmenu do menu
        m1.add(podmenu);

        m2.add(new JRadioButtonMenuItem("Login") );
        m2.addSeparator();
        m2.add(new JRadioButtonMenuItem("Sign In") );
        
        mBar.add(m1);
        mBar.add(m2);
        mBar.add(m3);
        setJMenuBar(mBar);
}
}
