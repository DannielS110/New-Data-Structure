package estructurasdedatos;

public class NodosArbolAVL {
    int valor;
    NodosArbolAVL izquierdo, derecho;
    int altura;

    public NodosArbolAVL(int item) {
        valor = item;
        izquierdo = derecho = null;
        altura = 1; // Por defecto, la altura de un nuevo nodo es 1
    }
}

