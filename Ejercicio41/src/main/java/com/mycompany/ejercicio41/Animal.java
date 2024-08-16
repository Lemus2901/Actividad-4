/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio41;

/**
 *
 * @author pipe
 */
public class Animal {
    protected String nombre;
    protected int edad;
    protected String tipo_alimentacion;

    public Animal(String nombre, int edad, String tipo_alimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public void hacerSonido(){
        System.out.println("Haciendo sonido");
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Tipo de alimentación: "+tipo_alimentacion);
    }

    

}
