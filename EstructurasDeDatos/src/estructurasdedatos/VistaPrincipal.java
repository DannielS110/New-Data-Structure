package estructurasdedatos;

import javax.swing.JFrame;

public class VistaPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnArbolSimple = new javax.swing.JButton();
        btnArbolRN = new javax.swing.JButton();
        btnArbolAVL = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnListasEnlazadas = new javax.swing.JButton();
        btnListasDobleEnlazadas = new javax.swing.JButton();
        ListaCircular = new javax.swing.JButton();
        ListaDobleCircular = new javax.swing.JButton();
        btnGrafo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ÁRBOLES");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTRUCTURAS DE DATOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 47));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Realizado por: Daniel Sánchez y Alexis Roman");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        btnArbolSimple.setBackground(new java.awt.Color(0, 204, 102));
        btnArbolSimple.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnArbolSimple.setForeground(new java.awt.Color(255, 255, 255));
        btnArbolSimple.setText("Árbol simple");
        btnArbolSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolSimpleActionPerformed(evt);
            }
        });
        jPanel1.add(btnArbolSimple, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, -1));

        btnArbolRN.setBackground(new java.awt.Color(0, 204, 102));
        btnArbolRN.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnArbolRN.setForeground(new java.awt.Color(255, 255, 255));
        btnArbolRN.setText("Árbol Rojo y Negro");
        btnArbolRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolRNActionPerformed(evt);
            }
        });
        jPanel1.add(btnArbolRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        btnArbolAVL.setBackground(new java.awt.Color(0, 204, 102));
        btnArbolAVL.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnArbolAVL.setForeground(new java.awt.Color(255, 255, 255));
        btnArbolAVL.setText("Árbol  AVL");
        btnArbolAVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolAVLActionPerformed(evt);
            }
        });
        jPanel1.add(btnArbolAVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 180, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        btnListasEnlazadas.setBackground(new java.awt.Color(0, 204, 102));
        btnListasEnlazadas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnListasEnlazadas.setForeground(new java.awt.Color(255, 255, 255));
        btnListasEnlazadas.setText("Listas enlazadas");
        btnListasEnlazadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListasEnlazadasActionPerformed(evt);
            }
        });
        jPanel1.add(btnListasEnlazadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 180, -1));

        btnListasDobleEnlazadas.setBackground(new java.awt.Color(0, 204, 102));
        btnListasDobleEnlazadas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnListasDobleEnlazadas.setForeground(new java.awt.Color(255, 255, 255));
        btnListasDobleEnlazadas.setText("Listas doblemente enlazadas");
        btnListasDobleEnlazadas.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnListasDobleEnlazadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListasDobleEnlazadasActionPerformed(evt);
            }
        });
        jPanel1.add(btnListasDobleEnlazadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 260, 30));

        ListaCircular.setBackground(new java.awt.Color(0, 204, 102));
        ListaCircular.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ListaCircular.setForeground(new java.awt.Color(255, 255, 255));
        ListaCircular.setText("Lista circular");
        ListaCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaCircularActionPerformed(evt);
            }
        });
        jPanel1.add(ListaCircular, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 180, -1));

        ListaDobleCircular.setBackground(new java.awt.Color(0, 204, 102));
        ListaDobleCircular.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ListaDobleCircular.setForeground(new java.awt.Color(255, 255, 255));
        ListaDobleCircular.setText("Lista doblemente circular");
        ListaDobleCircular.setHideActionText(true);
        ListaDobleCircular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaDobleCircularActionPerformed(evt);
            }
        });
        jPanel1.add(ListaDobleCircular, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 230, 30));

        btnGrafo.setBackground(new java.awt.Color(0, 204, 102));
        btnGrafo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGrafo.setForeground(new java.awt.Color(255, 255, 255));
        btnGrafo.setText("Grafo");
        btnGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrafoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 180, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Listas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(272, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(250, 250, 250))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 600, 40));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Grafos y Arboles");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnArbolSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolSimpleActionPerformed
        // Cerrar el JFrame actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        // Crear y mostrar el nuevo JFrame con VistaArbolSimple
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Árbol Simple");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaArbolSimple());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnArbolSimpleActionPerformed

    private void btnArbolRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolRNActionPerformed
        // Cerrar el JFrame actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        // Crear y mostrar el nuevo JFrame con VistaArbolSimple
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Árbol Rojo y Negro");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaArbolRN());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnArbolRNActionPerformed

    private void btnArbolAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolAVLActionPerformed
        // Cerrar el JFrame actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        // Crear y mostrar el nuevo JFrame con VistaArbolSimple
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Árbol AVL");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaArbolAVL());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnArbolAVLActionPerformed

    private void btnListasEnlazadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListasEnlazadasActionPerformed
        // Cerrar el JFrame actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        // Crear y mostrar el nuevo JFrame con VistaArbolSimple
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Lista Enlazada");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaListaEnlazada());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnListasEnlazadasActionPerformed

    private void btnListasDobleEnlazadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListasDobleEnlazadasActionPerformed
        // Cerrar el JFrame actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        // Crear y mostrar el nuevo JFrame con VistaArbolSimple
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Lista Doblemente Enlazada");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaListaDoblementeEnlazada());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnListasDobleEnlazadasActionPerformed

    private void ListaCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaCircularActionPerformed
        // Cerrar el JFrame actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        // Crear y mostrar el nuevo JFrame con VistaArbolSimple
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Lista Circular");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaListaCircular());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_ListaCircularActionPerformed

    private void ListaDobleCircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaDobleCircularActionPerformed
        // Cerrar el JFrame actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        // Crear y mostrar el nuevo JFrame con VistaArbolSimple
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Lista Doblemente Circular");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaListaDoblementeCircular());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_ListaDobleCircularActionPerformed

    private void btnGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrafoActionPerformed
        // Cerrar el JFrame actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        // Crear y mostrar el nuevo JFrame con VistaArbolSimple
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Grafo");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaGrafo());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnGrafoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListaCircular;
    private javax.swing.JButton ListaDobleCircular;
    private javax.swing.JButton btnArbolAVL;
    private javax.swing.JButton btnArbolRN;
    private javax.swing.JButton btnArbolSimple;
    private javax.swing.JButton btnGrafo;
    private javax.swing.JButton btnListasDobleEnlazadas;
    private javax.swing.JButton btnListasEnlazadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
