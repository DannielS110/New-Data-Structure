package estructurasdedatos;

public class ArbolAVL extends ArbolBinario implements Recorridos{
    // Constructor para crear un árbol AVL vacío
    public ArbolAVL() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol AVL
    @Override
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Método recursivo para insertar un nuevo nodo
    private NodosArbol insertarRec(NodosArbol nodo, int valor) {
        if (nodo == null) {
            return new NodosArbol(valor);
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
    private NodosArbol rotacionIzquierda(NodosArbol x) {
        NodosArbol y = x.derecho;
        NodosArbol T2 = y.izquierdo;

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
    private NodosArbol rotacionDerecha(NodosArbol y) {
        NodosArbol x = y.izquierdo;
        NodosArbol T2 = x.derecho;

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
    private void actualizarAltura(NodosArbol nodo) {
        nodo.altura = 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    // Método para obtener la altura de un nodo
    private int altura(NodosArbol nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }

    // Método para obtener el factor de balance de un nodo
    private int obtenerBalance(NodosArbol nodo) {
        if (nodo == null) {
            return 0;
        }
        return altura(nodo.izquierdo) - altura(nodo.derecho);
    }

    // Método para equilibrar el árbol AVL
    private NodosArbol equilibrar(NodosArbol nodo) {
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
    @Override
    public void recorrerInorden() {
        recorrerInordenRec(raiz);
    }

    private void recorrerInordenRec(NodosArbol nodo) {
        if (nodo != null) {
            recorrerInordenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerInordenRec(nodo.derecho);
        }
    }

    public void recorrerPreorden() {
        recorrerPreordenRec(raiz);
    }

    private void recorrerPreordenRec(NodosArbol nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            recorrerPreordenRec(nodo.izquierdo);
            recorrerPreordenRec(nodo.derecho);
        }
    }

    public void recorrerPostorden() {
        recorrerPostordenRec(raiz);
    }

    private void recorrerPostordenRec(NodosArbol nodo) {
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

    private NodosArbol eliminarRec(NodosArbol nodo, int valor) {
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
                NodosArbol temp = null;
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
                NodosArbol temp = minValueNode(nodo.derecho);
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
    private NodosArbol minValueNode(NodosArbol nodo) {
        NodosArbol current = nodo;

        // Bucle para encontrar el nodo más a la izquierda
        while (current.izquierdo != null) {
            current = current.izquierdo;
        }
        return current;
    }
}

