/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example;

import arbol.Instruccion;
import cup.parser;

import java.io.*;
import java.util.LinkedList;
import java_cup.runtime.Symbol;

import javax.swing.*;


public class IDE extends javax.swing.JFrame {

    /**
     * Creates new form IDE
     */
    public IDE() {
        initComponents();
        outputTextArea.setEditable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCompilar = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btncargar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Interprete De Comandos En  Java");

        inputTextArea.setColumns(20);
        inputTextArea.setRows(5);
        jScrollPane1.setViewportView(inputTextArea);

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane2.setViewportView(outputTextArea);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Salida");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCompilar.setText("Compilar");
        btnCompilar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCompilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompilarMouseClicked(evt);
            }
        });
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCompilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 90, 30));

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEjecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEjecutarMouseClicked(evt);
            }
        });
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 90, 30));

        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 30));

        btncargar.setText("Cargar");
        btncargar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btncargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarActionPerformed(evt);
            }
        });
        jPanel1.add(btncargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 80, 30));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(27, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        inputTextArea.setText("");
        outputTextArea.setText("");
    }

    private void btncargarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                inputTextArea.read(reader, null);
                System.out.println("Archivo cargado exitosamente.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(inputTextArea.getText());
                System.out.println("Archivo guardado exitosamente.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnCompilarMouseClicked(java.awt.event.MouseEvent evt) {

        outputTextArea.setText("");


        PrintStream printStream = new PrintStream(new TextAreaOutputStream(outputTextArea));
        System.setOut(printStream);
        System.setErr(printStream);

        try {

            String codigoFuente = inputTextArea.getText();
            StringReader reader = new StringReader(codigoFuente);


            Lexico lexico = new Lexico(reader);
            parser parser = new parser(lexico);


            Symbol resultado = parser.parse();  // Aquí solo analizamos el código


            System.out.println("Compilación exitosa: No se encontraron errores léxicos o sintácticos.");
        } catch (Exception e) {

            System.out.println("Error durante la compilación: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void btnEjecutarMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        outputTextArea.setText("");

        PrintStream printStream = new PrintStream(new TextAreaOutputStream(outputTextArea));
        System.setOut(printStream);
        System.setErr(printStream); // Opcional: redirigir errores también
        LinkedList<Instruccion> AST_arbolSintaxisAbstracta=null;
        try {


            String codigoFuente = inputTextArea.getText();
            StringReader reader = new StringReader(codigoFuente);

            // Crear una instancia del lexer y parser usando el StringReader
            Lexico lexico = new Lexico(reader);


//            procesarTokens(lexico);

            parser parser = new parser(lexico);

            // Ejecutar el parser
            parser.parse();

            // Si el resultado es una lista de instrucciones, ejecutarlas
            AST_arbolSintaxisAbstracta=parser.getAST();
            for (Instruccion instruccion : AST_arbolSintaxisAbstracta) {
                instruccion.ejecutar();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btncargar;
    private javax.swing.JTextArea inputTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outputTextArea;
    // End of variables declaration
}
