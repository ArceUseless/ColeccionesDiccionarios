package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOrdenado {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner( System.in );
    int num;
    boolean introducido;
    int longitudArray;
    
    ArrayList<Integer> arrayOrdenado = new ArrayList<Integer>();
    
    for(int i = 0; i<10;i++) {
      System.out.println("Introduzca un número. (Índice "+i+")");
      num = scanner.nextInt();
      introducido = false;
      longitudArray = arrayOrdenado.size();
      for(int j = 0;j<longitudArray;j++){
        if(num<arrayOrdenado.get(j)){
          arrayOrdenado.add(j, num);
          introducido = true;
          break;
        }
      }
      if(!introducido) {
        arrayOrdenado.add(num);
      }
    }
    
    for(int i = 0; i<arrayOrdenado.size();i++) {
      System.out.println(i+". "+arrayOrdenado.get(i));
    }
  
  }
}
