package estructurasdedatos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;

public class VistaArbolAVL extends javax.swing.JPanel {

    /**
     * Creates new form VistaArbolRN
     */
    
    private ArbolAVL arbolAVL;
    private DibujoArbol dibujoArbol;

    public VistaArbolAVL() {
        arbolAVL = new ArbolAVL();
        dibujoArbol = new DibujoArbol(arbolAVL);
        initComponents();
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(dibujoArbol, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDatosEntrada = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMostrarDatos = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();
        txtValorEliminar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ÁRBOL AVL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese los valores para el árbol AVL (separados por espacios):");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtDatosEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(txtDatosEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 510, -1));

        btnEnviar.setBackground(new java.awt.Color(0, 204, 102));
        btnEnviar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        txtAreaMostrarDatos.setColumns(20);
        txtAreaMostrarDatos.setRows(5);
        jScrollPane1.setViewportView(txtAreaMostrarDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 510, 100));

        btnRegresar.setBackground(new java.awt.Color(255, 51, 51));
        btnRegresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, -1, -1));

        txtValorEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(txtValorEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 150, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese un valor para eliminar del Arbol AVL:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jPanel2.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 510, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatosEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosEntradaActionPerformed
   
    }//GEN-LAST:event_txtDatosEntradaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String datosEntrada = txtDatosEntrada.getText();
        if (!datosEntrada.isEmpty()) {
            String[] valores = datosEntrada.split(" ");
            for (String valor : valores) {
                try {
                    int numero = Integer.parseInt(valor);
                    arbolAVL.insertar(numero);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Ingrese solo números enteros.");
                    return;
                }
            }
            actualizarAreaMostrarDatos();
            dibujoArbol.repaint();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Cerrar el JFrame actual
        javax.swing.SwingUtilities.getWindowAncestor(this).dispose();

        // Crear y mostrar el JFrame principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Vista Principal");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaPrincipal());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtValorEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorEliminarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String valorEliminar = txtValorEliminar.getText();
        try {
            int numero = Integer.parseInt(valorEliminar);
            arbolAVL.eliminar(numero);
            actualizarAreaMostrarDatosDespuesEliminar();
            dibujoArbol.repaint();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese solo números enteros.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void actualizarAreaMostrarDatos() {
        StringBuilder datos = new StringBuilder();
        arbolAVL.recorrerInorden();
        txtAreaMostrarDatos.setText(datos.toString());
    }

    private void actualizarAreaMostrarDatosDespuesEliminar() {
        StringBuilder datos = new StringBuilder();
        arbolAVL.recorrerInorden();
        txtAreaMostrarDatos.setText(datos.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaMostrarDatos;
    private javax.swing.JTextField txtDatosEntrada;
    private javax.swing.JTextField txtValorEliminar;
    // End of variables declaration//GEN-END:variables
}
