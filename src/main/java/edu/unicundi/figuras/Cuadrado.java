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
public class Cuadrado extends FigurasGeometricas{


    private short lado4;

    public Cuadrado(short lado1, short lado2, short lado3) {
        super(lado1, lado2, lado3);
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