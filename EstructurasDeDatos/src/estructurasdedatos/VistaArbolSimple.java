package estructurasdedatos;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VistaArbolSimple extends javax.swing.JPanel {

    private ArbolSimple arbol;
    private DibujoArbol dibujoArbol;

    /**
     * Creates new form VistaArbolSimple
     */
    public VistaArbolSimple() {
        initComponents();
        arbol = new ArbolSimple();
        dibujoArbol = new DibujoArbol(arbol);
        dibujo.setLayout(new BorderLayout());
        dibujo.add(dibujoArbol, BorderLayout.CENTER);
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
        txtDatosEntrada = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMostrarDatos = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        dibujo = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ÁRBOL SIMPLE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        txtDatosEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosEntradaActionPerformed(evt);
            }
        });
        jPanel1.add(txtDatosEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 520, -1));

        btnEnviar.setBackground(new java.awt.Color(0, 204, 102));
        btnEnviar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(255, 51, 51));
        btnRegresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, -1, -1));

        txtAreaMostrarDatos.setColumns(20);
        txtAreaMostrarDatos.setRows(5);
        jScrollPane1.setViewportView(txtAreaMostrarDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 520, 130));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese los valores para el árbol simple (separados por espacios):");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        dibujo.setName("dibujo"); // NOI18N

        javax.swing.GroupLayout dibujoLayout = new javax.swing.GroupLayout(dibujo);
        dibujo.setLayout(dibujoLayout);
        dibujoLayout.setHorizontalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        dibujoLayout.setVerticalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel1.add(dibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 520, 260));
        dibujo.getAccessibleContext().setAccessibleParent(dibujo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        insertarDatos();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtDatosEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatosEntradaActionPerformed
        insertarDatos();
    }//GEN-LAST:event_txtDatosEntradaActionPerformed

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

private void insertarDatos() {
        String inputText = txtDatosEntrada.getText().trim();
        if (!inputText.isEmpty()) {
            String[] valores = inputText.split("\\s+");
            for (String valor : valores) {
                try {
                    int intValue = Integer.parseInt(valor);
                    arbol.insertar(intValue);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Por favor ingrese solo números enteros separados por espacios.");
                    return;
                }
            }
            mostrarResultados();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor ingrese algunos valores para el árbol.");
        }
    }

private void mostrarResultados() {
    StringBuilder resultados = new StringBuilder();
    resultados.append("Recorrido inorden del arbol simple:\n");
    resultados.append(getRecorridoInorden()).append("\n");
    resultados.append("Recorrido preorden del arbol simple:\n");
    resultados.append(getRecorridoPreorden()).append("\n");
    resultados.append("Recorrido postorden del arbol simple:\n");
    resultados.append(getRecorridoPostorden()).append("\n");
    txtAreaMostrarDatos.setText(resultados.toString());
    
    dibujoArbol.repaint();
}

    private String getRecorridoInorden() {
        StringBuilder recorrido = new StringBuilder();
        getRecorridoInordenRec(arbol.raiz, recorrido);
        return recorrido.toString().trim();
    }

    private void getRecorridoInordenRec(NodosArbol nodo, StringBuilder recorrido) {
        if (nodo != null) {
            getRecorridoInordenRec(nodo.izquierdo, recorrido);
            recorrido.append(nodo.valor).append(" ");
            getRecorridoInordenRec(nodo.derecho, recorrido);
        }
    }

    private String getRecorridoPreorden() {
        StringBuilder recorrido = new StringBuilder();
        getRecorridoPreordenRec(arbol.raiz, recorrido);
        return recorrido.toString().trim();
    }

    private void getRecorridoPreordenRec(NodosArbol nodo, StringBuilder recorrido) {
        if (nodo != null) {
            recorrido.append(nodo.valor).append(" ");
            getRecorridoPreordenRec(nodo.izquierdo, recorrido);
            getRecorridoPreordenRec(nodo.derecho, recorrido);
        }
    }

    private String getRecorridoPostorden() {
        StringBuilder recorrido = new StringBuilder();
        getRecorridoPostordenRec(arbol.raiz, recorrido);
        return recorrido.toString().trim();
    }

    private void getRecorridoPostordenRec(NodosArbol nodo, StringBuilder recorrido) {
        if (nodo != null) {
            getRecorridoPostordenRec(nodo.izquierdo, recorrido);
            getRecorridoPostordenRec(nodo.derecho, recorrido);
            recorrido.append(nodo.valor).append(" ");
        }
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel dibujo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaMostrarDatos;
    private javax.swing.JTextField txtDatosEntrada;
    // End of variables declaration//GEN-END:variables
}
