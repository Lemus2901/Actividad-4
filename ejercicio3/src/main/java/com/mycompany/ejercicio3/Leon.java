package com.mycompany.ejercicio3;

public class Leon extends Felino {
    public Leon() {
        super("Rugido", "Carnívora", "Pradera", "Panthera leo");
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