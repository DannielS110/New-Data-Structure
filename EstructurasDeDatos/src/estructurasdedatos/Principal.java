/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

/**
 *
 * @author juanc
 */
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
    }
}
