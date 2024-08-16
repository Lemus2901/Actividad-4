package com.mycompany.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes");
        libro.setPrecio(19.99);
        libro.imprimirDetalles();

        LibroDeTexto libroDeTexto = new LibroDeTexto("Matemáticas", "John Doe", "Secundaria");
        libroDeTexto.setPrecio(29.99);
        libroDeTexto.imprimirDetalles();

        LibroDeTextoUN libroDeTextoUN = new LibroDeTextoUN("Física", "Jane Doe", "Universidad", "Facultad de Ciencias");
        libroDeTextoUN.setPrecio(39.99);
        libroDeTextoUN.imprimirDetalles();

        Novela novela = new Novela("1984", "George Orwell", "Ciencia Ficción");
        novela.setPrecio(14.99);
        novela.imprimirDetalles();
    }
}