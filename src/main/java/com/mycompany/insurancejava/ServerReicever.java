/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insurancejava;

import java.net.*;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author pre12
 */
public class ServerReicever extends Thread
{
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    
    public ServerReicever(Socket s)
    {
        System.out.println("Konstruktor watku serwera"); 
        socket = s;
        try
        {
            in = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            out = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(
                            socket.getOutputStream())));
        }
        catch(Exception e)
        {
            System.out.println("Jest błąd: " + e);
        }        
    }
    
    public int CalculateInsurance(String info)
    {
        String[] lista = info.split(";");
        //0 - Name, 1 - Address, 2 - Post Code, 3 - Tel no., 4 - Date of Birth
        //5 - Age, 6 - Claim, 7 - Cover, 8 - Class, 9 - Over 6000 Mileage
        return new Calculation(Integer.parseInt(lista[5]), 
                lista[8].charAt(0),
                lista[6].charAt(0) , 
                lista[9].charAt(0), 
                lista[7].charAt(0))
                .CalculateRate();
    }
    
    public void run()
    {
        try
        {
            String kolejna = "";
            String str = "";
            while((kolejna = in.readLine()).isEmpty())
            {
                str = str + "\n" + kolejna;
                kolejna = "";
            }
            System.out.println(str);
            System.out.println("End of downloading data");
            int discount = CalculateInsurance(str);
            //tu bedzie wyslanie info zwrotnej do klienta;
            out.println(discount+"");
            in.close();
            out.close();
            socket.close();
        }
        catch(Exception e)
        {
            System.out.println("Jest błąd: " + e);
        }   
    }
    
    
}
