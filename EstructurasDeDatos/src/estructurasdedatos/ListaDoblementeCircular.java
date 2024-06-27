/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

public class ListaDoblementeCircular extends Lista {
    private NodoListas cabeza;
    private NodoListas cola;
    private int size;

    public ListaDoblementeCircular() {
        cabeza = null;
        cola = null;
        size = 0;
    }

    // Método para insertar un nuevo nodo en la lista doblemente circular
    public void insertar(int valor) {
        NodoListas nuevoNodo = new NodoListas(valor, size);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            nuevoNodo.nodoSiguiente = cabeza;
            nuevoNodo.nodoAnterior = cola;
        } else {
            cola.nodoSiguiente = nuevoNodo;
            nuevoNodo.nodoAnterior = cola;
            nuevoNodo.nodoSiguiente = cabeza;
            cabeza.nodoAnterior = nuevoNodo;
            cola = nuevoNodo;
        }
        size++;
    }

    @Override
    public void recorrer() {
        if (cabeza == null) {
            return;
        }
        NodoListas temp = cabeza;
        do {
            System.out.print(temp.valor + " ");
            temp = temp.nodoSiguiente;
        } while (temp != cabeza);
        System.out.println();
        validarCircular();
    }

    @Override
    public void ordenar() {
        if (cabeza == null || cabeza.nodoSiguiente == cabeza) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            NodoListas current = cabeza;
            do {
                NodoListas siguiente = current.nodoSiguiente;
                if (current.valor > siguiente.valor) {
                    int temp = current.valor;
                    current.valor = siguiente.valor;
                    siguiente.valor = temp;
                    swapped = true;
                }
                current = siguiente;
            } while (current.nodoSiguiente != cabeza);
        } while (swapped);

        // Reafirmar el ciclo de la lista después de ordenar
        reafirmarCiclo();
        validarCircular();
    }

    public void recorrerReversa() {
        if (cabeza == null) {
            return;
        }
        NodoListas temp = cola;
        do {
            System.out.print(temp.valor + " ");
            temp = temp.nodoAnterior;
        } while (temp != cola);
        System.out.println();
        validarCircular();
    }

    private void reafirmarCiclo() {
        if (cabeza == null) {
            return;
        }

        cabeza.nodoAnterior = cola;
        cola.nodoSiguiente = cabeza;
    }

    private void validarCircular() {
        if (cabeza == null) {
            System.out.println("La lista esta vacía.");
            return;
        }

        NodoListas temp = cabeza;
        int count = 0;
        do {
            if (temp.nodoSiguiente == null || temp.nodoAnterior == null) {
                System.out.println("La lista no es doblemente circular.");
                return;
            }
            temp = temp.nodoSiguiente;
            count++;
        } while (temp != cabeza && count <= size);

        if (count > size) {
            System.out.println("La lista no es circular correctamente.");
        } else {
            System.out.println("La lista es doblemente circular correctamente.");
        }
    }
}

