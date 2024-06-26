/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

/**
 *
 * @author juanc
 */
public class NodosArbol {

    /**
     * int valor; NodosArbol izquierdo, derecho;
     *
     * public NodosArbol(int item) { valor = item; izquierdo = derecho = null; }
     *
     *
     *
     * int valor; NodosArbol izquierdo, derecho; boolean color; // Color del
     * nodo: true = ROJO, false = NEGRO
     *
     * public NodosArbol(int item) { valor = item; izquierdo = derecho = null;
     * color = true; // Por defecto, todos los nodos se insertan como ROJOS }
    *
     */
    int valor;
    NodosArbol izquierdo, derecho;
    Colores color; // Color del nodo: ROJO o NEGRO

    public NodosArbol(int item) {
        valor = item;
        izquierdo = derecho = null;
        color = Colores.ROJO; // Por defecto, todos los nodos se insertan como ROJOS
    }
}
