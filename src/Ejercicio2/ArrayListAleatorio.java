package Ejercicio2;

import java.util.ArrayList;

public class ArrayListAleatorio {
  public static void main(String[] args) {
    int tamañoLista = (int) (Math.random()*((20 - 10) + 1)+10);
    ArrayList<Integer> arrayAleatorio = new ArrayList<Integer>();
    
    System.out.println("Tamaño del ArrayList: "+tamañoLista);
    for(int i = 0; i<tamañoLista;i++) {
      arrayAleatorio.add((int) (Math.random()*101));
      System.out.println(i+".   "+arrayAleatorio.get(i));
    }
  
  }
}
