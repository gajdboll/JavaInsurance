 package Listeners;

import com.mycompany.insurancejava.Client;
import com.mycompany.insurancejava.ClientToServerConnect;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
     * Listener pozwalający na połączenie z serwerem, jeśli status bar jest
     * ON-LINE i przycisk Calculate Multiple został kliknięty,
     * w przeciwnym wypadku wyrzuca okno dialogowe 
     * Wylicza wartość ubezpieczenia tworząc dla każdego klienta na liście osobny
     * wątek do komunikacji z serwerem.
     *
     * 
     */
public class CalculateMultipleListener extends CalculateListener {

    public CalculateMultipleListener(JTextField annualPremiumTekstowe, JTextField monthlyPremiumTekstowe, JTextField customerNameText, JTextField addressText, JTextField emptyLabel1Text, JTextField emptyLabel2Text, JTextField postCodeText, JTextField telNoText, JTextField dobText, JTextField makeAndModelText, JTextField registrationNumberText, JTextField valuationText, JTextField yearFirstRegisteredText, JTextField estiamtionAnnualMilage, JRadioButton checkBoxYes, JCheckBox checkBoxThirdParty, JComboBox engineCCText, Client client, JTextField logowanieText, JFrame window, ArrayList<Client> clients) {
        super(annualPremiumTekstowe, monthlyPremiumTekstowe, customerNameText, addressText, emptyLabel1Text, emptyLabel2Text, postCodeText, telNoText, dobText, makeAndModelText, registrationNumberText, valuationText, yearFirstRegisteredText, estiamtionAnnualMilage, checkBoxYes, checkBoxThirdParty, engineCCText, client, logowanieText, window, clients);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (getLogowanieText().getText().equals("ON-LINE")) {
            for (int i = 0; i < getClients().size(); i++) {
                new ClientToServerConnect((Client) getClients().get(i), getAnnualPremiumTekstowe(), getMonthlyPremiumTekstowe(), true).connect();

            }
        } else {
            JOptionPane.showMessageDialog(getWindow(), "You are not logged in", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
