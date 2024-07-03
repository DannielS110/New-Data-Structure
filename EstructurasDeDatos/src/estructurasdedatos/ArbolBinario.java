package estructurasdedatos;

public class ArbolBinario extends EstructuraDato {
    protected int altura;
    protected NodosArbol raiz;
    protected int ramas;
    protected int hojas;

    // Constructor para crear un árbol vacío
    public ArbolBinario() {
        raiz = null;
        altura = 0;
        ramas = 0;
        hojas = 0;
    }

    // Métodos abstractos implementados en ArbolSimple
    @Override
    void insertar(int valor) {}

    @Override
    void eliminar(int valor) {}
}
