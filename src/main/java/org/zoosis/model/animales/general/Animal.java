package org.zoosis.model.animales.general;

public abstract class Animal {

    private String nombre;
    private int edad;
    private double peso;
    private String genero;

    public Animal() {
    }

    public Animal(String nombre, int edad, double peso, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public abstract void sonidoEmite();

    public abstract void tipoAnimal();

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }
}
