/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singletonpractice;

/**
 *
 * @author Marco
 */
public class Database {
    private static Database instance;
    private String url;
    private String username;
    private String password;

    // Constructor privado para evitar la instanciación externa
    private Database() {
        // Configuración predeterminada (estos valores podrían cargarse de un archivo de configuración)
        this.url = "jdbc:mysql://localhost:3306/mydatabase";
        this.username = "user";
        this.password = "password";
    }

    // Método público estático para obtener la única instancia
    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    // Métodos para obtener la configuración
    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

