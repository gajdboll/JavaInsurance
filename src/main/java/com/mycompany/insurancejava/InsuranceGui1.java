package com.mycompany.insurancejava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class InsuranceGui1 extends JFrame implements ActionListener {
// pola (buttony fieldy etc.) znajdujace sie na interfacie

    private JLabel projectTitle;
    private JTextField[] polaTekstowe;
    private JButton saveQuote;
    private JButton calculatePremiun;
    private JButton calculateMultiple;
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
    private JLabel annualPremiumLabel;
    private JLabel monthlyPremiumLabel;
    private JLabel logowanieLabel;
    private JLabel vehicleInformationLabel;
    private JLabel customerInformationLabel;

    private JTextField annualPremiumTekstowe;
    private JTextField monthlyPremiumTekstowe;

    private JTextField customerNameText;
    private JTextField addressText;
    private JTextField emptyLabel1Text;
    private JTextField emptyLabel2Text;
    private JTextField postCodeText;
    private JTextField telNoText;
    private JTextField dobText;
    private JTextField makeAndModelText;
    private JTextField registrationNumberText;
    private JTextField valuationText;
    private JTextField yearFirstRegisteredText;
    private JTextField engineCCText;
    //CheckBoxy
    private JCheckBox checkBoxYes;
    private JCheckBox checkBoxNo;
    private JCheckBox checkBoxComprehensive;
    private JCheckBox checkBoxThirdParty;
    
    private JComboBox estiamtionAnnualMilage;
    
// pomocniczy FontStyle
    private Font font = new Font("Helvetica", Font.BOLD, 20);

    //getters & setters
    public JButton getCalculateMultiple() {
        return calculateMultiple;
    }

    public JLabel getLogowanieLabel() {
        return logowanieLabel;
    }

    public JTextField getMakeAndModelText() {
        return makeAndModelText;
    }

    public JLabel getCustomerNameJLabel() {
        return customerNameJLabel;
    }

    public JLabel getAnnualPremiumLabel() {
        return annualPremiumLabel;
    }

    public JTextField getAnnualPremiumTekstowe() {
        return annualPremiumTekstowe;
    }

    public JTextField getCustomerNameText() {
        return customerNameText;
    }

    public JTextField getAddressText() {
        return addressText;
    }

    public JTextField getEmptyLabel1Text() {
        return emptyLabel1Text;
    }

    public JTextField getEmptyLabel2Text() {
        return emptyLabel2Text;
    }

    public JTextField getPostCodeText() {
        return postCodeText;
    }

    public JTextField getTelNoText() {
        return telNoText;
    }

    public JTextField getDobText() {
        return dobText;
    }

    public JTextField getRegistrationNumberText() {
        return registrationNumberText;
    }

    public JTextField getValuationText() {
        return valuationText;
    }

    public JTextField getYearFirstRegisteredText() {
        return yearFirstRegisteredText;
    }

    public JTextField getEngineCCText() {
        return engineCCText;
    }

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

    public void setCalculateMultiple(JButton calculateMultiple) {
        this.calculateMultiple = calculateMultiple;
    }

    public void setLogowanieLabel(JLabel logowanieLabel) {
        this.logowanieLabel = logowanieLabel;
    }

    public void setMakeAndModelText(JTextField makeAndModelText) {
        this.makeAndModelText = makeAndModelText;
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
        return calculateMultiple;
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

    public void setCustomerNameJLabel(JLabel customerNameJLabel) {
        this.customerNameJLabel = customerNameJLabel;
    }

    public void setAnnualPremiumLabel(JLabel annualPremiumLabel) {
        this.annualPremiumLabel = annualPremiumLabel;
    }

    public void setAnnualPremiumTekstowe(JTextField annualPremiumTekstowe) {
        this.annualPremiumTekstowe = annualPremiumTekstowe;
    }

    public void setCustomerNameText(JTextField customerNameText) {
        this.customerNameText = customerNameText;
    }

    public void setAddressText(JTextField addressText) {
        this.addressText = addressText;
    }

    public void setEmptyLabel1Text(JTextField emptyLabel1Text) {
        this.emptyLabel1Text = emptyLabel1Text;
    }

    public void setEmptyLabel2Text(JTextField emptyLabel2Text) {
        this.emptyLabel2Text = emptyLabel2Text;
    }

    public void setPostCodeText(JTextField postCodeText) {
        this.postCodeText = postCodeText;
    }

    public void setTelNoText(JTextField telNoText) {
        this.telNoText = telNoText;
    }

    public void setDobText(JTextField dobText) {
        this.dobText = dobText;
    }

    public void setRegistrationNumberText(JTextField registrationNumberText) {
        this.registrationNumberText = registrationNumberText;
    }

    public void setValuationText(JTextField valuationText) {
        this.valuationText = valuationText;
    }

    public void setYearFirstRegisteredText(JTextField yearFirstRegisteredText) {
        this.yearFirstRegisteredText = yearFirstRegisteredText;
    }

    public void setEngineCCText(JTextField engineCCText) {
        this.engineCCText = engineCCText;
    }

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
        this.calculateMultiple = printQuote;
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
    public InsuranceGui1() {
        super("Insurance Quote");
        setSize(1050, 638);
        //ustawienie wygladu
        try{
			UIManager.setLookAndFeel(
				  "javax.swing.plaf.nimbus.NimbusLookAndFeel"
			);
	} catch(Exception e){}

        // tworzenie obiektow / przyciskow
        //tworzenie obiektu tytul
        projectTitle = new JLabel("Direct Quote Motor Insurance");
        projectTitle.setFont(font);

        //dodanie labelow
        customerNameJLabel = new JLabel(" Name ");
        addressJLabel = new JLabel(" Address ");
        emptyLabel1 = new JLabel(" ");
        emptyLabel2 = new JLabel(" ");
        registrationNumberJLabel = new JLabel(" Registration Number ");
        valuationJLabel = new JLabel(" Valuation $ ");
        estimatedValuedMilageJLabel = new JLabel(" Estimated annual mileage ");
        claimInLast5YearsJLabel = new JLabel(" Claim in last 5 years ");
        postCodeJLabel = new JLabel(" Post Code ");
        telNoJLabel = new JLabel(" Tel No ");
        dobJLabel = new JLabel(" Date of Birth dd/mm/yyyy ");
        coverTypeJLabel = new JLabel(" Cover Type ");
        makeAndModelJLabel = new JLabel(" Make and Model ");
        yearFirstRegisteredJLabel = new JLabel(" Year first registered ");
        engineCCJLabel = new JLabel(" Engine cc ");
        annualPremiumLabel = new JLabel(" Annual Premium ");
        annualPremiumLabel.setFont(font);
        monthlyPremiumLabel = new JLabel(" Monthly Premium ");
        monthlyPremiumLabel.setFont(font);
        logowanieLabel = new JLabel("OFF-LINE ");
        vehicleInformationLabel = new JLabel("   Vehicle Information ");
        customerInformationLabel = new JLabel("Customer Information ");
        //input fileds
        customerNameText = new JTextField("", 20);
        addressText = new JTextField("", 20);
        emptyLabel1Text = new JTextField("", 20);
        emptyLabel2Text = new JTextField("", 20);
        postCodeText = new JTextField("", 20);
        telNoText = new JTextField("", 20);
        dobText = new JTextField("", 20);
        makeAndModelText = new JTextField("", 20);
        registrationNumberText = new JTextField("", 20);
        valuationText = new JTextField("", 20);
        yearFirstRegisteredText = new JTextField("", 20);
        engineCCText = new JTextField("", 20);
        checkBoxYes = new JCheckBox("Yes");
        checkBoxNo = new JCheckBox("No");
        checkBoxComprehensive = new JCheckBox("Comprehensive");
        checkBoxThirdParty = new JCheckBox("Third Party");
        //rezultat                              
        annualPremiumTekstowe = new JTextField("", 20);
        annualPremiumTekstowe.setEditable(false);
        annualPremiumTekstowe.setForeground(Color.RED);
        monthlyPremiumTekstowe = new JTextField("", 20);
        monthlyPremiumTekstowe.setEditable(false);
        monthlyPremiumTekstowe.setForeground(Color.RED);


        // dolne przyciski
        saveQuote = new JButton("Save Quote");
        calculatePremiun = new JButton("Calculate Premium");
        calculateMultiple = new JButton("Calculate Multiple");
        //  drop down
        String[] engineCCTab = {"800 or less", "Between 800 - 1000", "Between 1000 - 1500", "Between 1500 - 2000", "More than 2000"};
        
        estiamtionAnnualMilage = new JComboBox(engineCCTab);
        
        setContentPane(UstawLayoutElementy());
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    protected JPanel UstawLayoutElementy() {
        
                // pomocnicze tablice
        JLabel[] textLables = {customerNameJLabel, addressJLabel, emptyLabel1, emptyLabel2,
            postCodeJLabel, telNoJLabel, dobJLabel,
            makeAndModelJLabel, registrationNumberJLabel, valuationJLabel, yearFirstRegisteredJLabel, engineCCJLabel,
            claimInLast5YearsJLabel, coverTypeJLabel, estimatedValuedMilageJLabel};
        
        // pomocnicze tablice do inputow
        JTextField[] inputText = {customerNameText, addressText, emptyLabel1Text, emptyLabel2Text,
            postCodeText, telNoText, dobText,
            makeAndModelText, registrationNumberText, valuationText, yearFirstRegisteredText, engineCCText};
        
        JLabel premiumLabelTable[] = {annualPremiumLabel, monthlyPremiumLabel};
        JTextField premiumTekstoweTable[] = {annualPremiumTekstowe, monthlyPremiumTekstowe};

        /*// nic nie robi na razie -> sprawdzic strona 18 wyklad 2
        Vector dane = new Vector();
        // obiekt listy bierze dane z Vectora
        JList lista = new JList(dane);
        // dodajemy "przewijacz" związany z listą
        JScrollPane sp = new JScrollPane(lista);
         */

    
        // dodanie przyciskow na Frame
        JPanel main = new JPanel();
        JPanel breakLine = new JPanel();
        breakLine.add(new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
        main.add(breakLine);
        //tytul
        JPanel mainHeader = new JPanel();
        mainHeader.add(projectTitle);
        

        //pierwszy kontener podzielony na regiony
        JPanel p1 = new JPanel(new BorderLayout());
        JPanel top = new JPanel();
        top.add(customerInformationLabel);
        customerInformationLabel.setFont(font);
        top.add(new JLabel("                                                                                    "));
        top.add(new JLabel("                                                                                    "));
        top.add(logowanieLabel);

        p1.add(top, BorderLayout.NORTH);             
        p1.add(new JLabel(" "), BorderLayout.CENTER);
        JPanel grid1 = new JPanel();
        JPanel g1 = new JPanel(new GridLayout(4, 2));
        JPanel g2 = new JPanel(new GridLayout(4, 2));

        //dodawanie pol tekstowych i labelow na gridy
        for (int i = 0; i < 4; i++) {
            textLables[i].setSize(30, 15);
            g1.add(textLables[i]);
            g1.add(inputText[i]);
            inputText[i].addActionListener(this);
        }
        for (int i = 4; i < 7; i++) {
            textLables[i].setSize(30, 15);
            g2.add(textLables[i]);
            g2.add(inputText[i]);
            inputText[i].addActionListener(this);
        }
        // daodanie pierwszy kontener z regionanami zakonczony
        grid1.add(g1);
        grid1.add(g2);
        p1.add(grid1, BorderLayout.SOUTH);
        // tworzenie drugiego kontenera z regionami  
        JPanel p2 = new JPanel(new BorderLayout());
        JPanel p2Grid = new JPanel(new GridLayout(2, 1));

        vehicleInformationLabel.setFont(font);
        p2Grid.add(vehicleInformationLabel);
        p2Grid.add(new JLabel(" "));
        p2.add(p2Grid, BorderLayout.NORTH);

        JPanel jp5 = new JPanel(new GridLayout(8, 2));

        //check boxy
        jp5.add(claimInLast5YearsJLabel);
        jp5.add(checkBoxYes);
        checkBoxYes.addActionListener(this);
        
        jp5.add(checkBoxNo);
        checkBoxNo.addActionListener(this);
        
        jp5.add(coverTypeJLabel);
        jp5.add(checkBoxComprehensive);
        checkBoxComprehensive.addActionListener(this);
        jp5.add(checkBoxThirdParty);  
        checkBoxThirdParty.addActionListener(this);
        //drop down
        jp5.add(estimatedValuedMilageJLabel);
        jp5.add(estiamtionAnnualMilage);//do dropdowna kazdego osobno chyba?? sprawdzic
        estiamtionAnnualMilage.addActionListener(this);
   
        p2.add(jp5, BorderLayout.WEST);

        //Premium quote REZULTAT- po porawej
        JPanel premium = new JPanel(new GridLayout(2, 2));

        for (int i = 0; i < 2; i++) {
            premium.add(new JLabel(""));
            premium.add(premiumLabelTable[i]);
            premium.add(premiumTekstoweTable[i]);
            premiumTekstoweTable[i].addActionListener(this);
        }

        // dodanie przyciskow do ostatniego kontenera
        p2.add(premium, BorderLayout.EAST);
 
        // panel przechowujacy przyciski
        JPanel jp6 = new JPanel();
        jp6.add(saveQuote);
        jp6.add(calculatePremiun);
        jp6.add(calculateMultiple);
        //dodanie Footera na layout
        JPanel footer = new JPanel(new BorderLayout());
        JPanel breakLine1 = new JPanel();
        breakLine1.add(new JLabel("                               "));
        footer.add(breakLine1, BorderLayout.NORTH);

        JPanel breakLine2 = new JPanel();
        breakLine2.add(new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
        footer.add(breakLine2, BorderLayout.CENTER);

        JPanel footer3 = new JPanel();
        JLabel tworcy = new JLabel(" Wykonano przez: Bartosz Wasko & Krzysztof Gajdosz                          ");
        //tworcy.setEditable(false);
        tworcy.setHorizontalAlignment(JTextField.LEFT);
        footer3.add(tworcy);

        JLabel copyWrights = new JLabel("                           © Copyrights 2022 Dublin                                 ");
        //copyWrights.setEditable(false);   
        footer3.add(copyWrights);


        JTextField pasekStanu = new JTextField("                                                             Program uruchomiony ");
        pasekStanu.addActionListener(this);
        pasekStanu.setEditable(false);
        footer3.add(pasekStanu);

        footer.add(footer3, BorderLayout.SOUTH);

        // dodanie wszystkich kontenerow na glowny panel main
        main.add(mainHeader);
        main.add(p1);
        main.add(p2);
        main.add(jp6);
        main.add(footer);

        return main;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
