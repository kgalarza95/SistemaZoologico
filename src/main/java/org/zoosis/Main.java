package org.zoosis;


import org.zoosis.animales.Gato;
import org.zoosis.animales.Paloma;
import org.zoosis.animales.Perro;
import org.zoosis.general.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> listAnimales = new ArrayList<>();

        Animal perro = new Perro("Missy", 2, 4, "Macho");
        Animal gato = new Gato("Michi", 1, 2, "Macho");
        Animal paloma = new Paloma("Mitra", 2, 1.1, "Macho");

        listAnimales.add(perro);
        listAnimales.add(gato);
        listAnimales.add(paloma);

        listAnimales.forEach(System.out::println);
    }
}