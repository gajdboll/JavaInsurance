package com.mycompany.insurancejava;

/**
 * Klasa przdstawiająca użytkowników mogących się zalogować do programu.
 */
public class User {

    /**
     * pola
     */
    private int id;
    private String userName;
    private String password;

    private static int numer;

    public static int zwieksz_numer() {
        return numer++;
    }

    /**
     * settery i gettery
     *
     *
     */
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

    /**
     * Konstruktory
     */
    public User() {
        this.userName = "admin";
        this.password = "admin";
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.id = zwieksz_numer();
    }

}
