
package com.mycompany.insurancejava;

import java.util.ArrayList;
import java.util.List;


public class BazaDanych 
{
        List<Uzytkownik> listaKlientow;
        
        
        public BazaDanych()
        {
        listaKlientow = new ArrayList<Uzytkownik>();
        listaKlientow.add(new Uzytkownik());
        
        }
        
        public boolean szukajKLientow(String name)
        {
            for(Uzytkownik e : listaKlientow)
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
            for(Uzytkownik e : listaKlientow)
            {
                if (e.getUserName().equals(name))
                {
                    if(e.getPassword().equals(password))
                    return true;
                }
                else{
                    return false;
                }
                
            }
            return true;
        }
        public void WypiszLIsteUzytkownikow()
        {
            for(Uzytkownik e : listaKlientow)
            {
                System.out.println("Login: " + e.getUserName()+ "\n password:  "+ e.getPassword() + "\n***********************");
            
            }
        }
}
