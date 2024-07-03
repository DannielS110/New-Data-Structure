package estructurasdedatos;

public class NodoListas {
    int valor;
    int posicion;
    NodoListas nodoAnterior;
    NodoListas nodoSiguiente;

    public NodoListas(int valor, int posicion) {
        this.valor = valor;
        this.posicion = posicion;
        this.nodoAnterior = null;
        this.nodoSiguiente = null;
    }
}

