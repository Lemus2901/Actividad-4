/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio41;

/**
 *
 * @author pipe
 */
public class Ejercicio41 {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5, "Carnivoro");
        animal.mostrarInfo();
        animal.hacerSonido();
        Perro perro = new Perro("Firulais", 10, "Croquetas", "Pastor Aleman");
        perro.mostrarInfo();
        perro.hacerSonido();
        perro.moverCola();
    }
}
