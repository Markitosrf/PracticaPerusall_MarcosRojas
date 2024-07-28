/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletonpractice;

/*Practica perusall con patron singleton
  Explicacion del problema: se desarrolla una aplicacion, esta ocupa una config global como la conf de 
  base de datos, si se permite que se creen muchas instancias, esto podria traer inconsistencias y problemas
  para sincronizar, para solucionar esto queremos que solo haya solo una instancia del la clase configuracion en la app
  @author Marcos Rojas
 */
public class SingletonPractice {

    public static void main(String[] args) {
        // Obtener la instancia única de DatabaseConfig
        Database config = Database.getInstance();

        // Usar la configuración
        System.out.println("Database URL: " + config.getUrl());
        System.out.println("Username: " + config.getUsername());
        System.out.println("Password: " + config.getPassword());

        // Intentar obtener otra instancia devolverá la misma instancia
        Database anotherConfig = Database.getInstance();
        System.out.println("Are both instances the same? " + (config == anotherConfig));
    }
}

