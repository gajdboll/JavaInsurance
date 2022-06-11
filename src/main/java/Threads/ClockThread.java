package Threads;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
/**
 * Klasa wątkowalna, będąca zegarkiem w głównym oknie programu.
 *
 * @author Bartosz Wasko i Krzysztof Gajdosz
 */
public class ClockThread extends Thread {

    /**
     *pole wykorzystane przez klase Clock
     * @return
     */
    private JTextField zegarek;

    public JTextField getZegarek() {
        return zegarek;
    }

    public void setZegarek(JTextField zegarek) {
        this.zegarek = zegarek;
    }

    //konstruktor
    public ClockThread(JTextField zegarek) {
        this.zegarek = zegarek;
    }
/**
 * metoda run tworzy nowy wątek i wypisuje datę w dolnej częsci (footer) głównego programu GUI.
 */
    @Override
    public void run() {

        while (true) {
            LocalDateTime d = LocalDateTime.now();
            String formattedDateTime = d.format(DateTimeFormatter.ofPattern("HH:mm:ss - dd MM yyyy"));

            zegarek.setText(formattedDateTime);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
