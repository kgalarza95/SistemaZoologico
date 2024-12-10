package org.zoosis.model.animales;

import org.zoosis.model.animales.general.Animal;

public class Perro extends Animal {

    public final static String TIPO ="Perro";

    public Perro() {
    }

    public Perro(String nombre, int edad, double peso, String genero) {
        super(nombre, edad, peso, genero);
    }

    @Override
    public void sonidoEmite() {
        System.out.println(TIPO+" "+"Guau, guau");
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
