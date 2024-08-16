/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio41;

/**
 *
 * @author pipe
 */
public class Perro extends Animal {
    private String raza;
    public Perro(String nombre, int edad, String tipo_alimentacion, String raza) {
        super(nombre, edad, tipo_alimentacion);
        this.raza = raza;
    }
    @Override
    public void hacerSonido(){
        System.out.println("Guau guau");
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Raza: "+raza);
    }
    public void moverCola(){
        System.out.println("Moviendo la cola");
    }
    
}
