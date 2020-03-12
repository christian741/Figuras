
package edu.unicundi.figuras;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import sun.security.timestamp.TSResponse;
/**
 *
 * @author ASUS
 */
public class Graficar extends javax.swing.JFrame {

    private IOperacionesFiguras cuadrado=  new Cuadrado();
    private IOperacionesFiguras rectangulo = new Rectangulo();
    private IOperacionesFiguras triangulo =new Triangulo();
    private List<FigurasGeometricas> listFiguras = new ArrayList<>();
   // Dibujo2D dibuj = new Dibujo2D();
   
    
    private void dibujar(){
         int[] valores = new int[8];
            valores = obtenerValores();
            boolean hacer =obtenerLados(valores);
            //g.drawLine(y1, x1, x2, y2);
            if(hacer!=false){
            String categoria = (String) jcomFiguras.getSelectedItem();
            if (categoria.equals("Triangulo")) {

              /* g.drawLine(valores[0], valores[1], valores[2], valores[3]);
                g.drawLine(valores[2], valores[3], valores[4], valores[5]);
                g.drawLine(valores[4], valores[5], valores[0], valores[1]);*/
                
                ((Triangulo)this.triangulo).dibujar(panPlano,panPlano.getGraphics(),valores);
                //guardarCoordenadas(valores);
               
            } else {
                if (categoria.equals("Cuadrado")) {

                  ((Cuadrado)this.cuadrado).dibujar(panPlano,panPlano.getGraphics(),valores);
                    //guardarCoordenadas(valores);

                }
                  if (categoria.equals("Rectangulo")) {

                 ((Rectangulo)this.rectangulo).dibujar(panPlano,panPlano.getGraphics(),valores);
                    //guardarCoordenadas(valores);

                }
                 
               /* g.drawLine(valores[0], valores[1], valores[2], valores[3]);
                g.drawLine(valores[2], valores[3], valores[4], valores[5]);
                g.drawLine(valores[4], valores[5], valores[6], valores[7]);
                g.drawLine(valores[6], valores[7], valores[0], valores[1]);*/
                //guardarCoordenadas(valores);
            }}
            
    }
       
    /*public class Dibujo2D extends JPanel {

      public Dibujo2D() {

        }
        @Override
        public void paintComponent(Graphics g) {
            int[] valores = new int[8];
            valores = obtenerValores();
            obtenerLados(valores);
            //g.drawLine(y1, x1, x2, y2);
            String categoria = (String) jcomFiguras.getSelectedItem();
            if (categoria.equals("Triangulo")) {
                g.drawLine(valores[0], valores[1], valores[2], valores[3]);
                g.drawLine(valores[2], valores[3], valores[4], valores[5]);
                g.drawLine(valores[4], valores[5], valores[0], valores[1]);
               
            } else {
                g.drawLine(valores[0], valores[1], valores[2], valores[3]);
                g.drawLine(valores[2], valores[3], valores[4], valores[5]);
                g.drawLine(valores[4], valores[5], valores[6], valores[7]);
                g.drawLine(valores[6], valores[7], valores[0], valores[1]);
               

            }

        }
    }*/
    private void guardarCoordenadas(int [] valores){
         String categoria = (String) jcomFiguras.getSelectedItem();
        if (categoria.equals("Triangulo")) {
            
          ((FigurasGeometricas)this.triangulo).setCoordenadaX1((short)valores[0]);
          ((FigurasGeometricas)this.triangulo).setCoordenadaY1((short)valores[1]);
          ((FigurasGeometricas)this.triangulo).setCoordenadaX2((short)valores[2]);
          ((FigurasGeometricas)this.triangulo).setCoordenadaY2((short)valores[3]);
          ((Triangulo)this.triangulo).setCoordenadaX3((short)valores[4]);
          ((Triangulo)this.triangulo).setCoordenadaY3((short)valores[5]);
        }
        if (categoria.equals("Cuadrado")) {
          ((FigurasGeometricas)this.cuadrado).setCoordenadaX1((short)valores[0]);
          ((FigurasGeometricas)this.cuadrado).setCoordenadaY1((short)valores[1]);
          ((FigurasGeometricas)this.cuadrado).setCoordenadaX2((short)valores[2]);
          ((FigurasGeometricas)this.cuadrado).setCoordenadaY2((short)valores[3]);
          ((FigurasGeometricas)this.cuadrado).setCoordenadaX3((short)valores[4]);
          ((FigurasGeometricas)this.cuadrado).setCoordenadaY3((short)valores[5]);
          ((Cuadrado)this.cuadrado).setCoordenadaX3((short)valores[6]);
          ((Cuadrado)this.cuadrado).setCoordenadaY3((short)valores[7]);
        }
        if (categoria.equals("Rectangulo")) {

          ((FigurasGeometricas)this.rectangulo).setCoordenadaX1((short)valores[0]);
          ((FigurasGeometricas)this.rectangulo).setCoordenadaY1((short)valores[1]);
          ((FigurasGeometricas)this.rectangulo).setCoordenadaX2((short)valores[2]);
          ((FigurasGeometricas)this.rectangulo).setCoordenadaY2((short)valores[3]);
          ((FigurasGeometricas)this.rectangulo).setCoordenadaX3((short)valores[4]);
          ((FigurasGeometricas)this.rectangulo).setCoordenadaY3((short)valores[5]);
           ((Rectangulo)this.rectangulo).setCoordenadaX3((short)valores[6]);
          ((Rectangulo)this.rectangulo).setCoordenadaY3((short)valores[7]);
        }
        
         
        
    }
     private boolean obtenerLados(int[] arrayEnteros) {

        boolean validacion = false;
        String categoria = (String) jcomFiguras.getSelectedItem();
        int lado1, lado2, lado3, lado4;
        if (categoria.equals("Triangulo")) {
            //lado1 = (x1 - y1) + (y2 - x2)
            lado1 = ((arrayEnteros[0] - arrayEnteros[1]) + (arrayEnteros[3] - arrayEnteros[2]));
            if (lado1 < 0) {
                lado1 = (lado1 * -1);
            }
            // lado2 = (x2 - y2) + (y3 - x3
            lado2 = ((arrayEnteros[2] - arrayEnteros[3]) + (arrayEnteros[5] - arrayEnteros[4]));
            if (lado2 < 0) {
                lado2 = (lado2 * -1);
            }
            // lado3 = (x3 - y3) + (y4 - x4
            lado3 = ((arrayEnteros[4] - arrayEnteros[5]) + (arrayEnteros[7] - arrayEnteros[6]));
            if (lado3 < 0) {
                lado3 = (lado3 * -1);
            }
            ((Triangulo)this.triangulo).setLado1(lado1);
            ((Triangulo)this.triangulo).setLado2(lado2);
            ((Triangulo)this.triangulo).setLado3(lado3);
            byte tipo = ((Triangulo)this.triangulo).verificarTriangulo((Triangulo)this.triangulo);
            if (tipo == 1) {
                //JOptionPane.showMessageDialog(null, "Es un Triangulo Equilatero", "Error", JOptionPane.INFORMATION_MESSAGE);
                validacion = true;
            }
            if (tipo == 2) {
                //JOptionPane.showMessageDialog(null, "Es un Triangulo Isoceles", "Error", JOptionPane.INFORMATION_MESSAGE);
                validacion = true;
            }
            if (tipo == 3) {
                //JOptionPane.showMessageDialog(null, "Es un Triangulo Escaleno", "Error", JOptionPane.INFORMATION_MESSAGE);
                validacion = true;
            }
            // validacion=true;
        } else {
            //lado1 = (x1 - y1) + (y2 - x2)
            lado1 = ((arrayEnteros[0] - arrayEnteros[1]) + (arrayEnteros[3] - arrayEnteros[2]));
            if (lado1 < 0) {
                lado1 = (lado1 * -1);
            }
            // lado2 = (x2 - y2) + (y3 - x3
            lado2 = ((arrayEnteros[2] - arrayEnteros[3]) + (arrayEnteros[5] - arrayEnteros[4]));
            if (lado2 < 0) {
                lado2 = (lado2 * -1);;
            }
            // lado3 = (x3 - y3) + (y4 - x4
            lado3 = ((arrayEnteros[4] - arrayEnteros[5]) + (arrayEnteros[7] - arrayEnteros[6]));
            if (lado3 < 0) {
                lado3 = (lado3 * -1);
            }
            // lado3 = (x3 - y3) + (y4 - x4
            lado4 = ((arrayEnteros[6] - arrayEnteros[7]) + (arrayEnteros[1] - arrayEnteros[0]));
            if (lado4 < 0) {
                lado4 = (lado4 * -1);
            }

            if (categoria.equals("Cuadrado")) {
               ((Cuadrado) cuadrado).setLado1(lado1);
                ((Cuadrado) cuadrado).setLado2(lado2);
                ((Cuadrado) cuadrado).setLado3(lado3);
                ((Cuadrado) cuadrado).setLado4(lado4);
                boolean verdad = ((Cuadrado) cuadrado).verificarCuadrado((Cuadrado) cuadrado);
                if (verdad == true) {
                    validacion = true;
                    //JOptionPane.showMessageDialog(null, "Es un Cuadrado", "Bien", JOptionPane.INFORMATION_MESSAGE);
                    //this.panPlano.repaint();
                } else {
                    //JOptionPane.showMessageDialog(null, "No es un Cuadrado", "Error", JOptionPane.ERROR_MESSAGE);
                    //this.panPlano.repaint();
                    validacion = false;
                }
            }
            if (categoria.equals("Rectangulo")) {
                ((Rectangulo) rectangulo).setLado1(lado1);
                ((Rectangulo) rectangulo).setLado2(lado2);
                ((Rectangulo) rectangulo).setLado3(lado3);
                ((Rectangulo) rectangulo).setLado4(lado4);
                boolean verdad = ((Rectangulo) rectangulo).verificarRectangulo((Rectangulo) rectangulo);
                validacion=true;
               /* if (verdad == true) {
                    //JOptionPane.showMessageDialog(null, "Es un rectangulo", "Error", JOptionPane.INFORMATION_MESSAGE);
                    //this.panPlano.repaint();
                    validacion = true;
                } else {
                    //JOptionPane.showMessageDialog(null, "No es un Cuadrado", "Error", JOptionPane.ERROR_MESSAGE);
                    //this.panPlano.repaint();
                    validacion = false;
                }*/
            }
            
        }
  
         if (validacion != false) {
             aplicarHerencia();
         }
        return validacion;
    }
    private void aplicarHerencia(){
        String categoria = (String) jcomFiguras.getSelectedItem();
        int area=0;
        int perimetro=0;
        System.out.println("entrerererraefae");
        if(categoria.equals("Cuadrado")){
            area=((Cuadrado)cuadrado).hallarArea();
            perimetro=((Cuadrado)cuadrado).hallarPerimetro();
             this.guardarInformacion(cuadrado);
        }
         if(categoria.equals("Rectangulo")){
            area=((Rectangulo)rectangulo).hallarArea();
            perimetro=((Rectangulo)rectangulo).hallarPerimetro();
             this.guardarInformacion(rectangulo);
        }
        if(categoria.equals("Triangulo")){
            System.out.println("teuruerueruer");
            area=((Triangulo)triangulo).hallarArea();
            perimetro=((Triangulo)triangulo).hallarPerimetro();
             this.guardarInformacion(triangulo);
        }
        this.informacionLabels(area, perimetro);
        //this.limpiarMemoria();
       
        
    }
    private void limpiarMemoria(){
        cuadrado = null;
        rectangulo =null;
        triangulo = null;
    }
    private void guardarInformacion(Object obt){
        listFiguras.add((FigurasGeometricas) obt);
        
        for(FigurasGeometricas dato: listFiguras){
            if(dato instanceof Cuadrado ){
                 System.out.println(dato.getPerimetro()+"Cuadrado");
            }
             if(dato instanceof Triangulo ){
                 System.out.println(dato.getPerimetro()+"Triangulo");
            }
              if(dato instanceof Rectangulo ){
                 System.out.println(dato.getPerimetro()+"Rectangulo");
            }
           
        }
        //triangulo = null;
        //cuadrado = null;
        //rectangulo = null; 
    }
    private void informacionLabels(int area, int perimetro) {
        String categoria = (String) jcomFiguras.getSelectedItem();
        if (categoria.equals("Cuadrado")) {
            this.verLabels();
            this.labelVerArea.setText("Cuadrado :"+area);
            this.labelVerPer.setText("Cuadrado :"+perimetro);
        }
        if (categoria.equals("Rectangulo")) {
            this.verLabels();
            this.labelVerArea.setText("Rectangulo :"+area);
            this.labelVerPer.setText("Rectangulo :"+perimetro);
        }
        if (categoria.equals("Triangulo")) {
             this.verLabels();
            this.labelVerArea.setText("Triangulo :"+area);
            this.labelVerPer.setText("Triangulo :"+perimetro);
        }
    }
   
    private int[] obtenerValores() {
        int x1 = 0, x2 = 0, x3 = 0, x4 = 0, y1 = 0, y2 = 0, y3 = 0, y4 = 0;
        int[] arrayEnteros = new int[8];
       

        String categoria = (String) jcomFiguras.getSelectedItem();
        if(categoria.equals("Triangulo")){
            x1 = (int) Double.parseDouble(textX1.getText());
            x2 = (int) Double.parseDouble(textX2.getText());
            y1 = (int) Double.parseDouble(textY1.getText());
            y2 = (int) Double.parseDouble(textY2.getText());

            x3 = (int) Double.parseDouble(textX3.getText());
            //x4 = (int) Double.parseDouble(textX4.getText());
            y3 = (int) Double.parseDouble(textY3.getText());
            //y4 = (int) Double.parseDouble(textY4.getText());
            arrayEnteros[0] = x1;
            arrayEnteros[1] = y1;
            arrayEnteros[2] = x2;
            arrayEnteros[3] = y2;
            arrayEnteros[4] = x3;
            arrayEnteros[5] = y3;
            
           
        } else {
             x1 = (int) Double.parseDouble(textX1.getText());
            x2 = (int) Double.parseDouble(textX2.getText());
            y1 = (int) Double.parseDouble(textY1.getText());
            y2 = (int) Double.parseDouble(textY2.getText());

            x3 = (int) Double.parseDouble(textX3.getText());
            x4 = (int) Double.parseDouble(textX4.getText());
            y3 = (int) Double.parseDouble(textY3.getText());
            y4 = (int) Double.parseDouble(textY4.getText());
            arrayEnteros[0] = x1;
            arrayEnteros[1] = y1;
            arrayEnteros[2] = x2;
            arrayEnteros[3] = y2;
            arrayEnteros[4] = x3;
            arrayEnteros[5] = y3;
            arrayEnteros[6] = x4;
            arrayEnteros[7] = y4;
        }
       

        return arrayEnteros;

    }
    
    
   
    /**
     * Creates new form Graficar
     */
    public Graficar() {
        initComponents();
        vaciarLabels();
        this.add(this.panFormulario,BorderLayout.WEST);
        this.add(this.panTitulo,BorderLayout.NORTH);
        this.add(this.panPlano,BorderLayout.CENTER);
        this.add(this.panDerecha,BorderLayout.EAST);
        this.add(this.panSuelo,BorderLayout.SOUTH);
        this.panDerecha.setBackground(Color.white);
        this.panTitulo.setBackground(Color.BLACK);
        this.panPlano.setBackground(Color.white);
        this.panFormulario.setBackground(Color.GRAY);
        this.panSuelo.setBackground(Color.gray);
        ocultarCajas();
        
    }
    
     private void verLabels(){
        this.labelDatos.setVisible(true);
        this.labelArea.setVisible(true);
        this.labelPerimetro.setVisible(true);
         this.labelArea.setVisible(true);
        this.labelPerimetro.setVisible(true);
        this.labelVerArea.setVisible(true);
        this.labelVerPer.setVisible(true);
    }
    
    private void vaciarLabels(){
        this.labelDatos.setVisible(false);
        this.labelArea.setVisible(false);
        this.labelPerimetro.setVisible(false);
        this.labelVerArea.setVisible(false);
        this.labelVerPer.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        panTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panPlano = new javax.swing.JPanel();
        panFormulario = new javax.swing.JPanel();
        labelCordenada1 = new javax.swing.JLabel();
        labelCordenada2 = new javax.swing.JLabel();
        labelCordenada3 = new javax.swing.JLabel();
        labelCordenada4 = new javax.swing.JLabel();
        textX1 = new javax.swing.JTextField();
        textY1 = new javax.swing.JTextField();
        textX2 = new javax.swing.JTextField();
        textY2 = new javax.swing.JTextField();
        jcomFiguras = new javax.swing.JComboBox();
        textX3 = new javax.swing.JTextField();
        textY3 = new javax.swing.JTextField();
        textX4 = new javax.swing.JTextField();
        textY4 = new javax.swing.JTextField();
        butGraficar = new javax.swing.JButton();
        labelX1 = new javax.swing.JLabel();
        labelY1 = new javax.swing.JLabel();
        labelX2 = new javax.swing.JLabel();
        labelY2 = new javax.swing.JLabel();
        labelX3 = new javax.swing.JLabel();
        labelY3 = new javax.swing.JLabel();
        labelX4 = new javax.swing.JLabel();
        labelY4 = new javax.swing.JLabel();
        labelJcombox = new javax.swing.JLabel();
        panSuelo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panDerecha = new javax.swing.JPanel();
        labelArea = new javax.swing.JLabel();
        labelVerArea = new javax.swing.JLabel();
        labelPerimetro = new javax.swing.JLabel();
        labelVerPer = new javax.swing.JLabel();
        labelDatos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Figuras Con Herencia");

        javax.swing.GroupLayout panTituloLayout = new javax.swing.GroupLayout(panTitulo);
        panTitulo.setLayout(panTituloLayout);
        panTituloLayout.setHorizontalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        panTituloLayout.setVerticalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panTitulo, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout panPlanoLayout = new javax.swing.GroupLayout(panPlano);
        panPlano.setLayout(panPlanoLayout);
        panPlanoLayout.setHorizontalGroup(
            panPlanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        panPlanoLayout.setVerticalGroup(
            panPlanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );

        getContentPane().add(panPlano, java.awt.BorderLayout.PAGE_START);

        labelCordenada1.setText("Cordenada 1:");

        labelCordenada2.setText("Cordenada 2:");

        labelCordenada3.setText("Cordenada 3:");

        labelCordenada4.setText("Cordenada 4:");

        textX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textX1ActionPerformed(evt);
            }
        });

        textY1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textY1ActionPerformed(evt);
            }
        });

        textX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textX2ActionPerformed(evt);
            }
        });

        textY2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textY2ActionPerformed(evt);
            }
        });

        jcomFiguras.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una figura", "Cuadrado", "Rectangulo", "Triangulo", " " }));
        jcomFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomFigurasActionPerformed(evt);
            }
        });

        textY4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textY4ActionPerformed(evt);
            }
        });

        butGraficar.setText("Dibujar");
        butGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butGraficarActionPerformed(evt);
            }
        });

        labelX1.setText("X:");

        labelY1.setText("Y:");

        labelX2.setText("X:");

        labelY2.setText("Y:");

        labelX3.setText("X:");

        labelY3.setText("Y:");

        labelX4.setText("X:");

        labelY4.setText("Y:");

        labelJcombox.setText("Seleccione una Figura");

        javax.swing.GroupLayout panFormularioLayout = new javax.swing.GroupLayout(panFormulario);
        panFormulario.setLayout(panFormularioLayout);
        panFormularioLayout.setHorizontalGroup(
            panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormularioLayout.createSequentialGroup()
                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFormularioLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(butGraficar))
                    .addGroup(panFormularioLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jcomFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelJcombox, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panFormularioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCordenada1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panFormularioLayout.createSequentialGroup()
                                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCordenada4)
                                    .addComponent(labelCordenada3)
                                    .addComponent(labelCordenada2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelX1)
                                    .addComponent(labelY1)
                                    .addComponent(labelX2)
                                    .addComponent(labelY2)
                                    .addComponent(labelX3)
                                    .addComponent(labelY3)
                                    .addComponent(labelX4)
                                    .addComponent(labelY4))
                                .addGap(38, 38, 38)
                                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textX4)
                                    .addComponent(textY3)
                                    .addComponent(textX3)
                                    .addComponent(textY2)
                                    .addComponent(textX2)
                                    .addComponent(textY1)
                                    .addComponent(textX1)
                                    .addComponent(textY4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panFormularioLayout.setVerticalGroup(
            panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelJcombox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcomFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCordenada1)
                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panFormularioLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(labelCordenada2)
                        .addGap(104, 104, 104)
                        .addComponent(labelCordenada3)
                        .addGap(113, 113, 113)
                        .addComponent(labelCordenada4))
                    .addGroup(panFormularioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelX1))
                        .addGap(18, 18, 18)
                        .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelY1))
                        .addGap(40, 40, 40)
                        .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelX2))
                        .addGap(18, 18, 18)
                        .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelY2))
                        .addGap(47, 47, 47)
                        .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textX3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelX3))
                        .addGap(18, 18, 18)
                        .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panFormularioLayout.createSequentialGroup()
                                .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textY3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelY3))
                                .addGap(54, 54, 54)
                                .addComponent(textX4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelX4))
                        .addGap(18, 18, 18)
                        .addGroup(panFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelY4)
                            .addComponent(textY4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addComponent(butGraficar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panFormulario, java.awt.BorderLayout.LINE_START);
        getContentPane().add(panFormulario, java.awt.BorderLayout.EAST);

        jLabel2.setText("Presentado por");

        jLabel1.setText("Chrstian David Diaz");

        jLabel3.setText("Cristian Medina");

        javax.swing.GroupLayout panSueloLayout = new javax.swing.GroupLayout(panSuelo);
        panSuelo.setLayout(panSueloLayout);
        panSueloLayout.setHorizontalGroup(
            panSueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSueloLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addGap(176, 176, 176)
                .addComponent(jLabel1)
                .addGap(180, 180, 180)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panSueloLayout.setVerticalGroup(
            panSueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSueloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(panSuelo, java.awt.BorderLayout.CENTER);

        labelArea.setText("Area:");

        labelVerArea.setText("jLabel4");

        labelPerimetro.setText("Perimetro:");

        labelVerPer.setText("jLabel4");

        labelDatos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDatos.setText("DATOS");

        javax.swing.GroupLayout panDerechaLayout = new javax.swing.GroupLayout(panDerecha);
        panDerecha.setLayout(panDerechaLayout);
        panDerechaLayout.setHorizontalGroup(
            panDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDerechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDerechaLayout.createSequentialGroup()
                        .addGroup(panDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelArea)
                            .addComponent(labelPerimetro))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panDerechaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelVerArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelVerPer, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(panDerechaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panDerechaLayout.setVerticalGroup(
            panDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDerechaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(labelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(labelArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVerArea)
                .addGap(90, 90, 90)
                .addComponent(labelPerimetro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVerPer)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        getContentPane().add(panDerecha, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textX1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textX1ActionPerformed

    private void textY2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textY2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textY2ActionPerformed

    private void textY1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textY1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textY1ActionPerformed

    private void textX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textX2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textX2ActionPerformed

    private void textY4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textY4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textY4ActionPerformed

    private void jcomFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomFigurasActionPerformed

        obtenerDatos();        // TODO add your handling code here:
    }//GEN-LAST:event_jcomFigurasActionPerformed

    private void butGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butGraficarActionPerformed
       dibujar();
        
    }//GEN-LAST:event_butGraficarActionPerformed

   /* private void dibujar() {
        
        dibuj.setBounds(0, 0,1000 , 1000);
        dibuj.setOpaque(false);
        panPlano.add(dibuj);
        panPlano.repaint();
        
       
    }*/
    /*public void  pintarCuadrado(Graphics g){
      //panPlano.setBackground(Color.white);
      g.drawLine(Integer.parseInt(textX1.getText().toString()),Integer.parseInt(textY1.getText().toString()),Integer.parseInt(textX2.getText().toString()),Integer.parseInt(textY2.getText().toString()));
      g.drawLine(Integer.parseInt(textX2.getText().toString()),Integer.parseInt(textY2.getText().toString()),Integer.parseInt(textX3.getText().toString()),Integer.parseInt(textY3.getText().toString()));
     g.drawLine(Integer.parseInt(textX3.getText().toString()),Integer.parseInt(textY3.getText().toString()),Integer.parseInt(textX4.getText().toString()),Integer.parseInt(textY4.getText().toString()));
     g.drawLine(Integer.parseInt(textX4.getText().toString()),Integer.parseInt(textY4.getText().toString()),Integer.parseInt(textX1.getText().toString()),Integer.parseInt(textY1.getText().toString()));
    
      g.dispose();
      super.paintComponents(g);
     
    }*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficar().setVisible(true);
            }
        });
    }
    
    private void obtenerDatos(){
        
        String categoria = (String) jcomFiguras.getSelectedItem();
        if(categoria.equals("Seleccione una figura")){
           JOptionPane.showMessageDialog(null, "Lo sentimos escoja una figura", "Error", JOptionPane.WARNING_MESSAGE);
           ocultarCajas();
        }
        if(categoria.equals("Cuadrado")){
            ocultarCajas();
            verCuadroRectangulo();
        }
         if(categoria.equals("Rectangulo")){
             ocultarCajas();
            verCuadroRectangulo();
        }
        if(categoria.equals("Triangulo")){
            ocultarCajas();
            verTriangulo();
        }
        
    }
    
    private void verTriangulo() {
        
        this.labelCordenada1.setVisible(true);
        this.labelCordenada2.setVisible(true);
        this.labelCordenada3.setVisible(true);
        
        this.labelX1.setVisible(true);this.textX1.setVisible(true);
        this.labelX2.setVisible(true);this.textX2.setVisible(true);
        this.labelX3.setVisible(true);this.textX3.setVisible(true);
      
        this.labelY1.setVisible(true);this.textY1.setVisible(true);
        this.labelY2.setVisible(true);this.textY2.setVisible(true);
        this.labelY3.setVisible(true);this.textY3.setVisible(true);
       
        this.butGraficar.setVisible(true);

    }
    
    private void verCuadroRectangulo() {
        
        this.labelCordenada1.setVisible(true);
        this.labelCordenada2.setVisible(true);
        this.labelCordenada3.setVisible(true);
        this.labelCordenada4.setVisible(true);
 
        this.labelX1.setVisible(true);this.textX1.setVisible(true);
        this.labelX2.setVisible(true);this.textX2.setVisible(true);
        this.labelX3.setVisible(true);this.textX3.setVisible(true);
        this.labelX4.setVisible(true);this.textX4.setVisible(true);
        
        this.labelY1.setVisible(true);this.textY1.setVisible(true);
        this.labelY2.setVisible(true);this.textY2.setVisible(true);
        this.labelY3.setVisible(true);this.textY3.setVisible(true);
        this.labelY4.setVisible(true);this.textY4.setVisible(true);
        
        this.butGraficar.setVisible(true);

    }
    
    private void ocultarCajas() {
        
        this.labelCordenada1.setVisible(false);
        this.labelCordenada2.setVisible(false);
        this.labelCordenada3.setVisible(false);
        this.labelCordenada4.setVisible(false);
 
        this.labelX1.setVisible(false);this.textX1.setVisible(false);
        this.labelX2.setVisible(false);this.textX2.setVisible(false);
        this.labelX3.setVisible(false);this.textX3.setVisible(false);
        this.labelX4.setVisible(false);this.textX4.setVisible(false);
        
        this.labelY1.setVisible(false);this.textY1.setVisible(false);
        this.labelY2.setVisible(false);this.textY2.setVisible(false);
        this.labelY3.setVisible(false);this.textY3.setVisible(false);
        this.labelY4.setVisible(false);this.textY4.setVisible(false);
        
        this.butGraficar.setVisible(false);
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butGraficar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JComboBox jcomFiguras;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelCordenada1;
    private javax.swing.JLabel labelCordenada2;
    private javax.swing.JLabel labelCordenada3;
    private javax.swing.JLabel labelCordenada4;
    private javax.swing.JLabel labelDatos;
    private javax.swing.JLabel labelJcombox;
    private javax.swing.JLabel labelPerimetro;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVerArea;
    private javax.swing.JLabel labelVerPer;
    private javax.swing.JLabel labelX1;
    private javax.swing.JLabel labelX2;
    private javax.swing.JLabel labelX3;
    private javax.swing.JLabel labelX4;
    private javax.swing.JLabel labelY1;
    private javax.swing.JLabel labelY2;
    private javax.swing.JLabel labelY3;
    private javax.swing.JLabel labelY4;
    private javax.swing.JPanel panDerecha;
    private javax.swing.JPanel panFormulario;
    private javax.swing.JPanel panPlano;
    private javax.swing.JPanel panSuelo;
    private javax.swing.JPanel panTitulo;
    private javax.swing.JTextField textX1;
    private javax.swing.JTextField textX2;
    private javax.swing.JTextField textX3;
    private javax.swing.JTextField textX4;
    private javax.swing.JTextField textY1;
    private javax.swing.JTextField textY2;
    private javax.swing.JTextField textY3;
    private javax.swing.JTextField textY4;
    // End of variables declaration//GEN-END:variables
}
