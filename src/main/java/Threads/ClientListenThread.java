package Threads;

import com.mycompany.insurancejava.Client;
import java.io.*;
import java.net.*;
import javax.swing.*;

/**
 *Klasa abstrakcyjna, która odbiera informacje od serwera.

 * @author Bartosz Wasko i Krzysztof Gajdosz
 */
public abstract class ClientListenThread extends Thread {

    BufferedReader in;
    Socket socket;
    Client client;
    JTextField annualField, monthlyField;

    /**
     * Konstruktor
     *
     * @param socket
     * @param client
     * @param annualField
     * @param monthlyField
     */
    public ClientListenThread(Socket socket, Client client, JTextField annualField, JTextField monthlyField) {
        this.socket = socket;
        this.client = client;
        this.annualField = annualField;
        this.monthlyField = monthlyField;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (Exception e) {
            System.out.println("Blad: " + e);
        }
    }

}
