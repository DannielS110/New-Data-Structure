/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

public class ListaDoblementeEnlazada extends Lista {
    private NodoListas cabeza;
    private NodoListas cola;
    private int size;

    public ListaDoblementeEnlazada() {
        cabeza = null;
        cola = null;
        size = 0;
    }

    // Método para insertar un nuevo nodo en la lista
    public void insertar(int valor) {
        NodoListas nuevoNodo = new NodoListas(valor, size);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.nodoSiguiente = nuevoNodo;
            nuevoNodo.nodoAnterior = cola;
            cola = nuevoNodo;
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

    public void recorrerReversa() {
        NodoListas temp = cola;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.nodoAnterior;
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

