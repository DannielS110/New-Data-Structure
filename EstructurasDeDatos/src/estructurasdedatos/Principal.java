package estructurasdedatos;

import java.util.Scanner;
import javax.swing.JFrame;

//public class Principal {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("---------------------------------------");
//        System.out.println("Arbol simple");
//        System.out.println("---------------------------------------");
//        ArbolSimple arbol = new ArbolSimple();
//        System.out.println("Ingrese los valores para el Arbol Simple (separados por espacios):");
//        String[] valoresArbolSimple = scanner.nextLine().split(" ");
//        for (String valor : valoresArbolSimple) {
//            arbol.insertar(Integer.parseInt(valor));
//        }
//
//        System.out.println("Recorrido inorden del arbol simple:");
//        arbol.recorrerInorden();
//        System.out.println("\nRecorrido preorden del arbol simple:");
//        arbol.recorrerPreorden();
//        System.out.println("\nRecorrido postorden del arbol simple:");
//        arbol.recorrerPostorden();
//        System.out.println("");
//
//        System.out.println("---------------------------------------");
//        System.out.println("Arbol Rojo y Negro");
//        System.out.println("---------------------------------------");
//        ArbolRojoNegro arbolRN = new ArbolRojoNegro();
//        System.out.println("Ingrese los valores para el Arbol Rojo y Negro (separados por espacios):");
//        String[] valoresArbolRN = scanner.nextLine().split(" ");
//        for (String valor : valoresArbolRN) {
//            arbolRN.insertar(Integer.parseInt(valor));
//        }
//
//        System.out.println("Recorrido inorden del arbol Rojo y Negro:");
//        arbolRN.recorrerInorden();
//        System.out.println("\nRecorrido preorden del arbol Rojo y Negro:");
//        arbolRN.recorrerPreorden();
//        System.out.println("\nRecorrido postorden del arbol Rojo y Negro:");
//        arbolRN.recorrerPostorden();
//        System.out.println("");
//
//        System.out.println("Ingrese un valor para eliminar del Arbol Rojo y Negro:");
//        int valorEliminarRN = scanner.nextInt();
//        scanner.nextLine();  // Consume newline
//        arbolRN.eliminar(valorEliminarRN);
//
//        System.out.println("Recorridos despues de eliminar el nodo con valor " + valorEliminarRN + ":");
//        System.out.println("Recorrido inorden del arbol Rojo y Negro:");
//        arbolRN.recorrerInorden();
//        System.out.println("\nRecorrido preorden del arbol Rojo y Negro:");
//        arbolRN.recorrerPreorden();
//        System.out.println("\nRecorrido postorden del arbol Rojo y Negro:");
//        arbolRN.recorrerPostorden();
//        System.out.println("");
//
//        System.out.println("---------------------------------------");
//        System.out.println("Arbol AVL");
//        System.out.println("---------------------------------------");
//        ArbolAVL arbolAVL = new ArbolAVL();
//        System.out.println("Ingrese los valores para el Arbol AVL (separados por espacios):");
//        String[] valoresArbolAVL = scanner.nextLine().split(" ");
//        for (String valor : valoresArbolAVL) {
//            arbolAVL.insertar(Integer.parseInt(valor));
//        }
//
//        System.out.println("Recorrido inorden del arbol AVL:");
//        arbolAVL.recorrerInorden();
//        System.out.println("\nRecorrido preorden del arbol AVL:");
//        arbolAVL.recorrerPreorden();
//        System.out.println("\nRecorrido postorden del arbol AVL:");
//        arbolAVL.recorrerPostorden();
//        System.out.println("");
//
//        System.out.println("Ingrese un valor para eliminar del Arbol AVL:");
//        int valorEliminarAVL = scanner.nextInt();
//        scanner.nextLine();  // Consume newline
//        arbolAVL.eliminar(valorEliminarAVL);
//
//        System.out.println("Recorridos despues de eliminar el nodo con valor " + valorEliminarAVL + ":");
//        System.out.println("Recorrido inorden del arbol AVL:");
//        arbolAVL.recorrerInorden();
//        System.out.println("\nRecorrido preorden del arbol AVL:");
//        arbolAVL.recorrerPreorden();
//        System.out.println("\nRecorrido postorden del arbol AVL:");
//        arbolAVL.recorrerPostorden();
//        System.out.println("");
//
//        System.out.println("---------------------------------------");
//        System.out.println("Lista Enlazada");
//        System.out.println("---------------------------------------");
//        ListaEnlazada listaEnlazada = new ListaEnlazada();
//        System.out.println("Ingrese los valores para la Lista Enlazada (separados por espacios):");
//        String[] valoresListaEnlazada = scanner.nextLine().split(" ");
//        for (String valor : valoresListaEnlazada) {
//            listaEnlazada.insertar(Integer.parseInt(valor));
//        }
//
//        System.out.println("Recorrido de la lista antes de ordenar:");
//        listaEnlazada.recorrer();
//        listaEnlazada.ordenar();
//        System.out.println("Recorrido de la lista despues de ordenar:");
//        listaEnlazada.recorrer();
//        System.out.println("");
//
//        System.out.println("---------------------------------------");
//        System.out.println("Lista Doblemente Enlazada");
//        System.out.println("---------------------------------------");
//        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
//        System.out.println("Ingrese los valores para la Lista Doblemente Enlazada (separados por espacios):");
//        String[] valoresListaDE = scanner.nextLine().split(" ");
//        for (String valor : valoresListaDE) {
//            listaDoblementeEnlazada.insertar(Integer.parseInt(valor));
//        }
//
//        System.out.println("Recorrido de la lista antes de ordenar:");
//        listaDoblementeEnlazada.recorrer();
//        listaDoblementeEnlazada.ordenar();
//        System.out.println("Recorrido de la lista despues de ordenar:");
//        listaDoblementeEnlazada.recorrer();
//        System.out.println("Recorrido en reversa de la lista:");
//        listaDoblementeEnlazada.recorrerReversa();
//        System.out.println("");
//
//        System.out.println("---------------------------------------");
//        System.out.println("Lista Circular");
//        System.out.println("---------------------------------------");
//        ListaCircular listaCircular = new ListaCircular();
//        System.out.println("Ingrese los valores para la Lista Circular (separados por espacios):");
//        String[] valoresListaCircular = scanner.nextLine().split(" ");
//        for (String valor : valoresListaCircular) {
//            listaCircular.insertar(Integer.parseInt(valor));
//        }
//
//        System.out.println("Recorrido de la lista antes de ordenar:");
//        listaCircular.recorrer();
//        listaCircular.ordenar();
//        System.out.println("Recorrido de la lista despues de ordenar:");
//        listaCircular.recorrer();
//        System.out.println("");
//
//        System.out.println("---------------------------------------");
//        System.out.println("Lista Doblemente Circular");
//        System.out.println("---------------------------------------");
//        ListaDoblementeCircular listaDC = new ListaDoblementeCircular();
//        System.out.println("Ingrese los valores para la Lista Doblemente Circular (separados por espacios):");
//        String[] valoresListaDC = scanner.nextLine().split(" ");
//        for (String valor : valoresListaDC) {
//            listaDC.insertar(Integer.parseInt(valor));
//        }
//
//        System.out.println("Recorrido normal:");
//        listaDC.recorrer();
//        System.out.println("Recorrido inverso:");
//        listaDC.recorrerReversa();
//        listaDC.ordenar();
//        System.out.println("Recorrido normal despues de ordenar:");
//        listaDC.recorrer();
//        System.out.println("Recorrido inverso despues de ordenar:");
//        listaDC.recorrerReversa();
//        System.out.println("");
//
//        System.out.println("---------------------------------------");
//        System.out.println("Grafo");
//        System.out.println("---------------------------------------");
//        Grafo grafo = new Grafo();
//
//        System.out.println("Ingrese los nodos para el grafo (separados por espacios):");
//        String[] nodosGrafo = scanner.nextLine().split(" ");
//        for (String nodo : nodosGrafo) {
//            grafo.insertar(Integer.parseInt(nodo));
//        }
//
//        System.out.println("Ingrese las conexiones para el grafo en el formato 'nodo1 nodo2' (una por linea, ingrese 'fin' para terminar):");
//        while (true) {
//            String linea = scanner.nextLine();
//            if (linea.equalsIgnoreCase("fin")) {
//                break;
//            }
//            String[] conexion = linea.split(" ");
//            int nodoOrigen = Integer.parseInt(conexion[0]);
//            int nodoDestino = Integer.parseInt(conexion[1]);
//            grafo.conectar(nodoOrigen, nodoDestino);
//        }
//
//        System.out.println("Conexiones en el grafo:");
//        grafo.mostrarConexiones();
//
//        System.out.println("Ingrese el nodo origen y destino a desconectar en el formato 'nodo1 nodo2':");
//        String[] desconexion = scanner.nextLine().split(" ");
//        int nodoOrigen = Integer.parseInt(desconexion[0]);
//        int nodoDestino = Integer.parseInt(desconexion[1]);
//        grafo.desconectar(nodoOrigen, nodoDestino);
//
//        System.out.println("Conexiones en el grafo despues de desconectar (" + nodoOrigen + ", " + nodoDestino + "):");
//        grafo.mostrarConexiones();
//
//        System.out.println("Ingrese el nodo a eliminar:");
//        int nodoEliminar = scanner.nextInt();
//        scanner.nextLine();  // Consume newline
//        grafo.eliminar(nodoEliminar);
//
//        System.out.println("Conexiones en el grafo despues de eliminar el nodo " + nodoEliminar + ":");
//        grafo.mostrarConexiones();
//
//        System.out.println("Ingrese el nodo inicial para el recorrido en profundidad:");
//        int nodoInicial = scanner.nextInt();
//        System.out.println("Recorrido en profundidad desde el nodo " + nodoInicial + ":");
//        grafo.recorrerEnProfundidad(nodoInicial);
//        System.out.println();
//
//        scanner.close();
//        VistaPrincipal vp = new VistaPrincipal();
//        vp.setVisible(true);
//
//    }
//
//}
public class Principal {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Estructuras de Datos");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new VistaPrincipal());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
                frame.setVisible(true);
            }
        });
    }
}