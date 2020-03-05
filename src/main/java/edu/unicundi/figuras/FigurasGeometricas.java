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
public abstract class FigurasGeometricas implements IOperacionesFiguras,IGraficar{
    
    private short lado1;
    private short lado2;
    private short lado3;

    private short coordenadaX1;
    private short coordenadaY1;
    private short coordenadaX2;
    private short coordenadaY2;
    private short coordenadaX3;
    private short coordenadaY3;

    
    private short area;
    private short perimetro;
    
     public FigurasGeometricas(short lado1, short lado2, short lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

     public FigurasGeometricas(short coordenadaX1, short coordenadaY1, short coordenadaX2, short coordenadaY2, short coordenadaX3, short coordenadaY3) {
        this.coordenadaX1 = coordenadaX1;
        this.coordenadaY1 = coordenadaY1;
        this.coordenadaX2 = coordenadaX2;
        this.coordenadaY2 = coordenadaY2;
        this.coordenadaX3 = coordenadaX3;
        this.coordenadaY3 = coordenadaY3;
    }
    
    
    public short getCoordenadaX1() {
        return coordenadaX1;
    }

    public void setCoordenadaX1(short coordenadaX1) {
        this.coordenadaX1 = coordenadaX1;
    }

    public short getCoordenadaY1() {
        return coordenadaY1;
    }

    public void setCoordenadaY1(short coordenadaY1) {
        this.coordenadaY1 = coordenadaY1;
    }

    public short getCoordenadaX2() {
        return coordenadaX2;
    }

    public void setCoordenadaX2(short coordenadaX2) {
        this.coordenadaX2 = coordenadaX2;
    }

    public short getCoordenadaY2() {
        return coordenadaY2;
    }

    public void setCoordenadaY2(short coordenadaY2) {
        this.coordenadaY2 = coordenadaY2;
    }

    public short getCoordenadaX3() {
        return coordenadaX3;
    }

    public void setCoordenadaX3(short coordenadaX3) {
        this.coordenadaX3 = coordenadaX3;
    }

    public short getCoordenadaY3() {
        return coordenadaY3;
    }

    public void setCoordenadaY3(short coordenadaY3) {
        this.coordenadaY3 = coordenadaY3;
    }
  
    public short getLado1() {
        return lado1;
    }

    public void setLado1(short lado1) {
        this.lado1 = lado1;
    }

    public short getLado2() {
        return lado2;
    }

    public void setLado2(short lado2) {
        this.lado2 = lado2;
    }
     public short getLado3() {
        return lado3;
    }

    public void setLado3(short lado3) {
        this.lado3 = lado3;
    }


    public short getArea() {
        return area;
    }

    public void setArea(short area) {
        this.area = area;
    }

    public short getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(short perimetro) {
        this.perimetro = perimetro;
    }
    
    
}
