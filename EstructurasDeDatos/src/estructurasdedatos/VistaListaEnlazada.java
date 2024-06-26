package estructurasdedatos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaListaEnlazada extends javax.swing.JPanel {

    /**
     * Creates new form VistaListaEnlazada
     */
    private ListaEnlazada listaEnlazada;
    
    public VistaListaEnlazada() {
        listaEnlazada = new ListaEnlazada();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDatosEntrada = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMostrarDatos = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista Enlazada");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese los valores para la lista enlazada (separados por espacios):");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtDatosEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(txtDatosEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 530, -1));

        btnEnviar.setBackground(new java.awt.Color(0, 204, 102));
        btnEnviar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        txtAreaMostrarDatos.setColumns(20);
        txtAreaMostrarDatos.setRows(5);
        jScrollPane1.setViewportView(txtAreaMostrarDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 530, 150));

        btnRegresar.setBackground(new java.awt.Color(255, 51, 51));
        btnRegresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatosEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosEntradaActionPerformed

    }//GEN-LAST:event_txtDatosEntradaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
  String datosEntrada = txtDatosEntrada.getText();
        if (!datosEntrada.isEmpty()) {
            String[] valores = datosEntrada.split(" ");
            listaEnlazada = new ListaEnlazada(); // Reiniciar la lista enlazada
            for (String valor : valores) {
                try {
                    int numero = Integer.parseInt(valor);
                    listaEnlazada.insertar(numero);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Ingrese solo números enteros.");
                    return;
                }
            }
            listaEnlazada.ordenar();
            actualizarAreaMostrarDatos();
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
private void actualizarAreaMostrarDatos() {
        StringBuilder sb = new StringBuilder();
        NodoListas temp = listaEnlazada.cabeza;
        while (temp != null) {
            sb.append(temp.valor).append(" ");
            temp = temp.nodoSiguiente;
        }
        txtAreaMostrarDatos.setText(sb.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaMostrarDatos;
    private javax.swing.JTextField txtDatosEntrada;
    // End of variables declaration//GEN-END:variables
}
