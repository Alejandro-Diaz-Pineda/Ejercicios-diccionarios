package diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class diccionarioES {

	public static void main(String[] args) {
		
		// Creamos el diccionario como un objeto HashMap
	    HashMap<String, String> diccionario = new HashMap<>();

	    // Agregamos algunas palabras al diccionario
	    diccionario.put("casa", "house");
	    diccionario.put("perro", "dog");
	    diccionario.put("gato", "cat");
	    diccionario.put("mesa", "table");
	    diccionario.put("silla", "chair");
	    diccionario.put("libro", "book");
	    diccionario.put("ordenador", "computer");
	    diccionario.put("universidad", "university");
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
	    diccionario.put("tenedor", "fork");
	    diccionario.put("cuchillo", "knife");
	 // Creamos un escáner para leer la entrada del usuario
	    Scanner usuario = new Scanner(System.in);

	    System.out.println("Ingresa una palabra en español: ");
	    String palabra = usuario.nextLine();

	    // Revisamos si la palabra está en el diccionario
	    if (diccionario.containsKey(palabra)) {
	      // Si está, mostramos su traducción
	      System.out.println("La traducción es: " + diccionario.get(palabra));
	    } 
	    else {
	      // Si no está, mostramos un mensaje
	      System.out.println("Lo siento, no encontramos una traducción para esa palabra.");
	    }
	  }
	
	}
