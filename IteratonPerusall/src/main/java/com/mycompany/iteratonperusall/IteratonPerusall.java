/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iteratonperusall;

import java.util.Iterator;

/*Practica Perusall patron Iterator
 Explicacion del problema: Tenemos una lista personalisada de empleados de una empresa, nesesitamos recorrer esta lista
 para imprimir los nombres de los empleados, pero no queremos exponer la estructura interna de la lista 
 ni como se almacenan los empleados
  @author Marcos Rojas
 */
public class IteratonPerusall {

    public static void main(String[] args) {
        ListaEmpleados empleadosList = new ListaEmpleados(10);
        empleadosList.add(new Empleado("Alison"));
        empleadosList.add(new Empleado("Roberto"));
        empleadosList.add(new Empleado("Carlos"));

        Iterator<Empleado> iterator = empleadosList.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            System.out.println(empleado.getNombre());
        }
    }
}

