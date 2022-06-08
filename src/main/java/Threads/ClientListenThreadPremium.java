/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import com.mycompany.insurancejava.Client;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JTextField;

/**
 *
 * @author pre12
 */
public class ClientListenThreadPremium extends ClientListenThread
{

    public ClientListenThreadPremium(Socket socket, Client client, JTextField annualField, JTextField monthlyField) {
        super(socket, client, annualField, monthlyField);
    }
    public void run()
    {
        String str = null;
        
            try
            {
                System.out.println("Otrzymalem informacje");
                str = in.readLine();
                System.out.println("Oto ona: " + str);
                double annual = Math.round(2000 * (Integer.parseInt(str)));
                double monthly = Math.round((annual / 12) + 500);
                annual = annual/100;
                monthly = monthly/100;
                
                client.setAnnualPremium(annual + "");
                client.setMonthlyPremium(monthly + "");
                in.close();
                socket.close();
                annualField.setText(client.getAnnualPremium());
                monthlyField.setText(client.getMonthlyPremium());
            }
            catch(IOException ed)
            {
                System.out.println("Blad7: " + ed);
            }
            catch(Exception e)
            {
                System.out.println("Blad1: " + e);
            }
            
        
        
    }
    
}
