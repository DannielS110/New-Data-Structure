/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;


public class ArbolSimple extends ArbolBinario implements Recorridos{
    // Método para insertar un nuevo nodo en el árbol
    @Override
    void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Método recursivo para insertar un nuevo nodo
    NodosArbol insertarRec(NodosArbol raiz, int valor) {
        // Si el árbol está vacío, devuelve un nuevo nodo
        if (raiz == null) {
            raiz = new NodosArbol(valor);
            return raiz;
        }

        // De lo contrario, recorre el árbol
        if (valor < raiz.valor)
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        else if (valor > raiz.valor)
            raiz.derecho = insertarRec(raiz.derecho, valor);

        // Devuelve el puntero (raíz sin cambios)
        return raiz;
    }

    // Método para eliminar un nodo en el árbol
    @Override
    void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    // Método recursivo para eliminar un nodo
    NodosArbol eliminarRec(NodosArbol raiz, int valor) {
        // Caso base: si el árbol está vacío
        if (raiz == null) return raiz;

        // De lo contrario, recorre el árbol
        if (valor < raiz.valor)
            raiz.izquierdo = eliminarRec(raiz.izquierdo, valor);
        else if (valor > raiz.valor)
            raiz.derecho = eliminarRec(raiz.derecho, valor);
        // Si el valor es igual al valor de la raíz, este es el nodo a eliminar
        else {
            // NodosArbol con solo un hijo o sin hijo
            if (raiz.izquierdo == null)
                return raiz.derecho;
            else if (raiz.derecho == null)
                return raiz.izquierdo;

            // NodosArbol con dos hijos: obtiene el sucesor en orden (el menor en el subárbol derecho)
            raiz.valor = minValue(raiz.derecho);

            // Elimina el sucesor en orden
            raiz.derecho = eliminarRec(raiz.derecho, raiz.valor);
        }

        return raiz;
    }

    int minValue(NodosArbol raiz) {
        int minv = raiz.valor;
        while (raiz.izquierdo != null) {
            minv = raiz.izquierdo.valor;
            raiz = raiz.izquierdo;
        }
        return minv;
    }

    // Métodos de la interfaz Recorridos

    @Override
    public void recorrerInorden() {
        recorrerInordenRec(raiz);
    }

    void recorrerInordenRec(NodosArbol raiz) {
        if (raiz != null) {
            recorrerInordenRec(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            recorrerInordenRec(raiz.derecho);
        }
    }

    @Override
    public void recorrerPreorden() {
        recorrerPreordenRec(raiz);
    }

    void recorrerPreordenRec(NodosArbol raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            recorrerPreordenRec(raiz.izquierdo);
            recorrerPreordenRec(raiz.derecho);
        }
    }

    @Override
    public void recorrerPostorden() {
        recorrerPostordenRec(raiz);
    }

    void recorrerPostordenRec(NodosArbol raiz) {
        if (raiz != null) {
            recorrerPostordenRec(raiz.izquierdo);
            recorrerPostordenRec(raiz.derecho);
            System.out.print(raiz.valor + " ");
        }
    }
    
}
