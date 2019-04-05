package Ejercicio8;

import java.util.ArrayList;

public class ArrayListCartas {
  public static void main(String[] args) {
  
    String[] arrayTipo = new String[12];
    arrayTipo[0] = "As"; arrayTipo[1] = "2"; arrayTipo[2] = "3"; arrayTipo[3] = "4";
    arrayTipo[4] = "5"; arrayTipo[5] = "6"; arrayTipo[6] = "7"; arrayTipo[7] = "8";
    arrayTipo[8] = "9"; arrayTipo[9] = "Sota"; arrayTipo[10] = "Caballo"; arrayTipo[11] = "Rey";
    
    String[] arrayPalo = new String[4];
    arrayPalo[0] = "Oros"; arrayPalo[1] = "Copas"; arrayPalo[2] = "Espadas"; 
    arrayPalo[3] = "Bastos"; 
    
    int numTipo; int numPalo; String codigo;
    boolean valido; boolean introducido;
    int longitudArray;
    
    ArrayList<Carta> arrayCartas = new ArrayList<Carta>();
    
    for(int i = 0; i<10; i++) {
      do {
        numTipo = (int) (Math.random()*11);
        numPalo = (int) (Math.random()*3);
        codigo = numPalo+ "-"+numTipo;
        
        valido = true;
        for(int j = 0; j<arrayCartas.size();j++) {
          if(arrayCartas.get(j).getCodigo().equals(codigo)) {
            valido = false;    
          }
        }
      }while(!valido);
      
      Carta carta = new Carta(arrayTipo[numTipo], arrayPalo[numPalo], codigo);
      
      introducido = false;
      longitudArray = arrayCartas.size();
      for(int j = 0;j<longitudArray;j++){
        if(numPalo < arrayCartas.get(j).getCodigo().charAt(0)){
          arrayCartas.add(j, carta);
          introducido = true;
          break;
            }
        }
      }
      if(!introducido) {
        arrayCartas.add(carta);
      }
    }
    
    for(int k = 0; k < arrayCartas.size();k++) {
      System.out.println(k+".  "+arrayCartas.get(k));
    }
  }
  
}
