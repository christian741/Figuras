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
public interface IOperacionesFiguras {
    
    public int hallarArea();
    public int hallarPerimetro();
    public void  dibujar(JPanel panel,Graphics g, int [] valores);
    
}
