package Ejercicio8;

public class Carta {
  //Propiedades
  
  String tipoCarta;
  String palo;
  String codigo;
  
  //Constructor
  
  public Carta(String t, String p, String c) {
    this.tipoCarta = t;
    this.palo = p;
    this.codigo = c;
  }
  
  //Getters
  
  public String getCodigo() {
    return this.codigo;
  }
  
  //Métodos
  
  public String toString() {
    return tipoCarta+" de "+palo;
  }

}
