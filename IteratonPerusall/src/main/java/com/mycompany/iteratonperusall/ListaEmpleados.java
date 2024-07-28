/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iteratonperusall;

/**
 *
 * @author Marco
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaEmpleados implements Iterable<Empleado> {
    private Empleado[] empleados;
    private int size;

    public ListaEmpleados(int capacidad) {
        empleados = new Empleado[capacidad];
        size = 0;
    }

    public void add(Empleado empleado) {
        if (size >= empleados.length) {
            throw new IllegalStateException("La lista esta llena");
        }
        empleados[size++] = empleado;
    }

    @Override
    public Iterator<Empleado> iterator() {
        return new EmpleadoIterator();
    }

    private class EmpleadoIterator implements Iterator<Empleado> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Empleado next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return empleados[index++];
        }
    }
}

