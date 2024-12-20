package org.zoosis;


import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.zoosis.model.animales.Gato;
import org.zoosis.model.animales.Paloma;
import org.zoosis.model.animales.Perro;
import org.zoosis.model.animales.general.Animal;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        initServer();

//        ejemploRapid();
//        menu();
    }

    public static void initServer() throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/api/hello", new HelloHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Server started on port 8000");
    }

    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = "Hello World!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    private static void ejemploRapid() {
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

    private static void menu() {
        banner();
        List<Animal> listAnimales = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Ingresar un Perro");
            System.out.println("2. Ingresar un Gato");
            System.out.println("3. Ingresar una Paloma");
            System.out.println("4. Mostrar Datos de los Animales");
            System.out.println("5. Mostrar Sonidos de los Animales");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("tipo "+Perro.TIPO);
                    listAnimales.add(crearPerro(scanner));
                    break;
                case 2:
                    listAnimales.add(crearGato(scanner));
                    break;
                case 3:
                    listAnimales.add(crearPaloma(scanner));
                    break;
                case 4:
                    System.out.println("\n****** Datos ******");
                    listAnimales.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("\n****** Sonidos ******");
                    listAnimales.forEach(Animal::sonidoEmite);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static Animal crearPerro(Scanner scanner) {
        System.out.println("\n--- Ingresar Perro ---");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Género: ");
        String genero = scanner.next();
        return new Perro(nombre, edad, peso, genero);
    }

    private static Animal crearGato(Scanner scanner) {
        System.out.println("\n--- Ingresar Gato ---");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Género: ");
        String genero = scanner.next();
        return new Gato(nombre, edad, peso, genero);
    }

    private static Animal crearPaloma(Scanner scanner) {
        System.out.println("\n--- Ingresar Paloma ---");
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Género: ");
        String genero = scanner.next();
        return new Paloma(nombre, edad, peso, genero);
    }

}