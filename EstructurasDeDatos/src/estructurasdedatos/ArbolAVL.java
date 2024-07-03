package estructurasdedatos;

<<<<<<< HEAD
public class ArbolAVL {

    NodosArbolAVL raiz;

=======
public class ArbolAVL extends ArbolBinario implements Recorridos{
>>>>>>> v2.0.0
    // Constructor para crear un árbol AVL vacío
    public ArbolAVL() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol AVL
<<<<<<< HEAD
=======
    @Override
>>>>>>> v2.0.0
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Método recursivo para insertar un nuevo nodo
<<<<<<< HEAD
    private NodosArbolAVL insertarRec(NodosArbolAVL nodo, int valor) {
        if (nodo == null) {
            return new NodosArbolAVL(valor);
=======
    private NodosArbol insertarRec(NodosArbol nodo, int valor) {
        if (nodo == null) {
            return new NodosArbol(valor);
>>>>>>> v2.0.0
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
<<<<<<< HEAD
    private NodosArbolAVL rotacionIzquierda(NodosArbolAVL x) {
        NodosArbolAVL y = x.derecho;
        NodosArbolAVL T2 = y.izquierdo;
=======
    private NodosArbol rotacionIzquierda(NodosArbol x) {
        NodosArbol y = x.derecho;
        NodosArbol T2 = y.izquierdo;
>>>>>>> v2.0.0

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
<<<<<<< HEAD
    private NodosArbolAVL rotacionDerecha(NodosArbolAVL y) {
        NodosArbolAVL x = y.izquierdo;
        NodosArbolAVL T2 = x.derecho;
=======
    private NodosArbol rotacionDerecha(NodosArbol y) {
        NodosArbol x = y.izquierdo;
        NodosArbol T2 = x.derecho;
>>>>>>> v2.0.0

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
<<<<<<< HEAD
    private void actualizarAltura(NodosArbolAVL nodo) {
=======
    private void actualizarAltura(NodosArbol nodo) {
>>>>>>> v2.0.0
        nodo.altura = 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    // Método para obtener la altura de un nodo
<<<<<<< HEAD
    private int altura(NodosArbolAVL nodo) {
=======
    private int altura(NodosArbol nodo) {
>>>>>>> v2.0.0
        if (nodo == null) {
            return 0;
        }
        return nodo.altura;
    }

    // Método para obtener el factor de balance de un nodo
<<<<<<< HEAD
    private int obtenerBalance(NodosArbolAVL nodo) {
=======
    private int obtenerBalance(NodosArbol nodo) {
>>>>>>> v2.0.0
        if (nodo == null) {
            return 0;
        }
        return altura(nodo.izquierdo) - altura(nodo.derecho);
    }

    // Método para equilibrar el árbol AVL
<<<<<<< HEAD
    private NodosArbolAVL equilibrar(NodosArbolAVL nodo) {
=======
    private NodosArbol equilibrar(NodosArbol nodo) {
>>>>>>> v2.0.0
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
<<<<<<< HEAD
=======
    @Override
>>>>>>> v2.0.0
    public void recorrerInorden() {
        recorrerInordenRec(raiz);
    }

<<<<<<< HEAD
    private void recorrerInordenRec(NodosArbolAVL nodo) {
=======
    private void recorrerInordenRec(NodosArbol nodo) {
>>>>>>> v2.0.0
        if (nodo != null) {
            recorrerInordenRec(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerInordenRec(nodo.derecho);
        }
    }

    public void recorrerPreorden() {
        recorrerPreordenRec(raiz);
    }

<<<<<<< HEAD
    private void recorrerPreordenRec(NodosArbolAVL nodo) {
=======
    private void recorrerPreordenRec(NodosArbol nodo) {
>>>>>>> v2.0.0
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            recorrerPreordenRec(nodo.izquierdo);
            recorrerPreordenRec(nodo.derecho);
        }
    }

    public void recorrerPostorden() {
        recorrerPostordenRec(raiz);
    }

<<<<<<< HEAD
    private void recorrerPostordenRec(NodosArbolAVL nodo) {
=======
    private void recorrerPostordenRec(NodosArbol nodo) {
>>>>>>> v2.0.0
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

<<<<<<< HEAD
    private NodosArbolAVL eliminarRec(NodosArbolAVL nodo, int valor) {
=======
    private NodosArbol eliminarRec(NodosArbol nodo, int valor) {
>>>>>>> v2.0.0
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
<<<<<<< HEAD
                NodosArbolAVL temp = null;
=======
                NodosArbol temp = null;
>>>>>>> v2.0.0
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
<<<<<<< HEAD
                NodosArbolAVL temp = minValueNode(nodo.derecho);
=======
                NodosArbol temp = minValueNode(nodo.derecho);
>>>>>>> v2.0.0
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
<<<<<<< HEAD
    private NodosArbolAVL minValueNode(NodosArbolAVL nodo) {
        NodosArbolAVL current = nodo;
=======
    private NodosArbol minValueNode(NodosArbol nodo) {
        NodosArbol current = nodo;
>>>>>>> v2.0.0

        // Bucle para encontrar el nodo más a la izquierda
        while (current.izquierdo != null) {
            current = current.izquierdo;
        }
        return current;
    }
}

