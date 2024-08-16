package com.mycompany.ejercicio3;

public class Perro extends Canido {
    public Perro() {
        super("Ladrido", "Carnívora", "Doméstico", "Canis lupus familiaris");
    }

    @Override
    public String getNombreCientífico() {
        return nombreCientífico;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHábitat() {
        return hábitat;
    }
}