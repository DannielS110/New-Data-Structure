/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

public class NodoListas {
    int valor;
    int posicion;
    NodoListas nodoAnterior;
    NodoListas nodoSiguiente;

    public NodoListas(int valor, int posicion) {
        this.valor = valor;
        this.posicion = posicion;
        this.nodoAnterior = null;
        this.nodoSiguiente = null;
    }
}

