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
public class Triangulo extends FigurasGeometricas{
    
     public Triangulo() {
    }

    public Triangulo(short coordenadaX1, short coordenadaY1, short coordenadaX2, short coordenadaY2, short coordenadaX3, short coordenadaY3) {
        super(coordenadaX1, coordenadaY1, coordenadaX2, coordenadaY2, coordenadaX3, coordenadaY3);
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        super(lado1, lado2, lado3);
    }

 

    @Override
    public int hallarArea() {
        int area =  (getLado1() * getLado2() / 2);
        setPerimetro(area);
        System.out.println("El area del triangulo es:" + getArea());
        return area;
    }

    @Override
    public int hallarPerimetro() {
        int perimetro=  (getLado1()+getLado2()+getLado3());
        setPerimetro(perimetro);
        System.out.println("El perimetro del triangulo es:"+getPerimetro());
    
        return perimetro;  
    }

   
    
    
     public byte verificarTriangulo(Triangulo triangulo){
        //1= equilatero 2 = isoceles 3=escaleno
        byte tipo=0;
        
        if(triangulo.getLado1()== triangulo.getLado2() && triangulo.getLado1()==triangulo.getLado3() && triangulo.getLado2()==triangulo.getLado3()){
            tipo =1;
        }else{
            if(triangulo.getLado1()== triangulo.getLado2() || triangulo.getLado3()==triangulo.getLado1() && triangulo.getLado2()==triangulo.getLado3()){
                tipo = 2;
            }else{
                tipo=3;
            }
        }
        return tipo;
    }

    @Override
    public  void dibujar(JPanel panel, Graphics g, int [] valores) {
        g.drawLine(valores[0], valores[1], valores[2], valores[3]);
        g.drawLine(valores[2], valores[3], valores[4], valores[5]);
        g.drawLine(valores[4], valores[5], valores[0], valores[1]);
      
         //return g;
    }

    
}
