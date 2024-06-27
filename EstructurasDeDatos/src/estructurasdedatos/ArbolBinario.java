/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

    int altura;
    NodosArbol raiz;
    int ramas;
    int hojas;

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
