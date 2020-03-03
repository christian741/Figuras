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
public abstract class FigurasGeometricas implements IOperacionesFiguras{
    
    private short lado1;
    private short lado2;
    private short lado3;
    
    private short area;
    private short perimetro;

    public FigurasGeometricas(short lado1, short lado2, short lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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
