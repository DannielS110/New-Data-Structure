/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;


public class ArbolRojoNegro extends ArbolBinario implements Recorridos {

    private static final Colores ROJO = Colores.ROJO;
    private static final Colores NEGRO = Colores.NEGRO;

    // Constructor para crear un árbol Rojo y Negro vacío
    public ArbolRojoNegro() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol Rojo y Negro
    @Override
    void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
        raiz.color = NEGRO; // Asegura que la raíz siempre sea negra después de insertar
    }

    // Método recursivo para insertar un nuevo nodo
    NodosArbol insertarRec(NodosArbol nodo, int valor) {
        if (nodo == null) {
            return new NodosArbol(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }

        // Aplicar reglas del árbol Rojo y Negro
        if (esRojo(nodo.derecho) && !esRojo(nodo.izquierdo)) {
            nodo = rotarIzquierda(nodo);
        }
        if (esRojo(nodo.izquierdo) && esRojo(nodo.izquierdo.izquierdo)) {
            nodo = rotarDerecha(nodo);
        }
        if (esRojo(nodo.izquierdo) && esRojo(nodo.derecho)) {
            cambiarColores(nodo);
        }

        return nodo;
    }

    // Método para eliminar un nodo del árbol Rojo y Negro
    @Override
    void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
        if (raiz != null) {
            raiz.color = NEGRO; // Asegura que la raíz siempre sea negra después de eliminar
        }
    }

    // Método recursivo para eliminar un nodo
    NodosArbol eliminarRec(NodosArbol nodo, int valor) {
        if (nodo == null) {
            return nodo; // No se encontró el nodo a eliminar
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = eliminarRec(nodo.derecho, valor);
        } else {
            // Caso 1: Nodo a eliminar tiene 0 o 1 hijo
            if (nodo.izquierdo == null || nodo.derecho == null) {
                NodosArbol hijo = (nodo.izquierdo != null) ? nodo.izquierdo : nodo.derecho;

                // Caso 1.1: Sin hijos
                if (hijo == null) {
                    nodo = null;
                } else { // Caso 1.2: Un hijo
                    nodo = hijo; // Reemplazamos el nodo por su único hijo
                }
            } else {
                // Caso 2: Nodo a eliminar tiene 2 hijos
                // Encontramos el sucesor inorden (nodo más pequeño en el subárbol derecho)
                NodosArbol sucesor = minValueNode(nodo.derecho);

                // Copiamos el valor del sucesor al nodo actual
                nodo.valor = sucesor.valor;

                // Eliminamos el sucesor del subárbol derecho
                nodo.derecho = eliminarRec(nodo.derecho, sucesor.valor);
            }
        }

        // Si el nodo actual es null, no hay nada más que hacer
        if (nodo == null) {
            return nodo;
        }

        // Balanceamos el árbol después de la eliminación
        if (esRojo(nodo.izquierdo) && !esRojo(nodo.derecho)) {
            nodo = rotarDerecha(nodo);
        }
        if (esRojo(nodo.derecho) && esRojo(nodo.derecho.izquierdo)) {
            nodo.derecho = rotarDerecha(nodo.derecho);
            nodo = rotarIzquierda(nodo);
        }
        if (esRojo(nodo.derecho) && esRojo(nodo.izquierdo)) {
            cambiarColores(nodo);
        }

        return nodo;
    }

    // Métodos de recorrido del árbol Rojo y Negro (implementados de la interfaz Recorridos)
    @Override
    public void recorrerInorden() {
        recorrerInordenRec(raiz);
    }

    void recorrerInordenRec(NodosArbol nodo) {
        if (nodo != null) {
            recorrerInordenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerInordenRec(nodo.derecho);
        }
    }

    @Override
    public void recorrerPreorden() {
        recorrerPreordenRec(raiz);
    }

    void recorrerPreordenRec(NodosArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            recorrerPreordenRec(nodo.izquierdo);
            recorrerPreordenRec(nodo.derecho);
        }
    }

    @Override
    public void recorrerPostorden() {
        recorrerPostordenRec(raiz);
    }

    void recorrerPostordenRec(NodosArbol nodo) {
        if (nodo != null) {
            recorrerPostordenRec(nodo.izquierdo);
            recorrerPostordenRec(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }

    // Métodos auxiliares para el balanceo del árbol Rojo y Negro
    private boolean esRojo(NodosArbol nodo) {
        if (nodo == null) {
            return false; // Los nodos nulos son NEGROS
        }
        return nodo.color == ROJO;
    }

    private NodosArbol rotarIzquierda(NodosArbol x) {
        NodosArbol y = x.derecho;
        x.derecho = y.izquierdo;
        y.izquierdo = x;
        y.color = x.color;
        x.color = ROJO;
        return y;
    }

    private NodosArbol rotarDerecha(NodosArbol x) {
        NodosArbol y = x.izquierdo;
        x.izquierdo = y.derecho;
        y.derecho = x;
        y.color = x.color;
        x.color = ROJO;
        return y;
    }

    private void cambiarColores(NodosArbol nodo) {
        nodo.color = ROJO;
        nodo.izquierdo.color = NEGRO;
        nodo.derecho.color = NEGRO;
    }

    // Método para encontrar el nodo con el valor mínimo en un subárbol
    private NodosArbol minValueNode(NodosArbol nodo) {
        NodosArbol current = nodo;
        while (current.izquierdo != null) {
            current = current.izquierdo;
        }
        return current;
    }
}

