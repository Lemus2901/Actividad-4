package com.mycompany.ejercicio3;

public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String hábitat;
    protected String nombreCientífico;

    public Animal(String sonido, String alimentos, String hábitat, String nombreCientífico) {
        this.sonido = sonido;
        this.alimentos = alimentos;
        this.hábitat = hábitat;
        this.nombreCientífico = nombreCientífico;
    }

    public abstract String getNombreCientífico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHábitat();
}