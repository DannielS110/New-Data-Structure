package estructurasdedatos;

public class NodosArbol {

    int valor;
    NodosArbol izquierdo, derecho;
    Colores color; // Color del nodo: ROJO o NEGRO
    int altura;

    public NodosArbol(int item) {
        valor = item;
        altura = 0;
        izquierdo = derecho = null;
        color = Colores.ROJO; // Por defecto, todos los nodos se insertan como ROJOS
    }
}
