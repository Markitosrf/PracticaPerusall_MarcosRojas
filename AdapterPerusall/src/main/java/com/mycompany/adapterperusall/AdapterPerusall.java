/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapterperusall;

/* Practica Perusall patron Adapter
 Explicacion problema: Tenemos un app que usa una biblioteca externa para la gestion de graficos. Dicha biblioteca 
 incluye una clase "Rectangulo2" con metodo "Dibujar", pero tu ya tienes tu propia clase "Rectangulo1"  que utiliza
 un metodo "Display" para dibujar un rectangulo, quieres usar "Rectangulo1" en la app, que espera una instancia de "Rectangulo2"
 para dibujar el grafico
 @author Marco
 */
public class AdapterPerusall {

    public static void main(String[] args) {
        Rectangulo1 rectangulo1 = new Rectangulo1();
        Rectangulo2 rectangulo2 = new AdapterRectangulo(rectangulo1);
        
        rectangulo2.dibujar(10,20,30,40);
    }
}
