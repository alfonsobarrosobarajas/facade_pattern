/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_pattern;

/**
 *
 * @author alfonso
 */
public class Dibujante {

  
  private Figura circulo;
  private Figura triangulo;
  private Figura cuadrado;

  public Dibujante() {
    
    circulo = new Circulo();
    triangulo = new Triangulo();
    cuadrado = new Cuadrado();
  
  
  }
  
  
  public void dibujarCirculo(){
    circulo.draw();
  }
  
  public void dibujarTriangulo(){
    triangulo.draw();
  }
  
  public void dibujarCuadrado(){
    cuadrado.draw();
  }
  
}
