/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

/**
 *
 * @author juanc
 */
public class ListaEnlazada extends Lista {
    private NodoListas cabeza;
    private int size;

    public ListaEnlazada() {
        cabeza = null;
        size = 0;
    }

    // Método para insertar un nuevo nodo en la lista
    public void insertar(int valor) {
        NodoListas nuevoNodo = new NodoListas(valor, size);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoListas temp = cabeza;
            while (temp.nodoSiguiente != null) {
                temp = temp.nodoSiguiente;
            }
            temp.nodoSiguiente = nuevoNodo;
            nuevoNodo.nodoAnterior = temp;
        }
        size++;
    }

    @Override
    public void recorrer() {
        NodoListas temp = cabeza;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.nodoSiguiente;
        }
        System.out.println();
    }

    @Override
    public void ordenar() {
        if (cabeza == null || cabeza.nodoSiguiente == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            NodoListas current = cabeza;
            while (current.nodoSiguiente != null) {
                if (current.valor > current.nodoSiguiente.valor) {
                    int temp = current.valor;
                    current.valor = current.nodoSiguiente.valor;
                    current.nodoSiguiente.valor = temp;
                    swapped = true;
                }
                current = current.nodoSiguiente;
            }
        } while (swapped);
    }
}

