
package com.mycompany.insurancejava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;


public class Clock extends Thread
{

    public JTextField getZegarek() {
        return zegarek;
    }

    private JTextField zegarek;

    public void setZegarek(JTextField zegarek) {
        this.zegarek = zegarek;
    }
  
//konstruktor
    public Clock(JTextField zegarek) {
        this.zegarek = zegarek;
    }

    @Override
    public void run()
    {
        
        while (true)
        {
            LocalDateTime d = LocalDateTime.now();
            String formattedDateTime = d.format(DateTimeFormatter.ofPattern("HH:mm:ss - dd MM yyyy"));
          
            zegarek.setText(formattedDateTime);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
}
