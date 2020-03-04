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
    
    /**
     * 
     * @param lado1
     * @param lado2
     * @param lado3 
     */

    public Cuadrado(short lado1, short lado2, short lado3) {
        super(lado1, lado2, lado3);
    }

    /**
     * 
     * @return 
     */

    public short getLado4() {
        return lado4;
    }
    /**
     * 
     * @param lado4 
     */

    public void setLado4(short lado4) {
        this.lado4 = lado4;
    }
    

    @Override
    public float hallarArea() {
        short area= (short) (lado1*lado2);
        setArea(area);
        System.out.println("El area del cuadrado es:"+getArea());
        return 0;
       
    }

    @Override
    public float hallarPerimetro() {
        short perimetro = (short) (lado1*2 + lado2*2);
        setPerimetro(perimetro);
        System.out.println("El perimetro del cuadrado es:"+getPerimetro());
        return 0;
      
    }

    public float cambiarColor() {
        return 0;
        
    }
  
    
}
