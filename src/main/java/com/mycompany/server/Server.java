/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.server;

import java.net.*;
import java.io.*;

/**
 * 
 * Klasa odpowiadająca za serwer, obsługujący wielu klientów jednocześnie
 * przekazując ich strumienie danych do osobnych wątków.
 *
 * @author Bartosz Wasko i Krzysztof Gajdosz
 */
public class Server
{
    
    private static final int portNumber = 12345;
    static Socket socket = null;
    
    
    public static void main(String[] args) throws IOException
    {
        
        ServerSocket socketServer = new ServerSocket(portNumber);
        System.out.println("Starting the server.");
        try
        {
            while(true)
            {
                socket = socketServer.accept();
                System.out.println("There is new client: " + socket );
                
                try
                {
                    new ServerThread(socket).start();
                }
                catch(Exception e)
                {
                    System.out.println("Jest błąd:" + e);
                    System.exit(1);
                    socket.close();
                }
            }
        }        
        finally
        {
            socketServer.close();
        }
        
    }
    
    
    
}
