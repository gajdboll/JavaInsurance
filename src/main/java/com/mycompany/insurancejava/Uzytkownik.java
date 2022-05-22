
package com.mycompany.insurancejava;


public class Uzytkownik 
{
private int id;
private String userName;
private String password;

private static int numer;

public static int zwieksz_numer()
{
return numer++;
}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Uzytkownik() 
    {
        this.userName = "admin";
        this.password = "admin";
    }

    public Uzytkownik(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.id = zwieksz_numer();
    }



}
