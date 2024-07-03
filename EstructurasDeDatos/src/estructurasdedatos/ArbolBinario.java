package estructurasdedatos;

public class ArbolBinario extends EstructuraDato {
<<<<<<< HEAD
    int altura;
    NodosArbol raiz;
    int ramas;
    int hojas;
=======
    protected int altura;
    protected NodosArbol raiz;
    protected int ramas;
    protected int hojas;
>>>>>>> v2.0.0

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
