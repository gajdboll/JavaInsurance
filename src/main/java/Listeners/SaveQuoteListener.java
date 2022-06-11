package Listeners;

import com.mycompany.insurancejava.Client;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
     * Listener ktory jest uruchamiany po kliknięciu przycisku Save quote i 
     * pozwala na dopisaniu klienta do listy(kolekcji).
     *
     * 
     */
public class SaveQuoteListener extends CalculateListener {

    /**
     * KOnstruktor przyjmujacy prawie wszystkie pola tekstowe glownego Gui
     * programu
     */
    public SaveQuoteListener(JTextField annualPremiumTekstowe, JTextField monthlyPremiumTekstowe, JTextField customerNameText, JTextField addressText, JTextField emptyLabel1Text, JTextField emptyLabel2Text, JTextField postCodeText, JTextField telNoText, JTextField dobText, JTextField makeAndModelText, JTextField registrationNumberText, JTextField valuationText, JTextField yearFirstRegisteredText, JTextField estiamtionAnnualMilage, JRadioButton checkBoxYes, JCheckBox checkBoxThirdParty, JComboBox engineCCText, Client client, JTextField logowanieText, JFrame window, ArrayList<Client> clients) {
        super(annualPremiumTekstowe, monthlyPremiumTekstowe, customerNameText, addressText, emptyLabel1Text, emptyLabel2Text, postCodeText, telNoText, dobText, makeAndModelText, registrationNumberText, valuationText, yearFirstRegisteredText, estiamtionAnnualMilage, checkBoxYes, checkBoxThirdParty, engineCCText, client, logowanieText, window, clients);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (Validation() == false) {
            return;
        }
        getClients().add(new Client(getCustomerNameText().getText(),
                getAddressText().getText(),
                getEmptyLabel1Text().getText(),
                getEmptyLabel2Text().getText(),
                getPostCodeText().getText(),
                getTelNoText().getText(),
                getDobText().getText(),
                (getCheckBoxYes().isSelected() + ""),
                (getCheckBoxThirdParty().isSelected() + ""),
                (getEngineCCText().getSelectedItem() + ""),
                getMakeAndModelText().getText(),
                getRegistrationNumberText().getText(),
                getValuationText().getText(),
                getYearFirstRegisteredText().getText(),
                getEstiamtionAnnualMilage().getText(),
                "0", "0"));
        makeTextFieldsNull();
    }

}
