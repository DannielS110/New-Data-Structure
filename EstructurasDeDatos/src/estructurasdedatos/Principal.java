/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

public class Principal {

    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        System.out.println("Arbol simple");
        System.out.println("---------------------------------------");
        ArbolSimple arbol = new ArbolSimple();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        // Prueba de los recorridos
        System.out.println("Recorrido inorden del arbol simple:");
        arbol.recorrerInorden();

        System.out.println("\nRecorrido preorden del arbol simple:");
        arbol.recorrerPreorden();

        System.out.println("\nRecorrido postorden del arbol simple:");
        arbol.recorrerPostorden();
        System.out.println("");

        System.out.println("---------------------------------------");
        System.out.println("Arbol Rojo y Negro");
        System.out.println("---------------------------------------");
        ArbolRojoNegro arbolRN = new ArbolRojoNegro();

        // Insertamos nodos en el árbol Rojo y Negro
        arbolRN.insertar(50);
        arbolRN.insertar(30);
        arbolRN.insertar(20);
        arbolRN.insertar(40);
        arbolRN.insertar(70);
        arbolRN.insertar(60);
        arbolRN.insertar(80);

        // Mostramos los recorridos antes de la eliminación
        System.out.println("Recorrido inorden del arbol Rojo y Negro:");
        arbolRN.recorrerInorden();

        System.out.println("\nRecorrido preorden del arbol Rojo y Negro:");
        arbolRN.recorrerPreorden();

        System.out.println("\nRecorrido postorden del arbol Rojo y Negro:");
        arbolRN.recorrerPostorden();
        System.out.println("");

        // Eliminamos un nodo del árbol Rojo y Negro
        arbolRN.eliminar(20);

        // Mostramos los recorridos después de la eliminación
        System.out.println("\nRecorridos despues de eliminar el nodo con valor 20:");
        System.out.println("Recorrido inorden del arbol Rojo y Negro:");
        arbolRN.recorrerInorden();

        System.out.println("\nRecorrido preorden del arbol Rojo y Negro:");
        arbolRN.recorrerPreorden();

        System.out.println("\nRecorrido postorden del arbol Rojo y Negro:");
        arbolRN.recorrerPostorden();
        System.out.println("");

        System.out.println("---------------------------------------");
        System.out.println("Arbol AVL");
        System.out.println("---------------------------------------");
        ArbolAVL arbolAVL = new ArbolAVL();

        // Insertamos nodos en el árbol AVL
        arbolAVL.insertar(50);
        arbolAVL.insertar(30);
        arbolAVL.insertar(20);
        arbolAVL.insertar(40);
        arbolAVL.insertar(70);
        arbolAVL.insertar(60);
        arbolAVL.insertar(80);

        // Mostramos los recorridos antes de la eliminación
        System.out.println("Recorrido inorden del arbol AVL:");
        arbolAVL.recorrerInorden();

        System.out.println("\nRecorrido preorden del arbol AVL:");
        arbolAVL.recorrerPreorden();

        System.out.println("\nRecorrido postorden del arbol AVL:");
        arbolAVL.recorrerPostorden();
        System.out.println("");

        // Eliminamos un nodo del árbol AVL
        arbolAVL.eliminar(20);

        // Mostramos los recorridos después de la eliminación
        System.out.println("\nRecorridos despues de eliminar el nodo con valor 20:");
        System.out.println("Recorrido inorden del arbol AVL:");
        arbolAVL.recorrerInorden();

        System.out.println("\nRecorrido preorden del arbol AVL:");
        arbolAVL.recorrerPreorden();

        System.out.println("\nRecorrido postorden del arbol AVL:");
        arbolAVL.recorrerPostorden();
        System.out.println("");

        System.out.println("---------------------------------------");
        System.out.println("Lista Enlazada");
        System.out.println("---------------------------------------");

        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.insertar(50);
        listaEnlazada.insertar(30);
        listaEnlazada.insertar(20);
        listaEnlazada.insertar(40);
        listaEnlazada.insertar(70);
        listaEnlazada.insertar(60);
        listaEnlazada.insertar(80);

        // Recorrer la lista antes de ordenar
        System.out.println("Recorrido de la lista antes de ordenar:");
        listaEnlazada.recorrer();

        // Ordenar la lista
        listaEnlazada.ordenar();

        // Recorrer la lista después de ordenar
        System.out.println("Recorrido de la lista despues de ordenar:");
        listaEnlazada.recorrer();
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Lista Doblemente Enlazada");
        System.out.println("---------------------------------------");

        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
        listaDoblementeEnlazada.insertar(50);
        listaDoblementeEnlazada.insertar(30);
        listaDoblementeEnlazada.insertar(20);
        listaDoblementeEnlazada.insertar(40);
        listaDoblementeEnlazada.insertar(70);
        listaDoblementeEnlazada.insertar(60);
        listaDoblementeEnlazada.insertar(80);

        // Recorrer la lista antes de ordenar
        System.out.println("Recorrido de la lista antes de ordenar:");
        listaDoblementeEnlazada.recorrer();

        // Ordenar la lista
        listaDoblementeEnlazada.ordenar();

        // Recorrer la lista después de ordenar
        System.out.println("Recorrido de la lista despues de ordenar:");
        listaDoblementeEnlazada.recorrer();

        // Recorrer la lista en reversa
        System.out.println("Recorrido en reversa de la lista:");
        listaDoblementeEnlazada.recorrerReversa();
        System.out.println("");

        System.out.println("---------------------------------------");
        System.out.println("Lista Circular");
        System.out.println("---------------------------------------");

        ListaCircular listaCircular = new ListaCircular();
        listaCircular.insertar(50);
        listaCircular.insertar(30);
        listaCircular.insertar(20);
        listaCircular.insertar(40);
        listaCircular.insertar(70);
        listaCircular.insertar(60);
        listaCircular.insertar(80);

        // Recorrer la lista antes de ordenar
        System.out.println("Recorrido de la lista antes de ordenar:");
        listaCircular.recorrer();

        // Ordenar la lista
        listaCircular.ordenar();

        // Recorrer la lista después de ordenar
        System.out.println("Recorrido de la lista despues de ordenar:");
        listaCircular.recorrer();

        System.out.println("---------------------------------------");
        System.out.println("Lista Doblemente Circular");
        System.out.println("---------------------------------------");
        ListaDoblementeCircular listaDC = new ListaDoblementeCircular();

        listaDC.insertar(50);
        listaDC.insertar(30);
        listaDC.insertar(20);
        listaDC.insertar(40);
        listaDC.insertar(70);
        listaDC.insertar(60);
        listaDC.insertar(80);

        System.out.println("Recorrido normal:");
        listaDC.recorrer();

        System.out.println("Recorrido inverso:");
        listaDC.recorrerReversa();

        System.out.println("Ordenando la lista...");
        listaDC.ordenar();

        System.out.println("Recorrido normal despues de ordenar:");
        listaDC.recorrer();

        System.out.println("Recorrido inverso despues de ordenar:");
        listaDC.recorrerReversa();
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Grafo");
        System.out.println("---------------------------------------");
        Grafo grafo = new Grafo();

        // Insertar nodos
        grafo.insertar(1);
        grafo.insertar(2);
        grafo.insertar(3);
        grafo.insertar(4);

        // Conectar nodos
        grafo.conectar(1, 2);
        grafo.conectar(1, 3);
        grafo.conectar(2, 4);
        grafo.conectar(3, 4);

        // Mostrar conexiones
        System.out.println("Conexiones en el grafo:");
        grafo.mostrarConexiones();

        // Desconectar nodos
        grafo.desconectar(1, 3);

        // Mostrar conexiones después de desconectar
        System.out.println("Conexiones en el grafo despues de desconectar (1, 3):");
        grafo.mostrarConexiones();

        // Eliminar un nodo y sus conexiones
        grafo.eliminar(2);

        // Mostrar conexiones después de eliminar un nodo
        System.out.println("Conexiones en el grafo despues de eliminar el nodo 2:");
        grafo.mostrarConexiones();

        // Ejemplo de recorrido en profundidad
        System.out.println("Recorrido en profundidad desde el nodo 1:");
        grafo.recorrerEnProfundidad(1);
        System.out.println();
    }
}
