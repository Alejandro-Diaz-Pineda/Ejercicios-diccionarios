package diccionarios;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class diccionarioRM {
  public static void main(String[] args) {
    // Creamos el diccionario con algunas palabras y sus traducciones
    HashMap<String, String> diccionario = new HashMap<>();
    diccionario.put("casa", "house");
    diccionario.put("perro", "dog");
    diccionario.put("gato", "cat");
    diccionario.put("mesa", "table");
    diccionario.put("silla", "chair");
    diccionario.put("libro", "book");
    diccionario.put("computadora", "computer");
    diccionario.put("papel", "paper");
    diccionario.put("cocina", "kitchen");
    diccionario.put("baño", "bathroom");
    diccionario.put("ventana", "window");
    diccionario.put("puerta", "door");
    diccionario.put("comida", "food");
    diccionario.put("agua", "water");
    diccionario.put("vino", "wine");
    diccionario.put("leche", "milk");
    diccionario.put("pan", "bread");
    diccionario.put("plato", "plate");
    diccionario.put("ardilla", "squirrel");
    diccionario.put("espada", "sword");

    // Creamos un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Creamos un objeto Random para elegir palabras al azar
    Random random = new Random();

    // Contadores para llevar un registro de las respuestas correctas e incorrectas del usuario
    int correctas = 0;
    int incorrectas = 0;

    // Elegimos 5 palabras al azar del diccionario
    for (int i = 0; i < 5; i++) {
      // Obtenemos una palabra al azar del diccionario
      String palabra = (String) diccionario.keySet().toArray()[random.nextInt(diccionario.size())];

      // Pedimos al usuario que escriba la traducción al inglés de la palabra
      System.out.println("Traducción al inglés de la palabra '" + palabra + "':");
      String respuesta = scanner.nextLine();

      // Comprobamos si la respuesta del usuario es correcta
      if (respuesta.equals(diccionario.get(palabra))) {
        // Si la respuesta es correcta, aumentamos el contador de respuestas correctas
        correctas++;
      } else {
        // Si la respuesta es incorrecta, aumentamos el contador de respuestas incorrectas
        incorrectas++;
      }
    }

    // Mostramos al usuario cuántas respuestas correctas e incorrectas tiene
    System.out.println("Respuestas correctas: " + correctas);
    System.out.println("Respuestas incorrectas: " + incorrectas);
  }
}