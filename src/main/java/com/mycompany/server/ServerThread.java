/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.server;

import java.net.*;
import java.io.*;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * Klasa wątkowalna obsługująca komunikację po stronie serwera.
 * Zawiera funkcję CalculateInsurance()
 * @author Bartosz Wasko i Krzysztof Gajdosz
 */

public class ServerThread extends Thread
{
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    
    public ServerThread(Socket s)
    {
        System.out.println("Konstruktor watku serwera"); 
        socket = s;
        try
        {
            in = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            out = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(
                            socket.getOutputStream())),true);
        }
        catch(Exception e)
        {
            System.out.println("Jest błąd6: " + e);
        }        
    }
    /**
     * Funkcja fomatująca odebrane dane oraz przekazująca je do funkcji wyliczającej w klasie Calculation.
     * @param info
     * @return 
     */
    public int CalculateInsurance(String info)
    {
        String[] lista = info.split(";");
        String[] lista2 = lista[0].split("/");
        int age = 2022 - Integer.parseInt(lista2[2]);
        //0- Date of Birth
        //1 - Class,
        //2 - Cover,
        //3 - Claim, 
        //4 - Mileage;
        return new Calculation(age, lista[1], 
                lista[2], lista[3], lista[4]).CalculateRate();
    }
    
    public void run()
    {
        try
        {
            String kolejna = "";
            String str = "";
            str = in.readLine();
            System.out.println("End of downloading data");
            int discount = CalculateInsurance(str);
            //tu bedzie wyslanie info zwrotnej do klienta;
            out.println(discount+"");
            System.out.println("Zniżka: " + discount);

        }
        catch(Exception e)
        {
            System.out.println("Jest błąd5: " + e);
        }   
    }
    
    
}
