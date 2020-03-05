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


    private short lado4;
    
    private short coordenadaX4;
    private short coordenadaY4;

    public Rectangulo(short lado1, short lado2, short lado3) {
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
  

    public short getLado4() {
        return lado4;
    }

    public void setLado4(short lado4) {
        this.lado4 = lado4;
    }
    

    @Override
    public float hallarArea() {
        return 0;
    }

    @Override
    public float hallarPerimetro() {
        return 0;
    }

    @Override
    public void cambiarColor() {
    }

    
   
   
}
