/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Alexis y Daniel
 */
<<<<<<< HEAD
public class DibujoArbol extends JPanel {

    private ArbolAVL arbolAVL;

    public DibujoArbol(ArbolAVL arbolAVL) {
        this.arbolAVL = arbolAVL;
=======

//FUNCIONA PARA TODOS LOS ARBOLES

public class DibujoArbol extends JPanel {

    private ArbolBinario arbol;

    public DibujoArbol(ArbolBinario arbol) {
        this.arbol = arbol;
>>>>>>> v2.0.0
        initComponents();
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
<<<<<<< HEAD
        if (arbolAVL != null && arbolAVL.raiz != null) {
            dibujarNodo(g, arbolAVL.raiz, getWidth() / 2, 30, getWidth() / 4);
        }
    }

    private void dibujarNodo(Graphics g, NodosArbolAVL nodo, int x, int y, int xOffset) {
        if (nodo == null) {
            return;
        }

        g.setColor(Color.BLACK);
        g.fillOval(x - 15, y - 15, 30, 30);
        g.setColor(Color.WHITE);
        g.drawString(Integer.toString(nodo.valor), x - 6, y + 4);
=======
        if (arbol != null && arbol.raiz != null) {
            dibujarNodo(g, arbol.raiz, getWidth() / 2, 30, getWidth() / 4);
        }
    }

    private void dibujarNodo(Graphics g, NodosArbol nodo, int x, int y, int xOffset) {
        if (nodo == null) {
            return;
        }
        
        if (nodo.color == Colores.NEGRO) {
            g.setColor(Color.BLACK);
            g.fillOval(x - 15, y - 15, 30, 30);
            g.setColor(Color.WHITE);
            g.drawString(Integer.toString(nodo.valor), x - 6, y + 4);
        } else if (nodo.color == Colores.ROJO) {
            g.setColor(Color.RED);
            g.fillOval(x - 15, y - 15, 30, 30);
            g.setColor(Color.BLACK);
            g.drawString(Integer.toString(nodo.valor), x - 6, y + 4);
        } else {
            g.setColor(Color.YELLOW);
            g.fillOval(x - 15, y - 15, 30, 30);
            g.setColor(Color.BLACK);
            g.drawString(Integer.toString(nodo.valor), x - 6, y + 4);
        }
>>>>>>> v2.0.0

        if (nodo.izquierdo != null) {
            g.drawLine(x - 15, y + 15, x - xOffset, y + 50);
            dibujarNodo(g, nodo.izquierdo, x - xOffset, y + 50, xOffset / 2);
        }

        if (nodo.derecho != null) {
            g.drawLine(x + 15, y + 15, x + xOffset, y + 50);
            dibujarNodo(g, nodo.derecho, x + xOffset, y + 50, xOffset / 2);
        }
    }
}
