/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapterperusall;

/**
 *
 * @author Marco
 */
public class AdapterRectangulo implements Rectangulo2 {
    private Rectangulo1 rectangulo1;
    
    public AdapterRectangulo(Rectangulo1 rectangulo1){
        this.rectangulo1 = rectangulo1;
    }

    @Override
    public void dibujar(int x, int y, int ancho, int altura) {
       int x1 = x;
       int y1 = y;
       int x2 = x + ancho;
       int y2 = y + altura;
       rectangulo1.display(x1, y1, x2, y2);
    }
    
}
