/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

/**
 *
 * @author juanc
 */
public class ListaCircular extends Lista {
    protected NodoListas cabeza;
    protected NodoListas cola;
    protected int size;

    public ListaCircular() {
        cabeza = null;
        cola = null;
        size = 0;
    }

    // Método para insertar un nuevo nodo en la lista circular
    public void insertar(int valor) {
        NodoListas nuevoNodo = new NodoListas(valor, size);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            nuevoNodo.nodoSiguiente = cabeza;
        } else {
            cola.nodoSiguiente = nuevoNodo;
            nuevoNodo.nodoSiguiente = cabeza;
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
        int contador = 0;
        do {
            System.out.print(temp.valor + " ");
            temp = temp.nodoSiguiente;
            contador++;
        } while (temp != cabeza && contador <= size);
        System.out.println();

        if (temp == cabeza) {
            System.out.println("La lista es circular: el ultimo nodo apunta de vuelta al primero.");
        } else {
            System.out.println("La lista no es circular: el ultimo nodo no apunta de vuelta al primero.");
        }
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

        // Validar la lista después de ordenar
        validarListaCircular();
    }

    private void reafirmarCiclo() {
        if (cabeza == null) {
            return;
        }

        NodoListas temp = cabeza;
        while (temp.nodoSiguiente != cabeza) {
            temp = temp.nodoSiguiente;
        }
        cola = temp;
        cola.nodoSiguiente = cabeza;
    }

    private void validarListaCircular() {
        if (cabeza == null) {
            return;
        }

        NodoListas temp = cabeza;
        int contador = 0;
        do {
            if (contador >= size) {
                System.out.println("Error: La lista no es circular despues de ordenar.");
                return;
            }
            temp = temp.nodoSiguiente;
            contador++;
        } while (temp != cabeza);

        System.out.println("La lista es circular despues de ordenar.");
    }

    public int getSize() {
        return size;
    }
}
