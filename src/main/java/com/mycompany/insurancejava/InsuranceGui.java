
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

 
public class InsuranceGui extends JFrame implements ActionListener

{

// pola (buttony fieldy etc.) znajdujace sie na interfacie
    private JLabel projectTitle;
    private JTextField customerNname;
    private JTextField address;
    private JTextField registrationNumber; 
    private JTextField valuation;
    private JTextField estimatedValuedMilage;
    private JTextField claimInLast5Years;
    private JTextField postCode;
    private JTextField telNo;
    private JTextField dob;
    private JTextField coverType;
    private JTextField makeAndModel;
    private JTextField yearFirstRegistered;
    private JTextField engineCC;
    private JButton saveQuote;
    private JButton calculatePremiun;
    private JButton printQuote;
    private JLabel customerNnameJLabel;
    private JLabel addressJLabel;
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
    
//getters & setters

    public JLabel getProjectTitle() {
        return projectTitle;
    }

    public JTextField getCustomerNname() {
        return customerNname;
    }

    public JTextField getAddress() {
        return address;
    }

    public JTextField getRegistrationNumber() {
        return registrationNumber;
    }

    public JTextField getValuation() {
        return valuation;
    }

    public JTextField getEstimatedValuedMilage() {
        return estimatedValuedMilage;
    }

    public JTextField getClaimInLast5Years() {
        return claimInLast5Years;
    }

    public JTextField getPostCode() {
        return postCode;
    }

    public JTextField getTelNo() {
        return telNo;
    }

    public JTextField getDob() {
        return dob;
    }

    public JTextField getCoverType() {
        return coverType;
    }

    public JTextField getMakeAndModel() {
        return makeAndModel;
    }

    public JTextField getYearFirstRegistered() {
        return yearFirstRegistered;
    }

    public JTextField getEngineCC() {
        return engineCC;
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
        return customerNnameJLabel;
    }

    public JLabel getAddressJLabel() {
        return addressJLabel;
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

    public void setCustomerNname(JTextField customerNname) {
        this.customerNname = customerNname;
    }

    public void setAddress(JTextField address) {
        this.address = address;
    }

    public void setRegistrationNumber(JTextField registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setValuation(JTextField valuation) {
        this.valuation = valuation;
    }

    public void setEstimatedValuedMilage(JTextField estimatedValuedMilage) {
        this.estimatedValuedMilage = estimatedValuedMilage;
    }

    public void setClaimInLast5Years(JTextField claimInLast5Years) {
        this.claimInLast5Years = claimInLast5Years;
    }

    public void setPostCode(JTextField postCode) {
        this.postCode = postCode;
    }

    public void setTelNo(JTextField telNo) {
        this.telNo = telNo;
    }

    public void setDob(JTextField dob) {
        this.dob = dob;
    }

    public void setCoverType(JTextField coverType) {
        this.coverType = coverType;
    }

    public void setMakeAndModel(JTextField makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public void setYearFirstRegistered(JTextField yearFirstRegistered) {
        this.yearFirstRegistered = yearFirstRegistered;
    }

    public void setEngineCC(JTextField engineCC) {
        this.engineCC = engineCC;
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
        this.customerNnameJLabel = customerNnameJLabel;
    }

    public void setAddressJLabel(JLabel addressJLabel) {
        this.addressJLabel = addressJLabel;
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

    public InsuranceGui()
    {
        
                super("Insurance Quote");
        setSize(500,500);
// tworzenie obiektow / przyciskow
        saveQuote = new JButton("Save Quote");
        calculatePremiun = new JButton("Calculate Premium");
        printQuote = new JButton("Print Quote");
// okno nie do edycji
//oknoWyniku.setEditable(false);
// dodanie przyciskow na Frame

        add(projectTitle);
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
        
//listenery        
        saveQuote.addActionListener(this);
        calculatePremiun.addActionListener(this);
        printQuote.addActionListener(this);
// dodatkowe listenery musz byc ustawione jak inna opcja bedzie ustawiona ???
    
        setLayout(null);
// pozostale 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
