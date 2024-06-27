/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

public class NodosArbolAVL {
    int valor;
    NodosArbolAVL izquierdo, derecho;
    int altura;

    public NodosArbolAVL(int item) {
        valor = item;
        izquierdo = derecho = null;
        altura = 1; // Por defecto, la altura de un nuevo nodo es 1
    }
}

