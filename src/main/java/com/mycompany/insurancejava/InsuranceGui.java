package com.mycompany.insurancejava;

import DataBase.DataBase;
import Windows.Login;
import Windows.SignUp;
import Windows.CalculateMultipleResults;
import Threads.ClockThread;
import Listeners.CalculateMultipleListener;
import Listeners.CalculatePremiumListener;
import Listeners.SaveQuoteListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Klasa głównego okna programu.
 * @author Krzysztof Gajdosz i Bartosz Waśko
 */
public class InsuranceGui extends JFrame implements ActionListener
{
// pola (buttony fieldy etc.) znajdujace sie na interfacie
    
    Client client;
    ArrayList clients;
    String filePath;

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
    private JTextField logowanieText;
    private JLabel vehicleInformationLabel;
    private JLabel customerInformationLabel;
    private JLabel carLabel;
    
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
    private JTextField estiamtionAnnualMilage;
    //CheckBoxy
    private JRadioButton checkBoxYes;
    private JRadioButton checkBoxNo;
    private JCheckBox checkBoxComprehensive;
    private JCheckBox checkBoxThirdParty;

    private JComboBox engineCCText;

    private JTextField zegarek;
    private JLabel copyWrights;
    private JLabel tworcy;

    //Ikony
    Icon r1 = new ImageIcon(getClass().getResource("Icons/newFile.png")); 
    Icon r2 = new ImageIcon(getClass().getResource("Icons/openFile.png")); 
    Icon r3 = new ImageIcon(getClass().getResource("Icons/save.png")); 
    Icon r4 = new ImageIcon(getClass().getResource("Icons/saveAs.png")); 
    Icon r5 = new ImageIcon(getClass().getResource("Icons/login.png")); 
    Icon r6 = new ImageIcon(getClass().getResource("Icons/signup.png")); 
    Icon r7 = new ImageIcon(getClass().getResource("Icons/logout.png")); 
    Icon r8 = new ImageIcon(getClass().getResource("Icons/yoda.png")); 
    Icon r9 = new ImageIcon(getClass().getResource("Icons/links.png")); 
    Icon r10 = new ImageIcon(getClass().getResource("Icons/star-wars.png")); 
    Icon r11 = new ImageIcon(getClass().getResource("Icons/superman.png")); 
    Icon r12 = new ImageIcon(getClass().getResource("Icons/batman.png")); 
    Icon r13 = new ImageIcon(getClass().getResource("Icons/car.png"));
    Icon r14 = new ImageIcon(getClass().getResource("Icons/table.png"));
    //baza danych 
    private DataBase bazaDanych;
    //menu elementy
    JMenuItem newList, saveFile, saveAs, openFile, about, links, loginMenu, signUPMenu, logoutMenu, showCalculateMultiple;

// pomocniczy FontStyle
    private Font font ;
    //getters & setters
    public Client getClient() {
        return client;
    }

    public JLabel getCarLabel() {
        return carLabel;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public ArrayList getClients() {
        return clients;
    }
    public void setClients(ArrayList clients) {
        this.clients = clients;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public JLabel getProjectTitle() {
        return projectTitle;
    }
    public void setProjectTitle(JLabel projectTitle) {
        this.projectTitle = projectTitle;
    }
    public JTextField[] getPolaTekstowe() {
        return polaTekstowe;
    }
    public void setPolaTekstowe(JTextField[] polaTekstowe) {
        this.polaTekstowe = polaTekstowe;
    }
    public JButton getSaveQuote() {
        return saveQuote;
    }
    public void setSaveQuote(JButton saveQuote) {
        this.saveQuote = saveQuote;
    }
    public JButton getCalculatePremiun() {
        return calculatePremiun;
    }
    public void setCalculatePremiun(JButton calculatePremiun) {
        this.calculatePremiun = calculatePremiun;
    }
    public JButton getCalculateMultiple() {
        return calculateMultiple;
    }
    public void setCalculateMultiple(JButton calculateMultiple) {
        this.calculateMultiple = calculateMultiple;
    }
    public JLabel getCustomerNameJLabel() {
        return customerNameJLabel;
    }
    public void setCustomerNameJLabel(JLabel customerNameJLabel) {
        this.customerNameJLabel = customerNameJLabel;
    }
    public JLabel getAddressJLabel() {
        return addressJLabel;
    }
    public void setAddressJLabel(JLabel addressJLabel) {
        this.addressJLabel = addressJLabel;
    }
    public JLabel getEmptyLabel1() {
        return emptyLabel1;
    }
    public void setEmptyLabel1(JLabel emptyLabel1) {
        this.emptyLabel1 = emptyLabel1;
    }
    public JLabel getEmptyLabel2() {
        return emptyLabel2;
    }
    public void setEmptyLabel2(JLabel emptyLabel2) {
        this.emptyLabel2 = emptyLabel2;
    }
    public JLabel getRegistrationNumberJLabel() {
        return registrationNumberJLabel;
    }
    public void setRegistrationNumberJLabel(JLabel registrationNumberJLabel) {
        this.registrationNumberJLabel = registrationNumberJLabel;
    }
    public JLabel getValuationJLabel() {
        return valuationJLabel;
    }
    public void setValuationJLabel(JLabel valuationJLabel) {
        this.valuationJLabel = valuationJLabel;
    }
    public JLabel getEstimatedValuedMilageJLabel() {
        return estimatedValuedMilageJLabel;
    }
    public void setEstimatedValuedMilageJLabel(JLabel estimatedValuedMilageJLabel) {
        this.estimatedValuedMilageJLabel = estimatedValuedMilageJLabel;
    }
    public JLabel getClaimInLast5YearsJLabel() {
        return claimInLast5YearsJLabel;
    }
    public void setClaimInLast5YearsJLabel(JLabel claimInLast5YearsJLabel) {
        this.claimInLast5YearsJLabel = claimInLast5YearsJLabel;
    }
    public JLabel getPostCodeJLabel() {
        return postCodeJLabel;
    }
    public void setPostCodeJLabel(JLabel postCodeJLabel) {
        this.postCodeJLabel = postCodeJLabel;
    }
    public JLabel getTelNoJLabel() {
        return telNoJLabel;
    }
    public void setTelNoJLabel(JLabel telNoJLabel) {
        this.telNoJLabel = telNoJLabel;
    }
    public JLabel getDobJLabel() {
        return dobJLabel;
    }
    public void setDobJLabel(JLabel dobJLabel) {
        this.dobJLabel = dobJLabel;
    }
    public JLabel getCoverTypeJLabel() {
        return coverTypeJLabel;
    }
    public void setCoverTypeJLabel(JLabel coverTypeJLabel) {
        this.coverTypeJLabel = coverTypeJLabel;
    }
    public JLabel getMakeAndModelJLabel() {
        return makeAndModelJLabel;
    }
    public void setMakeAndModelJLabel(JLabel makeAndModelJLabel) {
        this.makeAndModelJLabel = makeAndModelJLabel;
    }
    public JLabel getYearFirstRegisteredJLabel() {
        return yearFirstRegisteredJLabel;
    }
    public void setYearFirstRegisteredJLabel(JLabel yearFirstRegisteredJLabel) {
        this.yearFirstRegisteredJLabel = yearFirstRegisteredJLabel;
    }
    public JLabel getEngineCCJLabel() {
        return engineCCJLabel;
    }
    public void setEngineCCJLabel(JLabel engineCCJLabel) {
        this.engineCCJLabel = engineCCJLabel;
    }
    public JLabel getAnnualPremiumLabel() {
        return annualPremiumLabel;
    }
    public void setAnnualPremiumLabel(JLabel annualPremiumLabel) {
        this.annualPremiumLabel = annualPremiumLabel;
    }
    public JLabel getMonthlyPremiumLabel() {
        return monthlyPremiumLabel;
    }
    public void setMonthlyPremiumLabel(JLabel monthlyPremiumLabel) {
        this.monthlyPremiumLabel = monthlyPremiumLabel;
    }
    public JTextField getLogowanieText() {
        return logowanieText;
    }
    public void setLogowanieText(JTextField logowanieText) {
        this.logowanieText = logowanieText;
    }
    public JLabel getVehicleInformationLabel() {
        return vehicleInformationLabel;
    }
    public void setVehicleInformationLabel(JLabel vehicleInformationLabel) {
        this.vehicleInformationLabel = vehicleInformationLabel;
    }
    public JLabel getCustomerInformationLabel() {
        return customerInformationLabel;
    }
    public void setCustomerInformationLabel(JLabel customerInformationLabel) {
        this.customerInformationLabel = customerInformationLabel;
    }
    public JTextField getAnnualPremiumTekstowe() {
        return annualPremiumTekstowe;
    }
    public void setAnnualPremiumTekstowe(JTextField annualPremiumTekstowe) {
        this.annualPremiumTekstowe = annualPremiumTekstowe;
    }
    public JTextField getMonthlyPremiumTekstowe() {
        return monthlyPremiumTekstowe;
    }
    public void setMonthlyPremiumTekstowe(JTextField monthlyPremiumTekstowe) {
        this.monthlyPremiumTekstowe = monthlyPremiumTekstowe;
    }
    public JTextField getCustomerNameText() {
        return customerNameText;
    }
    public void setCustomerNameText(JTextField customerNameText) {
        this.customerNameText = customerNameText;
    }
    public JTextField getAddressText() {
        return addressText;
    }
    public void setAddressText(JTextField addressText) {
        this.addressText = addressText;
    }
    public JTextField getEmptyLabel1Text() {
        return emptyLabel1Text;
    }
    public void setEmptyLabel1Text(JTextField emptyLabel1Text) {
        this.emptyLabel1Text = emptyLabel1Text;
    }
    public JTextField getEmptyLabel2Text() {
        return emptyLabel2Text;
    }
    public void setEmptyLabel2Text(JTextField emptyLabel2Text) {
        this.emptyLabel2Text = emptyLabel2Text;
    }
    public JTextField getPostCodeText() {
        return postCodeText;
    }
    public void setPostCodeText(JTextField postCodeText) {
        this.postCodeText = postCodeText;
    }
    public JTextField getTelNoText() {
        return telNoText;
    }
    public void setTelNoText(JTextField telNoText) {
        this.telNoText = telNoText;
    }

    public JTextField getDobText() {
        return dobText;
    }

    public void setDobText(JTextField dobText) {
        this.dobText = dobText;
    }

    public JTextField getMakeAndModelText() {
        return makeAndModelText;
    }

    public void setMakeAndModelText(JTextField makeAndModelText) {
        this.makeAndModelText = makeAndModelText;
    }

    public JTextField getRegistrationNumberText() {
        return registrationNumberText;
    }

    public void setRegistrationNumberText(JTextField registrationNumberText) {
        this.registrationNumberText = registrationNumberText;
    }

    public JTextField getValuationText() {
        return valuationText;
    }

    public void setValuationText(JTextField valuationText) {
        this.valuationText = valuationText;
    }

    public JTextField getYearFirstRegisteredText() {
        return yearFirstRegisteredText;
    }

    public void setYearFirstRegisteredText(JTextField yearFirstRegisteredText) {
        this.yearFirstRegisteredText = yearFirstRegisteredText;
    }

    public JTextField getEstiamtionAnnualMilage() {
        return estiamtionAnnualMilage;
    }

    public void setEstiamtionAnnualMilage(JTextField estiamtionAnnualMilage) {
        this.estiamtionAnnualMilage = estiamtionAnnualMilage;
    }

    public JRadioButton getCheckBoxYes() {
        return checkBoxYes;
    }

    public void setCheckBoxYes(JRadioButton checkBoxYes) {
        this.checkBoxYes = checkBoxYes;
    }

    public JRadioButton getCheckBoxNo() {
        return checkBoxNo;
    }

    public void setCheckBoxNo(JRadioButton checkBoxNo) {
        this.checkBoxNo = checkBoxNo;
    }

    public JCheckBox getCheckBoxComprehensive() {
        return checkBoxComprehensive;
    }

    public void setCheckBoxComprehensive(JCheckBox checkBoxComprehensive) {
        this.checkBoxComprehensive = checkBoxComprehensive;
    }

    public JCheckBox getCheckBoxThirdParty() {
        return checkBoxThirdParty;
    }

    public void setCheckBoxThirdParty(JCheckBox checkBoxThirdParty) {
        this.checkBoxThirdParty = checkBoxThirdParty;
    }

    public JComboBox getEngineCCText() {
        return engineCCText;
    }

    public void setEngineCCText(JComboBox engineCCText) {
        this.engineCCText = engineCCText;
    }

    public JTextField getZegarek() {
        return zegarek;
    }

    public void setZegarek(JTextField zegarek) {
        this.zegarek = zegarek;
    }

    public JLabel getCopyWrights() {
        return copyWrights;
    }

    public void setCopyWrights(JLabel copyWrights) {
        this.copyWrights = copyWrights;
    }

    public JLabel getTworcy() {
        return tworcy;
    }

    public void setTworcy(JLabel tworcy) {
        this.tworcy = tworcy;
    }

    public Icon getR1() {
        return r1;
    }

    public void setR1(Icon r1) {
        this.r1 = r1;
    }

    public DataBase getBazaDanych() {
        return bazaDanych;
    }

    public void setBazaDanych(DataBase bazaDanych) {
        this.bazaDanych = bazaDanych;
    }

    public JMenuItem getNewList() {
        return newList;
    }

    public void setNewList(JMenuItem newList) {
        this.newList = newList;
    }

    public JMenuItem getSaveFile() {
        return saveFile;
    }

    public void setSaveFile(JMenuItem saveFile) {
        this.saveFile = saveFile;
    }

    public JMenuItem getSaveAs() {
        return saveAs;
    }

    public void setSaveAs(JMenuItem saveAs) {
        this.saveAs = saveAs;
    }

    public JMenuItem getOpenFile() {
        return openFile;
    }

    public void setOpenFile(JMenuItem openFile) {
        this.openFile = openFile;
    }

    public JMenuItem getAbout() {
        return about;
    }

    public void setAbout(JMenuItem about) {
        this.about = about;
    }

    public JMenuItem getLinks() {
        return links;
    }

    public void setLinks(JMenuItem links) {
        this.links = links;
    }

    public JMenuItem getLoginMenu() {
        return loginMenu;
    }

    public void setLoginMenu(JMenuItem loginMenu) {
        this.loginMenu = loginMenu;
    }

    public JMenuItem getSignUPMenu() {
        return signUPMenu;
    }

    public void setSignUPMenu(JMenuItem signUPMenu) {
        this.signUPMenu = signUPMenu;
    }

    public JMenuItem getLogoutMenu() {
        return logoutMenu;
    }

    public void setLogoutMenu(JMenuItem logoutMenu) {
        this.logoutMenu = logoutMenu;
    }

    

    public void setLogoutMenu(JRadioButtonMenuItem logoutMenu) {
        this.logoutMenu = logoutMenu;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
    

    //konstruktor
    public InsuranceGui() {
        super("Insurance Quote");
        filePath = "";
        while(filePath.isEmpty())
            filePath=chooseFile();
        clients = new ArrayList<Client>();
        LoadClientList(filePath);
        setSize(1050, 985);
        //new MenuDesign().tworzenieMenu();   // nie dziala gdy jest w innej klasie??    
        SetMenuBar();
        guiLook();
        elementsInitiator();

        setContentPane(SetLayoutAndElements());
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        settingToolTips();
        //zegar
        new ClockThread(zegarek).start();
        bazaDanych = new DataBase();
        

    }

    /**
     * Setting up GUI colors
     *   
     */
    public void guiLook() {
        //GUI Graphical Look
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
    }

    /**
     * Elements Initialising
     */
    public void elementsInitiator() {

        //tworzenie obiektu tytul
        carLabel = new JLabel(" ",r13, JLabel.LEFT);
        projectTitle = new JLabel("Direct Quote Motor Insurance");
        projectTitle.setFont(new Font("Magneto", Font.BOLD, 30));

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
        annualPremiumLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        monthlyPremiumLabel = new JLabel(" Monthly Premium ");
        monthlyPremiumLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        logowanieText = new JTextField("OFF-LINE ");
        logowanieText.setBackground(Color.red);
        logowanieText.setForeground(Color.WHITE);
        logowanieText.setEditable(false);
        vehicleInformationLabel = new JLabel("                   Vehicle Information ");
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
        estiamtionAnnualMilage = new JTextField("", 20);
        checkBoxYes = new JRadioButton("Yes");
        checkBoxNo = new JRadioButton("No");
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
        saveQuote = new JButton("<html><h3><font color=red>Save</font> Quote");
        calculatePremiun = new JButton("<html><h3><font color=green>Calculate</font> Premium");
        calculateMultiple = new JButton("<html><h3><font color=purple>Calculate</font> Multiple");
        //  drop down
        String[] engineCCTab = {"800 or less", "Between 800 - 1000", "Between 1000 - 1500", "Between 1500 - 2000", "More than 2000"};

        engineCCText = new JComboBox(engineCCTab);
    }

    /**
     * Tool Tips Setting up 
     */
    public void settingToolTips() {
        customerNameJLabel.setToolTipText(" Name ");
        addressJLabel.setToolTipText(" Address ");
        registrationNumberJLabel.setToolTipText(" Registration Number ");
        valuationJLabel.setToolTipText(" Valuation $ ");
        estimatedValuedMilageJLabel.setToolTipText(" Estimated annual mileage ");
        claimInLast5YearsJLabel.setToolTipText(" Claim in last 5 years ");
        postCodeJLabel.setToolTipText(" Post Code ");
        telNoJLabel.setToolTipText(" Tel No ");
        dobJLabel.setToolTipText(" Date of Birth dd/mm/yyyy ");
        coverTypeJLabel.setToolTipText(" Cover Type ");
        makeAndModelJLabel.setToolTipText(" Make and Model ");
        yearFirstRegisteredJLabel.setToolTipText(" Year first registered ");
        engineCCJLabel.setToolTipText(" Engine cc ");
        annualPremiumLabel.setToolTipText(" Annual Premium ");
        annualPremiumLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
        monthlyPremiumLabel.setToolTipText(" Monthly Premium ");
        monthlyPremiumLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
        logowanieText.setToolTipText("Status");
        vehicleInformationLabel.setToolTipText("   Vehicle Information ");
        customerInformationLabel.setToolTipText("Customer Information ");
        //input fileds
        customerNameText.setToolTipText(" Name ");
        addressText.setToolTipText(" Address ");
        emptyLabel1Text.setToolTipText(" Address ");
        emptyLabel2Text.setToolTipText(" Address ");
        postCodeText.setToolTipText(" Post Code ");
        telNoText.setToolTipText(" Tel No ");
        dobText.setToolTipText(" Date of Birth dd/mm/yyyy ");
        makeAndModelText.setToolTipText(" Make and Model ");
        registrationNumberText.setToolTipText(" Registration Number ");
        valuationText.setToolTipText(" Valuation $ ");
        yearFirstRegisteredText.setToolTipText(" Year first registered ");
        engineCCText.setToolTipText(" Engine cc ");
        checkBoxYes.setToolTipText("Yes");
        checkBoxNo.setToolTipText(" No ");
        checkBoxComprehensive.setToolTipText(" Comprehensive ");
        checkBoxThirdParty.setToolTipText(" Third Party ");
        annualPremiumTekstowe.setToolTipText(" Annual Premium ");
        monthlyPremiumTekstowe.setToolTipText(" Monthly Premium ");
        saveQuote.setToolTipText(" Save Quote ");
        saveQuote.setRolloverEnabled(true);
        saveQuote.setPressedIcon(r10);
        calculatePremiun.setToolTipText(" CalculatePremium ");
        calculatePremiun.setRolloverEnabled(true);
        calculatePremiun.setPressedIcon(r11);
        calculateMultiple.setToolTipText(" Calculate Multiple ");
        calculateMultiple.setRolloverEnabled(true);
        calculateMultiple.setPressedIcon(r12);
    }

    /**
     * Adding Elements to the Layouts
     */
    protected JPanel SetLayoutAndElements() {

        // pomocnicze tablice
        JLabel[] textLables = {customerNameJLabel, addressJLabel, emptyLabel1, emptyLabel2,
            postCodeJLabel, telNoJLabel, dobJLabel,
            makeAndModelJLabel, registrationNumberJLabel, valuationJLabel, yearFirstRegisteredJLabel, estimatedValuedMilageJLabel,
            claimInLast5YearsJLabel, coverTypeJLabel};

        // pomocnicze tablice do inputow
        JTextField[] inputText = {customerNameText, addressText, emptyLabel1Text, emptyLabel2Text,
            postCodeText, telNoText, dobText,
            makeAndModelText, registrationNumberText, valuationText, yearFirstRegisteredText, estiamtionAnnualMilage};
        /**
         * pomocnicze tablice ktore mialybyc wyswietlaniem ostatnej quota
         */
        JLabel premiumLabelTable[] = {annualPremiumLabel, monthlyPremiumLabel};
        JTextField premiumTekstoweTable[] = {annualPremiumTekstowe, monthlyPremiumTekstowe};

        // dodanie przyciskow na Frame
        JPanel main = new JPanel();
        JPanel breakLine = new JPanel();
        breakLine.add(new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
        main.add(breakLine);
        //tytul
        JPanel mainHeader = new JPanel();
                 mainHeader.add(carLabel);
        mainHeader.add(projectTitle);
  //pierwszy kontener podzielony na regiony
        JPanel p1 = new JPanel(new BorderLayout());
        JPanel top = new JPanel();
        top.add(customerInformationLabel);
        customerInformationLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
        top.add(new JLabel("                                                                                    "));
        top.add(new JLabel("                                                                                    "));
        top.add(logowanieText);

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
        // dodanie pierwszy kontener z regionanami zakonczony
        grid1.add(g1);
        grid1.add(g2);
        p1.add(grid1, BorderLayout.SOUTH);
        // tworzenie drugiego kontenera z regionami  
        JPanel p2 = new JPanel(new BorderLayout());
        JPanel p2Grid = new JPanel(new GridLayout(2, 1));
        vehicleInformationLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
        p2Grid.add(vehicleInformationLabel);
        p2Grid.add(new JLabel(" "));
        p2.add(p2Grid, BorderLayout.NORTH);
        JPanel jp5 = new JPanel(new GridLayout(8, 2));
        //check boxy
        jp5.add(claimInLast5YearsJLabel);
        //dodanie do grupy by jeden radio sie wlaczal
        ButtonGroup grupa = new ButtonGroup();
        grupa.add(checkBoxYes);
        grupa.add(checkBoxNo);

        jp5.add(checkBoxYes);
        checkBoxYes.addActionListener(this);

        jp5.add(checkBoxNo);
        checkBoxNo.addActionListener(this);

        jp5.add(coverTypeJLabel);
        //grupowanie
        ButtonGroup grupa2 = new ButtonGroup();
        grupa2.add(checkBoxComprehensive);
        grupa2.add(checkBoxThirdParty);

        jp5.add(checkBoxComprehensive);
        checkBoxComprehensive.addActionListener(this);
        jp5.add(checkBoxThirdParty);
        checkBoxThirdParty.addActionListener(this);
        //drop down
        jp5.add(engineCCJLabel);
        jp5.add(engineCCText);
        engineCCText.addActionListener(this);

        p2.add(jp5, BorderLayout.WEST);
        JPanel premium = new JPanel(new GridLayout(9, 2));
        for (int i = 7; i < 12; i++) {
            textLables[i].setSize(30, 15);
            premium.add(textLables[i]);
            premium.add(inputText[i]);
            inputText[i].addActionListener(this);
        }
        p2.add(premium, BorderLayout.EAST);
        JPanel center = new JPanel(new GridLayout(9, 2));
        for (int i = 7; i < 12; i++) {
            textLables[i].setSize(30, 15);
            center.add(new JLabel("                                                                                                   *"));

        }
        p2.add(center, BorderLayout.CENTER);
        //Premium quote REZULTAT- po porawej /// wypisanie jako pop up - poprawic
        JPanel premium2 = new JPanel(new GridLayout(2, 2));
        JPanel kubelek = new JPanel();
        for (int i = 0; i < 2; i++) {
            premium2.add(new JLabel(" "));
            premium2.add(premiumLabelTable[i]);
            premium2.add(premiumTekstoweTable[i]);
        }
        kubelek.add(premium2);
        // dodanie przyciskow do ostatniego kontenera
        p2.add(kubelek, BorderLayout.SOUTH);
        // panel przechowujacy przyciski
        JPanel jp6 = new JPanel();
        jp6.add(saveQuote);
        saveQuote.addActionListener(new SaveQuoteListener(annualPremiumTekstowe, monthlyPremiumTekstowe, customerNameText, addressText, emptyLabel1Text, emptyLabel2Text, postCodeText, telNoText, dobText, makeAndModelText, registrationNumberText, valuationText, yearFirstRegisteredText, estiamtionAnnualMilage, checkBoxYes, checkBoxThirdParty, engineCCText, client, logowanieText, this, clients));
        jp6.add(calculatePremiun);
        calculatePremiun.addActionListener(new CalculatePremiumListener(annualPremiumTekstowe, monthlyPremiumTekstowe, customerNameText, addressText, emptyLabel1Text, emptyLabel2Text, postCodeText, telNoText, dobText, makeAndModelText, registrationNumberText, valuationText, yearFirstRegisteredText, estiamtionAnnualMilage, checkBoxYes, checkBoxThirdParty, engineCCText, client, logowanieText, this, clients));
        jp6.add(calculateMultiple);
        calculateMultiple.addActionListener(new CalculateMultipleListener(annualPremiumTekstowe, monthlyPremiumTekstowe, customerNameText, addressText, emptyLabel1Text, emptyLabel2Text, postCodeText, telNoText, dobText, makeAndModelText, registrationNumberText, valuationText, yearFirstRegisteredText, estiamtionAnnualMilage, checkBoxYes, checkBoxThirdParty, engineCCText, client, logowanieText, this, clients));        
        //dodanie Footera na layout
        JPanel footer = new JPanel(new BorderLayout());
        JPanel breakLine1 = new JPanel();
        breakLine1.add(new JLabel("                               "));
        footer.add(breakLine1, BorderLayout.NORTH);

        JPanel breakLine2 = new JPanel();
        breakLine2.add(new JLabel("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
        footer.add(breakLine2, BorderLayout.CENTER);

        JPanel footer3 = new JPanel();
        tworcy = new JLabel(" Created by: Bartosz Wasko & Krzysztof Gajdosz                          ");

        tworcy.setHorizontalAlignment(JTextField.LEFT);
        footer3.add(tworcy);
        copyWrights = new JLabel("                                     © Copyrights 2022 Dublin                                               ");
        footer3.add(copyWrights);
        zegarek = new JTextField("", 20);
        zegarek.addActionListener(this);
        zegarek.setEditable(false);
        zegarek.setHorizontalAlignment(JTextField.RIGHT);
        footer3.add(zegarek);
        footer.add(footer3, BorderLayout.SOUTH);
        // dodanie wszystkich kontenerow na glowny panel main
        main.add(mainHeader);
        main.add(p1);
        main.add(p2);
        main.add(jp6);
        main.add(footer);
        return main;
    }

    /**
     * ****************************************Setting Up Header Main Menu******
     */
    public void SetMenuBar() {
        //tworzę listwę menu
        JMenuBar mBar = new JMenuBar();

        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Options");
        JMenu m3 = new JMenu("About");
        JMenu m4 = new JMenu("List");
      
        newList = new JMenuItem("New List",r1);
        newList.addActionListener(this);

        openFile = new JMenuItem("Open",r2);
        openFile.addActionListener(this);

        saveFile = new JMenuItem("Save Now",r3);
        saveFile.addActionListener(this);

        saveAs = new JMenuItem("Save As...",r4);
        saveAs.addActionListener(this);

        loginMenu = new JMenuItem("Login",r5);
        loginMenu.addActionListener(this);

        signUPMenu = new JMenuItem("Sign UP",r6);
        signUPMenu.addActionListener(this);

        logoutMenu = new JMenuItem("Logout",r7);
        logoutMenu.addActionListener(this);

        about = new JMenuItem("About",r8);
        about.addActionListener(this);

        links = new JMenuItem("Links",r9);
        links.addActionListener(this);
        
        showCalculateMultiple = new JMenuItem("Show table", r14);
        showCalculateMultiple.addActionListener(this);
        // konstrukcja pierwszej głównej pozycji menu
        m1.add(openFile);
        m1.addSeparator();
        //a tu dam nowe podmenu
        JMenu podmenu = new JMenu("Save");
        //dodaję elementy do podmenu
        podmenu.add(saveFile);  
        podmenu.add(saveAs);
        //dodaje podmenu do menu
        m1.add(podmenu);
        m2.add(loginMenu);
        m2.addSeparator();
        m2.add(signUPMenu);
        m2.addSeparator();
        m2.add(logoutMenu);        
        m4.add(newList);
        m4.add(showCalculateMultiple);
        m3.add(about);
        m3.add(links);
        mBar.add(m1);
        mBar.add(m4);
        mBar.add(m2);
        mBar.add(m3);
        setJMenuBar(mBar);
    }
    /**
     * ******************Methods********************
     */
    //Date validator
    //@Override
    public static boolean isValid(String dateStr) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date Dob = null;
        df.setLenient(false);

        try {
            Dob = df.parse(dateStr);
            return true;

        } catch (Exception e) {
            return false;
        }
    }
    // Numbers Validator
    public static boolean isANumber(String number) {
        try {
            Long.parseLong(number);
            return false;
        } catch (Exception e) {

            return true;
        }
    }

    //Listeners
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if ( e.getSource() == links) {
            System.out.println("nasze dane");
            JOptionPane.showMessageDialog(this,
                    "Product can be downloaded from:\nhttps://github.com/gajdboll/JavaInsurance\n Jira managment:\nhttps://bjwasko.atlassian.net/jira/software/projects/JAV/boards/1 ",
                    "Project directory",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if ( e.getSource() == about) {
            System.out.println("nasze dane");
            JOptionPane.showMessageDialog(this,
                    "Created by:\n Bartosz Wasko,\n Krzysztof Gajdosz",
                    "Created By",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        if ( e.getSource() == loginMenu) {
            new Login(logowanieText, bazaDanych);
        }
        if ( e.getSource() == signUPMenu) {
            new SignUp(bazaDanych);

        }
        if ( e.getSource() == logoutMenu) {
            logowanieText.setText("OFF-LINE");
            logowanieText.setBackground(Color.red);
            logowanieText.setForeground(Color.WHITE);
        }
        if( e.getSource() == saveFile)
        {
            System.out.println(filePath);
            File file = new File(filePath);
            try
            {
                FileWriter writer = new FileWriter(file);
                for(int i = 0; i<clients.size(); i++)
                {
                    writer.write(((Client)clients.get(i)).toString()+"\n");
                    writer.flush();
                    System.out.println(((Client)clients.get(i)).toString());
                }
                writer.close();
            }
            catch (IOException ex)
            {
                
            }
        }
        if( e.getSource() == saveAs)
        {
            SaveAs();
           
        }
    
     if( e.getSource() == openFile)
        {
            
            filePath = chooseFile();
            clients.clear();
            LoadClientList(filePath);
 
        }
     if( e.getSource() == newList)
        {
            clients.clear();
            System.out.println("Clients list got cleared");
        }
     if( e.getSource() == showCalculateMultiple)
     {
         new CalculateMultipleResults(clients);
     }
    }        
        /*metody odpowiedzialne za plik*/

           public void SaveAs()
    {            
        try
        {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save As");
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Pliki tekstowe", "txt"));
            fileChooser.setAcceptAllFileFilterUsed(false);
        
            String path = fileChooser.getSelectedFile() != null ? fileChooser.getSelectedFile().getPath() : "";
            System.out.println(path);
            fileChooser.showOpenDialog(this);
      
            path = fileChooser.getSelectedFile() != null ? fileChooser.getSelectedFile().getPath() : "";
            System.out.println(path);
        
            File file = fileChooser.getSelectedFile();
            FileWriter writer = new FileWriter(file);      
            writer.write(client.toString());
 
            writer.flush();
            writer.close();
            System.out.println("Save as file: " + file.getAbsolutePath());
        }
        catch(IOException e)
        {
                System.out.println("Wyjatek " + e.getClass().getSimpleName() + " "+ e.getMessage());
        }
    }
    private String chooseFile()
    {
  
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose A File");
        //dodajemy filtry dla plikow .txt i usuwamy filtr "WSZYSTKIE PLIKI"
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Pliki tekstowe", "txt"));
        fileChooser.setAcceptAllFileFilterUsed(false); 
        String path = fileChooser.getSelectedFile() != null ? fileChooser.getSelectedFile().getPath() : "";
        System.out.println(path);

        //wywolujemy okno do wybrania pliku
        fileChooser.showOpenDialog(this);
        path = fileChooser.getSelectedFile() != null ? fileChooser.getSelectedFile().getPath() : "";
        System.out.println(path);
        return path;
    }

    private void LoadClientList(String path) 
    {
        File file = new File(path);
        try
        {
            String line = "";
            BufferedReader out = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            
            System.out.println(line);
            while((line = out.readLine()) != null)
            { 
                try
                {
                    String[] list = line.split(";");
                    clients.add(new Client(list[0],list[1],list[2],
                            list[3],list[4],list[5],list[6],list[7],
                            list[8],list[9],list[10],list[11],list[12],
                            list[13],list[14],list[15],list[16]));
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Poza rozmiarem tablicy, brak klientow.");
                }
                catch(Exception e)
                {
                    System.out.println("Exception: " + e.getLocalizedMessage());
                }     
            }
        }
        catch(IOException e)
        {     
        }
    }

}
