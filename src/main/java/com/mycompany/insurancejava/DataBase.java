
package com.mycompany.insurancejava;

import java.util.ArrayList;
import java.util.List;


public class DataBase 
{
        List<User> listaKlientow;
        
        
        public DataBase()
        {
        listaKlientow = new ArrayList<User>();
        listaKlientow.add(new User());
        
        }
        
        public boolean szukajKLientow(String name)
        {
            for(User e : listaKlientow)
            {
                if (e.getUserName().equals(name))
                {
                    return true;
                }
                else{
                    return false;
                }
                
            }
            return true;
        }
        
        public boolean szukajHasla(String name, String password)
        {
            for(User e : listaKlientow)
            {
                if (e.getUserName().equals(name))
                {
                    if(e.getPassword().equals(password))
                    return true;
                }                               
            }
            return false;
        }
        public void WypiszLIsteUzytkownikow()
        {
            for(User e : listaKlientow)
            {
                System.out.println("Login: " + e.getUserName()+ "\n password:  "+ e.getPassword() + "\n***********************");
            
            }
        }
}
