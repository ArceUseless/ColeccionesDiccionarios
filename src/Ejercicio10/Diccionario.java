package Ejercicio10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
  
  //Funciï¿½n para leer un entero por teclado
  public static int tecladoInt(){
    @SuppressWarnings("resource")
    Scanner teclado = new Scanner( System.in );   
    return teclado.nextInt();
    }
  
  //Funciï¿½n para leer una cadena por teclado
  public static String tecladoString(){
    @SuppressWarnings("resource")
    Scanner teclado = new Scanner( System.in );   
    return teclado.nextLine();
    }
  
  public static void main(String[] args) {
    
    String palabra;
    int opcion;
    String palabraDiccionario;
    int contador = 0;
    int radInt;
    boolean valida = true;
    
    HashMap<String, String> d = new HashMap<String, String>();
    ArrayList<String> dA = new ArrayList<String>();
    int[] repetidos = new int[5];
    
    d.put("Incongruencia", "Incongruence");
    d.put("Discusión", "Discussion");
    d.put("Acostumbrarse", "Get used");
    d.put("Cabecera", "Header");
    d.put("Fuente", "Font");
    d.put("Olas", "Waves");
    d.put("Pilar", "Pillar");
    d.put("Habitar", "Dwell");
    d.put("Orgullo", "Pride");
    d.put("Gris", "Gray");
    d.put("Palíndromo", "Palindrome");
    d.put("Furia", "Rage");
    d.put("Entumecido", "Numb");
    d.put("Galería", "Gallery");
    d.put("Payaso", "Clown");
    d.put("Musgo", "Moss");
    d.put("Oscuridad", "Darkness");
    d.put("Brillar", "Shine");
    d.put("Puro", "Pure");
    d.put("Lingote", "Ingot");
    
    dA.addAll(d.keySet());
    
    do {
      System.out.println("Elige una opción:");
      System.out.println("1. Ver traducción");
      System.out.println("2. Examen");
      opcion = tecladoInt();
       switch(opcion) {
         case 1:
           System.out.println("Introduce una palabra en español.");
           palabra = tecladoString();
           System.out.println(d.get(palabra));
           if (palabra == null) {
             System.out.println("Esta palabra no está en el diccionario.");
           }
           break;
         case 2:
           System.out.println("Vamos a empezar.");
           for(int i = 0; i<5;i++) {
             do {
               valida = true;
               radInt = (int) (Math.random()*20);
               for(int j = 0; j<4;j++) {
                 if(repetidos[j] == radInt) {
                   valida = false;
                 }
               }
             }while(!valida);
             palabraDiccionario = dA.get(radInt);
             repetidos[i] = radInt;
             
             System.out.println("¿Cómo se escribe "+palabraDiccionario+" en inglés?");
             palabra = tecladoString();
             if(palabra.equals(d.get(palabraDiccionario))) {
               contador++;
             }
           }
           
           System.out.println("Has acertado "+contador+" de 5.");
           break;
       }
    }while(opcion == 1 || opcion == 2);   
  }
}
