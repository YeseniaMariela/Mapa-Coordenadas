import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import mapa.coordenada;

class Main {
  public static void mapa() {
    ArrayList<coordenada> lista = new
    ArrayList<coordenada>();

    int NLados;
    double lati, longi;

    Scanner input = new Scanner(System.in);

    System.out.println
    ("------------------------------------");
    System.out.println("Ingrese el numero de lados del poligono");
    System.out.println
    ("------------------------------------");

    NLados = input.nextInt();

    for(int x = 0; x < NLados; x++) {
      System.out.println("Ingrese el latitud: " + (x + 1));
      lati = input.nextDouble();
      System.out.println("Ingrese la longitud: " + (x + 1));
      longi = input.nextDouble();

      coordenada coorde = new coordenada();
      coorde.latitud = lati;
      coorde.longitud = longi;

      lista.add(x, coorde);

    }

    System.out.println("---------------------");
    System.out.println("El link es: ");
    System.out.println("---------------------");

    System.out.println("https://www.keene.edu/campus/maps/tool/?coordinates=");
    for(int y = 0; y <=NLados; y++) {
      if (y != NLados) {
        System.out.print(lista.get(y).latitud);
        System.out.print("%2C%20");

        System.out.print(lista.get(y).longitud);
        System.out.print("%0A");
    } else {
    System.out.print(lista.get(0).latitud);
    System.out.print("%2C%20");
    System.out.print(lista.get(0).longitud);
    }
  }
}


  public static void main(String[] args) {
    System.out.println("Tarea coordenadas");
    System.out.println("------------------");
    mapa();
    
  }
}
