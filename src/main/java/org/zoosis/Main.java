package org.zoosis;


import org.zoosis.animales.Gato;
import org.zoosis.animales.Paloma;
import org.zoosis.animales.Perro;
import org.zoosis.general.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        banner();
        List<Animal> listAnimales = new ArrayList<>();
        System.out.println();
        Animal perro = new Perro("Missy", 2, 4, "Macho");
        Animal gato = new Gato("Michi", 1, 2, "Macho");
        Animal paloma = new Paloma("Mitra", 2, 1.1, "Macho");

        listAnimales.add(perro);
        listAnimales.add(gato);
        listAnimales.add(paloma);
        System.out.println("");
        System.out.println("****** Datos ******");
        listAnimales.forEach(System.out::println);

        System.out.println("");
        System.out.println("****** Sonidos ******");
        listAnimales.forEach(Animal::sonidoEmite);
    }

    private static void banner() {
        System.out.println("*****************************************");
        System.out.println("*                                       *");
        System.out.println("*          SISTEMA DE ZOOLÓGICO         *");
        System.out.println("*                                       *");
        System.out.println("*****************************************");
    }
}