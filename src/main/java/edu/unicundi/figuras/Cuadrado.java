/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figuras;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Christian Diaz
 * @author Cristian Medina
 */
public class Cuadrado extends FigurasGeometricas{

    private int lado4;
    private short coordenadaX4;
    private short coordenadaY4;

    
    public Cuadrado() {
    }
    
    public Cuadrado(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }
    
    public Cuadrado(short coordenadaX1, short coordenadaY1, short coordenadaX2, short coordenadaY2, short coordenadaX3, short coordenadaY3) {
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
   

    /**
     * 
     * @return 
     */

    public int getLado4() {
        return lado4;
    }
    /**
     * 
     * @param lado4 
     */

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }
    

    @Override
    public int hallarArea() {
        int area=(this.getLado1()*this.getLado2());
        setArea(area);
        System.out.println("El area del cuadrado es:"+getArea());
        return area;
       
    }

    @Override
    public int hallarPerimetro() {
        int perimetro = (this.getLado1()*2 + this.getLado2()*2);
        setPerimetro(perimetro);
        System.out.println("El perimetro del cuadrado es:"+getPerimetro());
        return perimetro;
      
    }
   
  
    public boolean verificarCuadrado(Cuadrado cuadrado){
        boolean validacion=false;
        if(cuadrado.getLado1()==cuadrado.getLado2() && cuadrado.getLado1()==cuadrado.getLado3() && cuadrado.getLado1() == cuadrado.getLado4() && cuadrado.getLado2()==cuadrado.getLado3() && cuadrado.getLado2()==cuadrado.getLado4() && cuadrado.getLado3()== cuadrado.getLado4()){
            validacion=true;
        }
        return validacion;
    }

    @Override
    public void dibujar(JPanel panel, Graphics g,int [] valores) {
        g.drawLine(valores[0], valores[1], valores[2], valores[3]);
        g.drawLine(valores[2], valores[3], valores[4], valores[5]);
        g.drawLine(valores[4], valores[5], valores[6], valores[7]);
        g.drawLine(valores[6], valores[7], valores[0], valores[1]);
        System.out.println("hola");
        
         //return g;
    }
    
}
