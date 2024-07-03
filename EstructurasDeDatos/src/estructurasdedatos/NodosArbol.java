package estructurasdedatos;

public class NodosArbol {

    int valor;
    NodosArbol izquierdo, derecho;
    Colores color; // Color del nodo: ROJO o NEGRO
<<<<<<< HEAD

    public NodosArbol(int item) {
        valor = item;
        izquierdo = derecho = null;
        color = Colores.ROJO; // Por defecto, todos los nodos se insertan como ROJOS
=======
    int altura;

    public NodosArbol(int item) {
        valor = item;
        altura = 0;
        izquierdo = derecho = null;
        color = Colores.SC; // Por defecto, todos los nodos se insertan como ROJOS
>>>>>>> v2.0.0
    }
}
