package com.mycompany.ejercicio3;

public class Lobo extends Canido {
    public Lobo() {
        super("Aullido", "Carnívora", "Bosque", "Canis lupus");
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