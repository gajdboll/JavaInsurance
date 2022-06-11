package Listeners;

import Exceptions.InvalidDateFormatException;
import Exceptions.NegativeNumberException;
import com.mycompany.insurancejava.Client;
import com.mycompany.insurancejava.InsuranceGui;
import static com.mycompany.insurancejava.InsuranceGui.isANumber;
import static com.mycompany.insurancejava.InsuranceGui.isValid;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Klasa abstrakcyjna. Po niej powinny dziedziczyć klasy, które wykonują operacje na konkretnym kliencie,
 * takie obliczenie kwot ubezpieczenia czy zapisania danych klienta do listy.
 *
 * @author Bartosz Wasko i Krzysztof Gajdosz
 */
public abstract class CalculateListener implements ActionListener {

    /**
     * pola i wlasciwosci dla powyzszej klasy
     */
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
    private JCheckBox checkBoxThirdParty;
    private JComboBox engineCCText;

    Client client;
    private JTextField logowanieText;
    private JFrame window;
    private ArrayList<Client> clients;

    /**
     * gettery i settery
     */
    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JTextField getLogowanieText() {
        return logowanieText;
    }

    public void setLogowanieText(JTextField logowanieText) {
        this.logowanieText = logowanieText;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    /**
     * Konstruktor ktory przyjmuje wszystkie pola wczesniej zsadeklarowane
     *
     * @param annualPremiumTekstowe
     * @param monthlyPremiumTekstowe
     * @param customerNameText
     * @param addressText
     * @param emptyLabel1Text
     * @param emptyLabel2Text
     * @param postCodeText
     * @param telNoText
     * @param dobText
     * @param makeAndModelText
     * @param registrationNumberText
     * @param valuationText
     * @param yearFirstRegisteredText
     * @param estiamtionAnnualMilage
     * @param checkBoxYes
     * @param checkBoxThirdParty
     * @param engineCCText
     * @param client
     * @param logowanieText
     * @param window
     * @param clients
     */
    public CalculateListener(JTextField annualPremiumTekstowe, JTextField monthlyPremiumTekstowe, JTextField customerNameText, JTextField addressText, JTextField emptyLabel1Text, JTextField emptyLabel2Text, JTextField postCodeText, JTextField telNoText, JTextField dobText, JTextField makeAndModelText, JTextField registrationNumberText, JTextField valuationText, JTextField yearFirstRegisteredText, JTextField estiamtionAnnualMilage, JRadioButton checkBoxYes, JCheckBox checkBoxThirdParty, JComboBox engineCCText, Client client, JTextField logowanieText, JFrame window, ArrayList<Client> clients) {
        this.annualPremiumTekstowe = annualPremiumTekstowe;
        this.monthlyPremiumTekstowe = monthlyPremiumTekstowe;
        this.customerNameText = customerNameText;
        this.addressText = addressText;
        this.emptyLabel1Text = emptyLabel1Text;
        this.emptyLabel2Text = emptyLabel2Text;
        this.postCodeText = postCodeText;
        this.telNoText = telNoText;
        this.dobText = dobText;
        this.makeAndModelText = makeAndModelText;
        this.registrationNumberText = registrationNumberText;
        this.valuationText = valuationText;
        this.yearFirstRegisteredText = yearFirstRegisteredText;
        this.estiamtionAnnualMilage = estiamtionAnnualMilage;
        this.checkBoxYes = checkBoxYes;
        this.checkBoxThirdParty = checkBoxThirdParty;
        this.engineCCText = engineCCText;
        this.client = client;
        this.logowanieText = logowanieText;
        this.window = window;
        this.clients = clients;
    }

    /**
     * metoda odpowiedzilana za walidacje pol
     *
     * @return true jesli pole jest poprawne, w przeciwnym wypadku false
     */
    public boolean Validation() {
        try {//sprawdzanie pola daty
            if (!isValid(dobText.getText()) || (dobText.getText() == "")) {
                throw new InvalidDateFormatException("Invalid Date Format");

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(window, "Date format is invalid\n Please enter date with format dd/MM/yyyy", "DATE info", JOptionPane.INFORMATION_MESSAGE);
            dobText.setText("");

            Logger.getLogger(InsuranceGui.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        //Fields validation - phone number section
        try {
            if (Double.valueOf(telNoText.getText()) < 0) {
                throw new NegativeNumberException("Negative Number Exception");
            } else if (isANumber(telNoText.getText()) || (telNoText.getText() == "")) {

                throw new Exception("Phone Number Exception");

            }
        } catch (NegativeNumberException ex) {
            JOptionPane.showMessageDialog(window, "Phone Number format is invalid\n Value should not be negative", "Value Info", JOptionPane.ERROR_MESSAGE);
            valuationText.setText("");

            Logger.getLogger(InsuranceGui.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(window, "Phone format is invalid\n Please enter phone using only digits\n ex: 08x xxx xxx", "Phone Info", JOptionPane.ERROR_MESSAGE);
            telNoText.setText("");
            Logger.getLogger(InsuranceGui.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        // valuation field
        try {
            if (Double.valueOf(valuationText.getText()) < 0) {
                throw new NegativeNumberException("Negative Number Exception");
            } else if (isANumber(valuationText.getText()) || (valuationText.getText() == "")) {

                throw new Exception("Value Format Exception");
            }
        } catch (NegativeNumberException ex) {
            JOptionPane.showMessageDialog(window, "Value format is invalid\n Value should not be negative", "Value Info", JOptionPane.ERROR_MESSAGE);
            valuationText.setText("");

            Logger.getLogger(InsuranceGui.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(window, "Value format is invalid\n Value should have numeric value", "Value Info", JOptionPane.ERROR_MESSAGE);
            valuationText.setText("");

            Logger.getLogger(InsuranceGui.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        // annual milage
        try {
            if (Double.valueOf(estiamtionAnnualMilage.getText()) < 0) {
                throw new NegativeNumberException("Negative Number Exception");
            } else if (isANumber(estiamtionAnnualMilage.getText()) || (estiamtionAnnualMilage.getText() == "")) {

                throw new Exception("Annual Milage Exception");

            }
        } catch (NegativeNumberException ex) {
            JOptionPane.showMessageDialog(window, "Annual milage should not be negative", "Value Info", JOptionPane.ERROR_MESSAGE);
            valuationText.setText("");

            Logger.getLogger(InsuranceGui.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(window, "Annual milage format is invalid\n Annual milage should have numberic value", "Annual milage", JOptionPane.ERROR_MESSAGE);
            estiamtionAnnualMilage.setText("");
            Logger.getLogger(InsuranceGui.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        // registration year
        try {
            if (Double.valueOf(yearFirstRegisteredText.getText()) < 0) {
                throw new NegativeNumberException("Negative Number Exception");
            } else if (isANumber(yearFirstRegisteredText.getText()) || (yearFirstRegisteredText.getText() == "")) {
                System.out.println(yearFirstRegisteredText.getText());
                throw new Exception("Registration Year Exception");

            }
        } catch (NegativeNumberException ex) {
            JOptionPane.showMessageDialog(window, "Registration Year should not be negative", "Value Info", JOptionPane.ERROR_MESSAGE);
            valuationText.setText("");

            Logger.getLogger(InsuranceGui.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(window, "Registration Year format is invalid\n Registration Year should have numberic value", "Registration Info", JOptionPane.ERROR_MESSAGE);
            yearFirstRegisteredText.setText("");
            Logger.getLogger(InsuranceGui.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    /**
     * metoda czyszcząca wszystkie pola GUI
     */
    public void makeTextFieldsNull() {
        getCustomerNameText().setText("");
        getAddressText().setText("");
        getEmptyLabel1Text().setText("");
        getEmptyLabel2Text().setText("");
        getPostCodeText().setText("");
        getTelNoText().setText("");
        getDobText().setText("");
        getCheckBoxYes().setSelected(false);
        getCheckBoxThirdParty().setSelected(false);
        getMakeAndModelText().setText("");
        getRegistrationNumberText().setText("");
        getValuationText().setText("");
        getYearFirstRegisteredText().setText("");
        getEstiamtionAnnualMilage().setText("");
    }

}
