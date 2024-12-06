package org.zoosis.animales;

import org.zoosis.general.Animal;

public class Perro extends Animal {

    public final static String TIPO ="Perro";

    public Perro() {
    }

    public Perro(String nombre, int edad, double peso, String genero) {
        super(nombre, edad, peso, genero);
    }

    @Override
    public void sonidoEmite() {
        System.out.println("Guau, guau");
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Tipo: "+TIPO);
    }

    @Override
    public String toString() {
        return TIPO+" "+super.toString();
    }
}
