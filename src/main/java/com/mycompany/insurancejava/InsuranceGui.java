package com.mycompany.insurancejava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

 
public class InsuranceGui extends JFrame implements ActionListener
{
// pola (buttony fieldy etc.) znajdujace sie na interfacie
    private JLabel projectTitle;//
    private JTextField [] polaTekstowe;
    private JButton saveQuote;//
    private JButton calculatePremiun;//
    private JButton printQuote;//
    private JLabel customerNameJLabel;
    private JLabel addressJLabel;
    private JLabel emptyLabel1;
    private JLabel emptyLabel2;
    private JLabel registrationNumberJLabel; 
    private JLabel valuationJLabel;
    private JLabel estimatedValuedMilageJLabel;
    private JLabel claimInLast5YearsJLabel;
    private JLabel postCodeJLabel;
    private JLabel telNoJLabel;
    private JLabel dobJLabel;
    private JLabel coverTypeJLabel;
    private JLabel makeAndModelJLabel;
    private JLabel yearFirstRegisteredJLabel;
    private JLabel engineCCJLabel;
<<<<<<< HEAD
    private JLabel annualPremiumLabel;
    private JLabel monthlyPremiumLabel;
    private JTextField annualPremiumTekstowe;
    private JTextField monthlyPremiumTekstowe;
=======
    
>>>>>>> fb7ac389b4ff062ffdae74a43c3668eefa95df64
//getters & setters

    public void setAnualPremiumLabel(JLabel anualPremiumLabel) {
        this.annualPremiumLabel = anualPremiumLabel;
    }

    public void setMonthlyPremiumLabel(JLabel monthlyPremiumLabel) {
        this.monthlyPremiumLabel = monthlyPremiumLabel;
    }

    public void setAnualPremiumTekstowe(JTextField anualPremiumTekstowe) {
        this.annualPremiumTekstowe = anualPremiumTekstowe;
    }

    public void setMonthlyPremiumTekstowe(JTextField monthlyPremiumTekstowe) {
        this.monthlyPremiumTekstowe = monthlyPremiumTekstowe;
    }

    public JLabel getAnualPremiumLabel() {
        return annualPremiumLabel;
    }

    public JLabel getMonthlyPremiumLabel() {
        return monthlyPremiumLabel;
    }

    public JTextField getAnualPremiumTekstowe() {
        return annualPremiumTekstowe;
    }

    public JTextField getMonthlyPremiumTekstowe() {
        return monthlyPremiumTekstowe;
    }

    public JLabel getProjectTitle() {
        return projectTitle;
    }
    public JTextField[] getPolaTekstowe() {
        return polaTekstowe;
    }
    public JButton getSaveQuote() {
        return saveQuote;
    }

    public JButton getCalculatePremiun() {
        return calculatePremiun;
    }

    public JButton getPrintQuote() {
        return printQuote;
    }

    public JLabel getCustomerNnameJLabel() {
        return customerNameJLabel;
    }

    public JLabel getAddressJLabel() {
        return addressJLabel;
    }
    
    public JLabel getEmptyLabel1() {
        return emptyLabel1;
    }

    public JLabel getEmptyLabel2() {
        return emptyLabel2;
    }

    public JLabel getRegistrationNumberJLabel() {
        return registrationNumberJLabel;
    }

    public JLabel getValuationJLabel() {
        return valuationJLabel;
    }

    public JLabel getEstimatedValuedMilageJLabel() {
        return estimatedValuedMilageJLabel;
    }

    public JLabel getClaimInLast5YearsJLabel() {
        return claimInLast5YearsJLabel;
    }

    public JLabel getPostCodeJLabel() {
        return postCodeJLabel;
    }

    public JLabel getTelNoJLabel() {
        return telNoJLabel;
    }

    public JLabel getDobJLabel() {
        return dobJLabel;
    }

    public JLabel getCoverTypeJLabel() {
        return coverTypeJLabel;
    }

    public JLabel getMakeAndModelJLabel() {
        return makeAndModelJLabel;
    }

    public JLabel getYearFirstRegisteredJLabel() {
        return yearFirstRegisteredJLabel;
    }

    public JLabel getEngineCCJLabel() {
        return engineCCJLabel;
    }
//setters

    public void setProjectTitle(JLabel projectTitle) {
        this.projectTitle = projectTitle;
    }
        public void setPolaTekstowe(JTextField[] polaTekstowe) {
        this.polaTekstowe = polaTekstowe;
    }

    public void setSaveQuote(JButton saveQuote) {
        this.saveQuote = saveQuote;
    }

    public void setCalculatePremiun(JButton calculatePremiun) {
        this.calculatePremiun = calculatePremiun;
    }

    public void setPrintQuote(JButton printQuote) {
        this.printQuote = printQuote;
    }

    public void setCustomerNnameJLabel(JLabel customerNnameJLabel) {
        this.customerNameJLabel = customerNnameJLabel;
    }

    public void setAddressJLabel(JLabel addressJLabel) {
        this.addressJLabel = addressJLabel;
    }

    public void setEmptyLabel1(JLabel emptyLabel1) {
        this.emptyLabel1 = emptyLabel1;
    }
    public void setEmptyLabel2(JLabel emptyLabel2) {
        this.emptyLabel2 = emptyLabel2;
    }
    
    public void setRegistrationNumberJLabel(JLabel registrationNumberJLabel) {
        this.registrationNumberJLabel = registrationNumberJLabel;
    }

    public void setValuationJLabel(JLabel valuationJLabel) {
        this.valuationJLabel = valuationJLabel;
    }

    public void setEstimatedValuedMilageJLabel(JLabel estimatedValuedMilageJLabel) {
        this.estimatedValuedMilageJLabel = estimatedValuedMilageJLabel;
    }

    public void setClaimInLast5YearsJLabel(JLabel claimInLast5YearsJLabel) {
        this.claimInLast5YearsJLabel = claimInLast5YearsJLabel;
    }

    public void setPostCodeJLabel(JLabel postCodeJLabel) {
        this.postCodeJLabel = postCodeJLabel;
    }

    public void setTelNoJLabel(JLabel telNoJLabel) {
        this.telNoJLabel = telNoJLabel;
    }

    public void setDobJLabel(JLabel dobJLabel) {
        this.dobJLabel = dobJLabel;
    }

    public void setCoverTypeJLabel(JLabel coverTypeJLabel) {
        this.coverTypeJLabel = coverTypeJLabel;
    }

    public void setMakeAndModelJLabel(JLabel makeAndModelJLabel) {
        this.makeAndModelJLabel = makeAndModelJLabel;
    }

    public void setYearFirstRegisteredJLabel(JLabel yearFirstRegisteredJLabel) {
        this.yearFirstRegisteredJLabel = yearFirstRegisteredJLabel;
    }

    public void setEngineCCJLabel(JLabel engineCCJLabel) {
        this.engineCCJLabel = engineCCJLabel;
    }

    
    //konstruktor
    public InsuranceGui()
    { 
        super("Insurance Quote");
        setSize(1000,600); 
        
        // tworzenie obiektow / przyciskow
        
        //tworzenie obiektu tytul
        projectTitle = new JLabel("Direct Quote Motor Insurance") ;

        // tworzenie pol tekstowych
        polaTekstowe = new JTextField[13];
        for(int i=1; i<14; i++)
        {
            polaTekstowe[i-1] = new JTextField(""+i);
 
            polaTekstowe[i-1].setSize(30, 15);
          //  textTable[i-1].addActionListener(new LiczbyListener(i, poleDoTekstu));
        }
        //dodanie labelow
        customerNameJLabel = new JLabel("Name");
        addressJLabel = new JLabel("Address");
        emptyLabel1 = new JLabel(" ");
        emptyLabel2 = new JLabel(" ");
        registrationNumberJLabel = new JLabel("Registration Number"); 
        valuationJLabel = new JLabel("Valuation $");
        estimatedValuedMilageJLabel = new JLabel("Estimated annual mileage");
        claimInLast5YearsJLabel = new JLabel("Claim in last 5 years");
        postCodeJLabel = new JLabel("Post Code");
        telNoJLabel = new JLabel("Tel No");
        dobJLabel = new JLabel("Date of Birth dd/mm/yyyy");
        coverTypeJLabel = new JLabel("Cover Type");
        makeAndModelJLabel = new JLabel("Make and Model");
        yearFirstRegisteredJLabel = new JLabel("Year first registered");
        engineCCJLabel = new JLabel("Engine cc");
<<<<<<< HEAD
        annualPremiumLabel = new JLabel("Annual Premium");
        monthlyPremiumLabel = new JLabel("Monthly Premium");
        annualPremiumTekstowe = new JTextField();
        monthlyPremiumTekstowe = new JTextField();
=======
//
>>>>>>> fb7ac389b4ff062ffdae74a43c3668eefa95df64




        // pomocnicze tablice
         JLabel[] textTable = { customerNameJLabel, addressJLabel, emptyLabel1, emptyLabel2,
        postCodeJLabel, telNoJLabel, dobJLabel,
        makeAndModelJLabel, registrationNumberJLabel, valuationJLabel, yearFirstRegisteredJLabel,engineCCJLabel,
        claimInLast5YearsJLabel,coverTypeJLabel, estimatedValuedMilageJLabel};
   
        // dolne przyciski
        saveQuote = new JButton("Save Quote");
        calculatePremiun = new JButton("Calculate Premium");
        printQuote = new JButton("Print Quote");
  
        //
        setContentPane(UstawLayoutElementy(textTable));

        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }   
    
 
         protected JPanel UstawLayoutElementy(JLabel[] c)
    {
<<<<<<< HEAD
        JLabel premiumLabelTable []= {annualPremiumLabel, monthlyPremiumLabel};
        JTextField premiumTekstoweTable [] = {annualPremiumTekstowe, monthlyPremiumTekstowe};
 
=======
>>>>>>> fb7ac389b4ff062ffdae74a43c3668eefa95df64
        /*// nic nie robi na razie -> sprawdzic strona 18 wyklad 2
        Vector dane = new Vector();
        // obiekt listy bierze dane z Vectora
        JList lista = new JList(dane);
        // dodajemy "przewijacz" związany z listą
        JScrollPane sp = new JScrollPane(lista);
        */
        String claimsTab [] = {"Yes", "No"};
        String[] coverTypeTab = { "Comprehensive", "Third Party" };
<<<<<<< HEAD
        String[] engineCCTab = { "800 or less", "Between 800 - 1000", "Between 1000 - 1500", "Between 1500 - 2000", "More than 2000" };
=======
        String[] engineCCTab = { "800 or less", "Between 800 - 1000", "Between 1000 - 1500", "Between 1500 - 2000", "More than 1000" };
>>>>>>> fb7ac389b4ff062ffdae74a43c3668eefa95df64
        JComboBox dropDown [] = {new JComboBox(claimsTab), new JComboBox(coverTypeTab),new JComboBox(engineCCTab) };
            /*MOga byc jeszcze przydatne*/
        //JComboBox claimsBox = new JComboBox(claimsTab);
        //JComboBox coverTypeBox = new JComboBox(coverTypeTab); 
        //JComboBox engineCCBox = new JComboBox(engineCCTab);
        

        // dodanie przyciskow na Frame
        JPanel main = new JPanel();
        //tytul
        JPanel mainHeader = new JPanel();
<<<<<<< HEAD
        mainHeader.add(projectTitle);
        //pierwszy kontener podzielony na regiony
        JPanel p1 = new JPanel(new BorderLayout());
        p1.add(new JLabel(" Customer Information"),BorderLayout.NORTH );                
=======
        mainHeader.add(new JLabel("Direct Insurance Company"));
        //pierwszy kontener podzielony na regiony
        JPanel p1 = new JPanel(new BorderLayout());
        p1.add(new JLabel(" Profilu Klienta - Informacje"),BorderLayout.NORTH );                
>>>>>>> fb7ac389b4ff062ffdae74a43c3668eefa95df64
        p1.add(new JLabel(" "),BorderLayout.CENTER );                
        JPanel grid1 = new JPanel();             
        JPanel g1 = new JPanel(new GridLayout(4,2));
        JPanel g2 = new JPanel(new GridLayout(4,2));
        
        //dodawanie pol tekstowych i labelow na gridy
        for(int i =0; i<4;i++)
        {
            c[i].setSize(30, 15);
            g1.add(c[i]);
            g1.add(new JTextField("",20));
        }
<<<<<<< HEAD

        for(int i =4; i<7;i++)
        {
            g2.add(c[i]);
            g2.add(new JTextField("",20));
        }
        
        // daodanie pierwszy kontener z regionanami zakonczony
        grid1.add(g1);
        grid1.add(g2);             
        p1.add(grid1,BorderLayout.SOUTH); 
        
        // tworzenie drugiego kontenera z regionami  
                                        
        JPanel p2 = new JPanel(new BorderLayout());

        p2.add(new JLabel ("Vehicle Information"), BorderLayout.NORTH);
        p2.add(new JLabel (" "), BorderLayout.CENTER);
       
        JPanel jp5 = new JPanel(new GridLayout(8,2));
        // panel przechowujacy przyciski
        JPanel jp6 = new JPanel();
        //ustawienie pol tekstowych i labeli na gridzie
        for(int i =7; i<12;i++)
        {    
                c[i].setSize(30, 15);
                jp5.add(c[i]);
                jp5.add(new JTextField(""));
                jp5.add(new JLabel(""));
                jp5.add(new JLabel(""));

        }
        int j=0;
        
        //loop petla do ostatnich 3 drop downow
        for(int i =12;i<15;i++)
        {       //add(sp); // nic nie robi na razie -> sprawdzic strona 18 wyklad 2
                c[i].setSize(30, 15);
                jp5.add(c[i]); 
                jp5.add(dropDown[j++]);
                jp5.add(new JLabel(""));
                jp5.add(new JLabel(""));
        }


         JPanel premium = new JPanel(new GridLayout(2,2));
          
         for(int i=0; i<2; i++)
         {
         premium.add(new JLabel(""));
         premium.add(premiumLabelTable[i]);
         premium.add(premiumTekstoweTable[i]);
         }

        p2.add(jp5, BorderLayout.SOUTH );
        // dodanie przyciskow na ostatni kontener
   
=======

        for(int i =4; i<7;i++)
        {
            g2.add(c[i]);
            g2.add(new JTextField("",20));
        }
        
        // daodanie pierwszy kontener z regionanami zakonczony
        grid1.add(g1);
        grid1.add(g2);             
        p1.add(grid1,BorderLayout.SOUTH); 
        
        // tworzenie drugiego kontenera z regionami  
                                        
        JPanel p2 = new JPanel(new BorderLayout());

        p2.add(new JLabel ("Informacje o pojezdzie"), BorderLayout.NORTH);
        p2.add(new JLabel (" "), BorderLayout.CENTER);
       
        JPanel jp5 = new JPanel(new GridLayout(8,4));
        // panel przechowujacy przyciski
        JPanel jp6 = new JPanel();
        //ustawienie pol tekstowych i labeli na gridzie
        for(int i =7; i<12;i++)
        {    
                c[i].setSize(30, 15);
                jp5.add(c[i]);
                jp5.add(new JTextField("",20));
                jp5.add(new JLabel(""));
                jp5.add(new JLabel(""));

        }
        int j=0;
        //loop petla do ostatnich 3 drop downow
        for(int i =12;i<15;i++)
        {       //add(sp); // nic nie robi na razie -> sprawdzic strona 18 wyklad 2
                c[i].setSize(30, 15);
                jp5.add(c[i]); 
                jp5.add(dropDown[j++]);
                jp5.add(new JLabel(""));
                jp5.add(new JLabel(""));
        }
 
        p2.add(jp5, BorderLayout.SOUTH );
        // dodanie przyciskow na ostatni kontener
        jp6.add(new JLabel("                                                                                                                                                                                  "));
>>>>>>> fb7ac389b4ff062ffdae74a43c3668eefa95df64
        jp6.add(saveQuote);
        jp6.add(calculatePremiun);
        jp6.add(printQuote);

<<<<<<< HEAD

=======
>>>>>>> fb7ac389b4ff062ffdae74a43c3668eefa95df64
        // dodanie wszystkich kontenerow na glowny panel main
        main.add(mainHeader);  
        main.add(p1);
        main.add(p2);
<<<<<<< HEAD
        main.add(premium);
=======
>>>>>>> fb7ac389b4ff062ffdae74a43c3668eefa95df64
        main.add(jp6);
        
        return main;
    }
        
        
      /*  add(projectTitle);
        add(address);
        add(registrationNumber);
        add(valuation);
        add(estimatedValuedMilage);
        add(claimInLast5Years);
        add(postCode);
        add(telNo);
        add(dob);
        add(coverType);
        add(makeAndModel);
        add(yearFirstRegistered);
        add(engineCC);
        add(saveQuote);
        add(calculatePremiun);
        add(printQuote);
        add(customerNnameJLabel);
        add(addressJLabel);
        add(valuationJLabel);
        add(estimatedValuedMilageJLabel);
        add(claimInLast5YearsJLabel);
        add(postCodeJLabel);
        add(telNoJLabel);
        add(dobJLabel);
        add(coverTypeJLabel);
        add(makeAndModelJLabel);
        add(yearFirstRegisteredJLabel);
        add(engineCCJLabel);
        */
//listenery        
     /*   saveQuote.addActionListener(this);
        calculatePremiun.addActionListener(this);
        printQuote.addActionListener(this);*/

    


   
//layout
/*             protected JPanel UstawLayoutElementy()
    {
        
      
        JPanel jpanel = new JPanel(new BorderLayout() );
        
        JPanel jpanel2 = new JPanel();
        JPanel jpanel3 = new JPanel();
        JPanel jpanel4 = new JPanel();
 
             //  jpanel.setLayout(new BorderLayout());

       // JTextField t1 = new JTextField("południe");
       // JButton cb1 = new JButton("wschód");
        
        //dodanie labela do aplikacji
        jpanel2.add(new JLabel("Po angielsku"));
        //dodanie inputa do aplikacji
        jpanel2.add(slowoAng,0,1);
        jpanel2.add(new JLabel("Po polsku"));        
        jpanel2.add(slowoPol);
        //dodanie przycisku
        jpanel3.add(nastepneSlowo);
        jpanel4.add(blad);
        //nastepneSlowo.setVgap(3);
        
        blad.setForeground(Color.RED);
        ////////////////////////////////////////////////////////////
        jpanel.add(jpanel2, BorderLayout.NORTH);
        jpanel.add(jpanel3, BorderLayout.CENTER);
        jpanel.add(jpanel4, BorderLayout.SOUTH);
        
        return jpanel;  
        
 */       

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");   
    }
    
}
