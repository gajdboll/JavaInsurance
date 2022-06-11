package DataBase;

import com.mycompany.insurancejava.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Baza użytkowników posiadających dostęp do programu klienckiego.
 * @version Version 1.0
 * @author Bartosz Wasko i Krzysztof Gajdosz
 */
public class DataBase {

    List<User> listaKlientow;

    public List<User> getListaKlientow() {
        return listaKlientow;
    }
    //konstruktor
    public DataBase() {
        listaKlientow = new ArrayList<User>();
        listaKlientow.add(new User());
    }
/**
 * 
 * @param name String name - przyjmuje imiona użytkownika
 * @return zwraca True lub False w zależności od występowania imienia w bazie
 */
    public boolean szukajKLientow(String name) {
        for (User e : listaKlientow) {
            if (e.getUserName().equals(name)) 
            {
                return true;
            }
        }
        return false;
    }
/**
 * 
 * @param name String name - przyjmuje imię użytkownika
 * @param password String password - przyjmuje hasło użytkownika
 * @return zwraca True o ile imię i hasło jest w bazie. w przeciwnym razie False
 */
    public boolean szukajHasla(String name, String password) {
        for (User e : listaKlientow) {
            if (e.getUserName().equals(name)) {
                if (e.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
/**
 * Metoda wypisująca użytkowników znajdujących się w bazie.
 */
    public void WypiszLIsteUzytkownikow() {
        for (User e : listaKlientow) {
            System.out.println("Login: " + e.getUserName() + "\n password:  " + e.getPassword() + "\n***********************");

        }
    }
}
