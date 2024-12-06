package org.zoosis.animales;

import org.zoosis.general.Animal;

public class Gato extends Animal {

    public final static String TIPO ="Gato";

    public Gato() {
    }

    public Gato(String nombre, int edad, double peso, String genero) {
        super(nombre, edad, peso, genero);
    }

    @Override
    public void sonidoEmite() {
        System.out.println(TIPO+" "+"Miau, miau");
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
