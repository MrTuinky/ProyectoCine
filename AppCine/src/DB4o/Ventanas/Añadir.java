/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Pelicula;
import Conexiones.Conexion;
import static Ventanas.AMB.labelAP;
import static Ventanas.AMB.labelAS;
import static Ventanas.AMB.labelAnyo;
import static Ventanas.AMB.labelDirector;
import static Ventanas.AMB.labelDuracion;
import static Ventanas.AMB.labelID;
import static Ventanas.AMB.labelTitulo;
import static Ventanas.AMB.labelTituloVentana;
import static Ventanas.AMB.lableTrailer;

/**
 *
 * @author 9fdam07
 */
public class Añadir extends javax.swing.JFrame {

    /**
     * Creates new form añadir
     */
    public Añadir() {
        initComponents();
        
    }
    
    public static void cambiarVentanaPelis(){
            labelTituloVentana.setText("PELÍCULAS");
            labelID.setText("ID Pélicula:");
            labelTitulo.setText("Título:");
            labelAnyo.setText("Año: ");
            labelDirector.setText("Director:");
            labelAP.setText("Actor/a principal:");
            labelAS.setText("Actor/a secundario/a:");
            labelDuracion.setText("Duración:");
            lableTrailer.setText("Trailer");
        }
        
         public static void cambiarVentanaSalas(){
            labelTituloVentana.setText("SALAS");
            labelID.setText("ID Sala:");
            labelTitulo.setText("Capacidad:");
            labelAnyo.setText("Pantalla: ");
            labelDirector.setText("Apertura:");
            labelAP.setText("Horario:");
            labelAS.setText(" ");
            labelDuracion.setText(" ");
            lableTrailer.setText(" ");
            textoAcSe.hide();
            textoDuracion.hide();
            textoTrailer.hide();
        }
         
          public static void cambiarVentanaEmpleadoss(){
            labelTituloVentana.setText("EMPLEADOS");
            labelID.setText("ID Empleado:");
            labelTitulo.setText("Nombre:");
            labelAnyo.setText("Primer apellido: ");
            labelDirector.setText("Segundo apellido:");
            labelAP.setText("Fecha de Nacimiento:");
            labelAS.setText("Fecha de contratación:");
            labelDuracion.setText("Fecha Fin de Contrato:");
            lableTrailer.setText("Nacionalidad: ");
          
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelID = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelAnyo = new javax.swing.JLabel();
        labelDirector = new javax.swing.JLabel();
        labelAP = new javax.swing.JLabel();
        labelAS = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        textoID = new javax.swing.JTextField();
        textoTitulo = new javax.swing.JTextField();
        textoAnyo = new javax.swing.JTextField();
        textoAcPr = new javax.swing.JTextField();
        textoDirector = new javax.swing.JTextField();
        textoDuracion = new javax.swing.JTextField();
        textoAcSe = new javax.swing.JTextField();
        textoTrailer = new javax.swing.JTextField();
        lableTrailer = new javax.swing.JLabel();
        botonAñadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelID.setForeground(new java.awt.Color(255, 0, 0));
        labelID.setText("ID Pelicula:");

        labelTitulo.setForeground(new java.awt.Color(255, 0, 0));
        labelTitulo.setText("Título:");

        labelAnyo.setForeground(new java.awt.Color(255, 0, 0));
        labelAnyo.setText("Año:");

        labelDirector.setForeground(new java.awt.Color(255, 0, 0));
        labelDirector.setText("Director:");

        labelAP.setForeground(new java.awt.Color(255, 0, 0));
        labelAP.setText("Actor Principal");

        labelAS.setForeground(new java.awt.Color(255, 0, 0));
        labelAS.setText("Actor Secundario");

        labelDuracion.setForeground(new java.awt.Color(255, 0, 0));
        labelDuracion.setText("Duración en minutos:");

        lableTrailer.setForeground(new java.awt.Color(255, 0, 0));
        lableTrailer.setText("Trailer:");

        botonAñadir.setText("Añadir");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelID)
                                .addGap(107, 107, 107)
                                .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTitulo)
                                .addGap(130, 130, 130)
                                .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAnyo)
                                .addGap(137, 137, 137)
                                .addComponent(textoAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDirector)
                                .addGap(118, 118, 118)
                                .addComponent(textoDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAP)
                                .addGap(92, 92, 92)
                                .addComponent(textoAcPr, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelAS)
                                .addGap(78, 78, 78)
                                .addComponent(textoAcSe, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDuracion)
                                .addGap(59, 59, 59)
                                .addComponent(textoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lableTrailer)
                                .addGap(126, 126, 126)
                                .addComponent(textoTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(botonAñadir)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelID))
                    .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelTitulo))
                    .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAnyo)
                    .addComponent(textoAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDirector)
                    .addComponent(textoDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAP)
                    .addComponent(textoAcPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAS)
                    .addComponent(textoAcSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDuracion)
                    .addComponent(textoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableTrailer)
                    .addComponent(textoTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(botonAñadir)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
            
        int idPelicula= Integer.parseInt(textoID.getText()) ;
				String titulo= textoTitulo.getText() ; 
				String anyoEstreno= textoAnyo.getText();	 
				String director=textoDirector.getText() ; 
				String actorPrinci=textoAcPr.getText() ; 
				String actorSecun=textoAcSe.getText() ; 
				String duracion=textoDuracion.getText() ; 
				String trailer=textoTrailer.getText() ; 
				
			Pelicula p1= new Pelicula(idPelicula,titulo,anyoEstreno,director,actorPrinci,actorSecun,duracion,trailer);
				Conexion conexion=new Conexion();
				conexion.guardarPelicula(p1);
                                this.hide();
    }//GEN-LAST:event_botonAñadirActionPerformed

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
            java.util.logging.Logger.getLogger(Añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Añadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Añadir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAñadir;
    public static javax.swing.JLabel labelAP;
    public static javax.swing.JLabel labelAS;
    public static javax.swing.JLabel labelAnyo;
    public static javax.swing.JLabel labelDirector;
    public static javax.swing.JLabel labelDuracion;
    public static javax.swing.JLabel labelID;
    public static javax.swing.JLabel labelTitulo;
    public static javax.swing.JLabel lableTrailer;
    private static javax.swing.JTextField textoAcPr;
    private static javax.swing.JTextField textoAcSe;
    private static javax.swing.JTextField textoAnyo;
    private static javax.swing.JTextField textoDirector;
    private static javax.swing.JTextField textoDuracion;
    private static javax.swing.JTextField textoID;
    private static javax.swing.JTextField textoTitulo;
    private static javax.swing.JTextField textoTrailer;
    // End of variables declaration//GEN-END:variables
}
