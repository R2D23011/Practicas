package five;

import java.util.ArrayList;
import java.util.Scanner;

public class Animals {

    public static void showAnimalSound() {
        System.out.println("Buenas, elige un animal del que desees saber el sonido");

        int response = 0;
        do {
            System.out.println("1. Gato");
            System.out.println("2. Perro");
            System.out.println("3. Animales variados");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println(":Elegiste Gato");
                    Gato gato = new Gato("Gato", "MIAU!");
                    gato.emitirSonido();
                    System.out.println("\n\n");
                    break;
                case 2:
                    System.out.println("::Elegiste Perro");
                    Perro perro = new Perro("Perro", "GUAU!");
                    perro.emitirSonido();
                    System.out.println("\n\n");
                    break;
                case 3:
                    animalsvarious();
                case 0:
                    System.out.println("Gracias por intentarlo");
                    break;
                default:
                    System.out.println("Por favor, elige una opcion valida");
            }
        } while (response != 0);
    }

    private static void animalsvarious() {
        System.out.println("::Elegiste");
        System.out.println("::Animales variados");
        System.out.println("Aqui hay otros Animales que puedes probar para saber su sonido");

        int response = 0;
        do {
            System.out.println("1. Tigre");
            System.out.println("2. Gallo");
            System.out.println("3. Burro");
            System.out.println("4. Ardilla");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    VariousAnimals tigre = new VariousAnimals("Tigre", "Grrrr!");
                    System.out.println("::Elegiste " + tigre.getName());
                    tigre.emitirSonido();
                    break;
                case 2:
                    VariousAnimals gallo = new VariousAnimals("Gallo", "Kikiriki");
                    System.out.println("::Elegiste " + gallo.getName());
                    gallo.emitirSonido();
                    break;
                case 3:
                    VariousAnimals burro = new VariousAnimals("Burro", "HIiiihoooo!");
                    System.out.println("Elegiste " + burro.getName());
                    burro.emitirSonido();
                    break;
                case 4:
                    VariousAnimals ardilla = new VariousAnimals("Ardilla", "pppppppp");
                    System.out.println("::Elegiste " + ardilla.getName());
                    ardilla.emitirSonido();
                    break;
                case 0:
                    showAnimalSound();
                    break;
                default:
                    System.out.println("Elija una opcion valida");
            }
        }while(response!=77);
    }
}