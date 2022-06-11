
package Listeners;

import com.mycompany.insurancejava.Client;
import com.mycompany.insurancejava.ClientToServerConnect;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

/**
     * Listener pozwalajacy na polaczenie z serverem jesli status bar jest
     * ON-LINE i przycisk Calculate Premium zostal klikniety,
     * w przeciwnym wypadku wyrzuca okno dialogowe 
     * Wylicza wartość ubezpieczenia tworząc połączenie między programem a serwerem
     * oraz biorąc dane prosto z wypełnionego formularza.
     *
     * 
     */
public class CalculatePremiumListener extends CalculateListener
{

    public CalculatePremiumListener(JTextField annualPremiumTekstowe, JTextField monthlyPremiumTekstowe, JTextField customerNameText, JTextField addressText, JTextField emptyLabel1Text, JTextField emptyLabel2Text, JTextField postCodeText, JTextField telNoText, JTextField dobText, JTextField makeAndModelText, JTextField registrationNumberText, JTextField valuationText, JTextField yearFirstRegisteredText, JTextField estiamtionAnnualMilage, JRadioButton checkBoxYes, JCheckBox checkBoxThirdParty, JComboBox engineCCText, Client client, JTextField logowanieText, JFrame window, ArrayList<Client> clients) {
        super(annualPremiumTekstowe, monthlyPremiumTekstowe, customerNameText, addressText, emptyLabel1Text, emptyLabel2Text, postCodeText, telNoText, dobText, makeAndModelText, registrationNumberText, valuationText, yearFirstRegisteredText, estiamtionAnnualMilage, checkBoxYes, checkBoxThirdParty, engineCCText, client, logowanieText, window, clients);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(Validation() == false) return;
            if(getLogowanieText().getText().equals("ON-LINE"))
            {
                getAnnualPremiumTekstowe().setBorder(new EtchedBorder(Color.red, Color.blue));
                getMonthlyPremiumTekstowe().setBorder(new BevelBorder
                (BevelBorder.RAISED,Color.yellow, Color.cyan));
                client = new Client(getCustomerNameText().getText(),
                        getAddressText().getText(),
                        getEmptyLabel1Text().getText(),
                        getEmptyLabel2Text().getText(),
                        getPostCodeText().getText(),
                        getTelNoText().getText(),
                        getDobText().getText(),
                        (getCheckBoxYes().isSelected()+""),
                        (getCheckBoxThirdParty().isSelected()+""),
                        (getEngineCCText().getSelectedItem()+""),
                        getMakeAndModelText().getText(),
                        getRegistrationNumberText().getText(),
                        getValuationText().getText(),
                        getYearFirstRegisteredText().getText(),
                        getEstiamtionAnnualMilage().getText(),
                        "0","0");
                ClientToServerConnect nowy = new ClientToServerConnect(client, getAnnualPremiumTekstowe(), getMonthlyPremiumTekstowe(), false);
                nowy.connect();
            }
            else
            {
                JOptionPane.showMessageDialog(getWindow(),"You are not logged in", "Message",JOptionPane.INFORMATION_MESSAGE);
            }
    }
    
}
