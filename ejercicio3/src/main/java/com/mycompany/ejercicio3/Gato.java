package com.mycompany.ejercicio3;

public class Gato extends Felino {
    public Gato() {
        super("Maullido", "Ratones", "Doméstico", "Felis silvestris catus");
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