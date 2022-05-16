/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insurancejava;

import java.net.*;
import java.io.*;

/**
 *
 * @author pre12
 */
public class Server
{
    private ServerSocket socketServer;
    private static final int portNumber = 12345;
    static Socket socket = null;
    
    
    public Server()
    {
        try
        {
            socketServer = new ServerSocket(portNumber);
            System.out.println("Starting the server.");
            while(true)
            {
                socket = socketServer.accept();
                System.out.println("There is new client: " + socket );
                ServerReicever thread = new ServerReicever(socket);
                thread.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Jest błąd:" + e);
            System.exit(1);
        }
    }
    
    public void d
    
    
}
