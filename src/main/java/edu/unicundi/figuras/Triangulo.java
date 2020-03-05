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
public class Triangulo extends FigurasGeometricas{

    public Triangulo(short coordenadaX1, short coordenadaY1, short coordenadaX2, short coordenadaY2, short coordenadaX3, short coordenadaY3) {
        super(coordenadaX1, coordenadaY1, coordenadaX2, coordenadaY2, coordenadaX3, coordenadaY3);
    }

    public Triangulo(short lado1, short lado2, short lado3) {
        super(lado1, lado2, lado3);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
