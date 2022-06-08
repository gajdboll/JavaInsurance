/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Threads;

import com.mycompany.insurancejava.Client;
import java.io.*;
import java.net.*;
import javax.swing.*;


/**
 *
 * @author pre12
 */
//odbiera informacje od servera
public abstract class ClientListenThread extends Thread
{
    BufferedReader in;
    Socket socket;
    Client client;
    JTextField annualField, monthlyField;
    
    public ClientListenThread(Socket socket, Client client, JTextField annualField, JTextField monthlyField)
    {
        this.socket = socket;
        this.client = client;
        this.annualField = annualField;
        this.monthlyField = monthlyField;
        
        try
        {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }
        catch(Exception e)
        {
            System.out.println("Blad: " + e);
        }
    }
    
    
    
}
