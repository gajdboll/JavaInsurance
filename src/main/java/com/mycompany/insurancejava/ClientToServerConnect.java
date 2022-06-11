/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insurancejava;

import Threads.ClientListenThreadPremium;
import Threads.ClientListenThreadMultiple;
import java.io.*;
import java.net.*;
import javax.swing.JTextField;


/**
 * Klasa wykorzystywana do tworzenia nowych połączeń klient-serwer od strony klienta.
 * Określa operacje wykonywane od strony klienta w nawiązanym już połączeniu.
 * 
 *  * @author Bartosz Wasko i Krzysztof Gajdosz
 */
public class ClientToServerConnect
{
    PrintWriter out;
    int serverPort = 12345; //w serwerze ma być taki sam port
    String serverAddress = "127.0.0.1"; //jeśli testujesz w sieci zmień to
    InetAddress iAddress = null;
    Socket socket = null;
    Client client;
    JTextField annualField, monthlyField;
    boolean isMultiple;

    public ClientToServerConnect(Client client, JTextField annualField, JTextField monthlyField, boolean isMultiple) {
        this.client = client;
        this.annualField = annualField;
        this.monthlyField = monthlyField;
        this.isMultiple = isMultiple;
    }
    
    public void connect()
    {
        try
        {
            iAddress = InetAddress.getByName(serverAddress);
            System.out.println("Łączę się z serwerem = " + iAddress);
            socket = new Socket(iAddress, serverPort);
        }
        catch(Exception e)
        {
            System.out.println("Wystąpił błąd4: " + e);
        }
        if(isMultiple) 
            new ClientListenThreadMultiple(socket, client, annualField, monthlyField).start();
        else 
            new ClientListenThreadPremium(socket, client, annualField, monthlyField).start();
        try
        {
            out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream())), true);
        }
        
        catch(Exception e)
        {
            System.out.println("Blad2: "+ e);
        }
        Send();
        
    }
    /**
     * Wysyła sformatowany w odpowiedni sposób tekst do serwera, 
     * a on na jego podstawie wylicza zniżkę.
     */
    public void Send()
    {
        out.println(client.toStringDoWyslania());
    }
    
    
}
