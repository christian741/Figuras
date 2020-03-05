/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figuras;

/**
 *
 * @author Christian Diaz
 * @author Cristian Medina
 */
public class Rectangulo extends FigurasGeometricas {


    private int lado4;
    
    private short coordenadaX4;
    private short coordenadaY4;
    
     public Rectangulo() {
      
    }

    public Rectangulo(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }

    public Rectangulo(short coordenadaX1, short coordenadaY1, short coordenadaX2, short coordenadaY2, short coordenadaX3, short coordenadaY3) {
        super(coordenadaX1, coordenadaY1, coordenadaX2, coordenadaY2, coordenadaX3, coordenadaY3);
    }
   
    

    public short getCoordenadaX4() {
        return coordenadaX4;
    }

    public void setCoordenadaX4(short coordenadaX4) {
        this.coordenadaX4 = coordenadaX4;
    }

    public short getCoordenadaY4() {
        return coordenadaY4;
    }

    public void setCoordenadaY4(short coordenadaY4) {
        this.coordenadaY4 = coordenadaY4;
    }
  

    public int getLado4() {
        return lado4;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }
    

    @Override
    public int hallarArea() {
        int area = (getLado1() * getLado2());
        setArea(area);
        System.out.println("El area del rectangulo es:"+getArea());
        return area;
    }

    @Override
    public int hallarPerimetro() {
        int perimetro = (this.getLado1() * 2 + this.getLado2() * 2);
        setPerimetro(perimetro);
        System.out.println("El perimetro del rectangulo es:" + getPerimetro());
        return perimetro;
    }

    @Override
    public void cambiarColor() {
    }

     public boolean verificarRectangulo(Rectangulo rectangulo){
         
         boolean validacion = false;
         byte acumulador = 0;
         if (rectangulo.getLado1() == rectangulo.getLado2());
         acumulador++;
         if (rectangulo.getLado1() == rectangulo.getLado3()) {
             acumulador++;
         }
         if (rectangulo.getLado1() == rectangulo.getLado4()) {
             acumulador++;
         }
         if (rectangulo.getLado2() == rectangulo.getLado3()) {
             acumulador++;
         }
         if (rectangulo.getLado2() == rectangulo.getLado4()) {
             acumulador++;
         }
         if(rectangulo.getLado3() == rectangulo.getLado4()){
             acumulador++;
         }
         if(acumulador==2){
             validacion=true;
         }

        return validacion;
    }
   
   
}
