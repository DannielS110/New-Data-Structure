/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

public class ArbolAVL {

    NodosArbolAVL raiz;

    // Constructor para crear un árbol AVL vacío
    public ArbolAVL() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol AVL
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Método recursivo para insertar un nuevo nodo
    private NodosArbolAVL insertarRec(NodosArbolAVL nodo, int valor) {
        if (nodo == null) {
            return new NodosArbolAVL(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        } else {
            // Los valores duplicados no están permitidos en el árbol AVL
            return nodo;
        }

        // Actualizar la altura del nodo
        actualizarAltura(nodo);

        // Balancear el árbol
        return equilibrar(nodo);
    }

    // Método para realizar una rotación a la izquierda
    private NodosArbolAVL rotacionIzquierda(NodosArbolAVL x) {
        NodosArbolAVL y = x.derecho;
        NodosArbolAVL T2 = y.izquierdo;

        // Realizar rotación
        y.izquierdo = x;
        x.derecho = T2;

        // Actualizar alturas
        actualizarAltura(x);
        actualizarAltura(y);

        // Retornar nueva raíz
        return y;
    }

    // Método para realizar una rotación a la derecha
    private NodosArbolAVL rotacionDerecha(NodosArbolAVL y) {
        NodosArbolAVL x = y.izquierdo;
        NodosArbolAVL T2 = x.derecho;

        // Realizar rotación
        x.derecho = y;
        y.izquierdo = T2;

        // Actualizar alturas
        actualizarAltura(y);
        actualizarAltura(x);

        // Retornar nueva raíz
        return x;
    }

    // Método para actualizar la altura de un nodo
    private void actualizarAltura(NodosArbolAVL nodo) {
        nodo.altura = 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    // Método para obtener la altura de un nodo
    private int altura(NodosArbolAVL nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }

    // Método para obtener el factor de balance de un nodo
    private int obtenerBalance(NodosArbolAVL nodo) {
        if (nodo == null) {
            return 0;
        }
        return altura(nodo.izquierdo) - altura(nodo.derecho);
    }

    // Método para equilibrar el árbol AVL
    private NodosArbolAVL equilibrar(NodosArbolAVL nodo) {
        int balance = obtenerBalance(nodo);

        // Caso Izquierda Izquierda
        if (balance > 1 && obtenerBalance(nodo.izquierdo) >= 0) {
            return rotacionDerecha(nodo);
        }

        // Caso Izquierda Derecha
        if (balance > 1 && obtenerBalance(nodo.izquierdo) < 0) {
            nodo.izquierdo = rotacionIzquierda(nodo.izquierdo);
            return rotacionDerecha(nodo);
        }

        // Caso Derecha Derecha
        if (balance < -1 && obtenerBalance(nodo.derecho) <= 0) {
            return rotacionIzquierda(nodo);
        }

        // Caso Derecha Izquierda
        if (balance < -1 && obtenerBalance(nodo.derecho) > 0) {
            nodo.derecho = rotacionDerecha(nodo.derecho);
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    // Métodos de recorrido del árbol AVL
    public void recorrerInorden() {
        recorrerInordenRec(raiz);
    }

    private void recorrerInordenRec(NodosArbolAVL nodo) {
        if (nodo != null) {
            recorrerInordenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerInordenRec(nodo.derecho);
        }
    }

    public void recorrerPreorden() {
        recorrerPreordenRec(raiz);
    }

    private void recorrerPreordenRec(NodosArbolAVL nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            recorrerPreordenRec(nodo.izquierdo);
            recorrerPreordenRec(nodo.derecho);
        }
    }

    public void recorrerPostorden() {
        recorrerPostordenRec(raiz);
    }

    private void recorrerPostordenRec(NodosArbolAVL nodo) {
        if (nodo != null) {
            recorrerPostordenRec(nodo.izquierdo);
            recorrerPostordenRec(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    // Método para eliminar un nodo del árbol AVL
    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private NodosArbolAVL eliminarRec(NodosArbolAVL nodo, int valor) {
        if (nodo == null) {
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = eliminarRec(nodo.derecho, valor);
        } else {
            // Nodo con solo un hijo o sin hijos
            if ((nodo.izquierdo == null) || (nodo.derecho == null)) {
                NodosArbolAVL temp = null;
                if (temp == nodo.izquierdo) {
                    temp = nodo.derecho;
                } else {
                    temp = nodo.izquierdo;
                }

                // No tiene hijos
                if (temp == null) {
                    temp = nodo;
                    nodo = null;
                } else { // Tiene un hijo
                    nodo = temp;
                }
            } else {
                // Nodo con dos hijos
                NodosArbolAVL temp = minValueNode(nodo.derecho);
                nodo.valor = temp.valor;
                nodo.derecho = eliminarRec(nodo.derecho, temp.valor);
            }
        }

        if (nodo == null) {
            return nodo;
        }

        // Actualizar altura del nodo actual
        actualizarAltura(nodo);

        // Balancear el nodo
        return equilibrar(nodo);
    }

    // Obtener el nodo con el valor mínimo
    private NodosArbolAVL minValueNode(NodosArbolAVL nodo) {
        NodosArbolAVL current = nodo;

        // Bucle para encontrar el nodo más a la izquierda
        while (current.izquierdo != null) {
            current = current.izquierdo;
        }
        return current;
    }
}

