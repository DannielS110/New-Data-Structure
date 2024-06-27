/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdedatos;

import java.util.*;

public class Grafo extends EstructuraDato {
    private Map<Integer, List<Integer>> adyacencias;

    public Grafo() {
        adyacencias = new HashMap<>();
    }

    @Override
    void insertar(int nodo) {
        if (!adyacencias.containsKey(nodo)) {
            adyacencias.put(nodo, new ArrayList<>());
        }
    }

    @Override
    void eliminar(int nodo) {
        adyacencias.remove(nodo);
        // Eliminar todas las conexiones hacia y desde este nodo
        for (List<Integer> lista : adyacencias.values()) {
            lista.remove(Integer.valueOf(nodo));
        }
    }

    public void conectar(int nodoOrigen, int nodoDestino) {
        if (!adyacencias.containsKey(nodoOrigen)) {
            insertar(nodoOrigen);
        }
        if (!adyacencias.containsKey(nodoDestino)) {
            insertar(nodoDestino);
        }
        adyacencias.get(nodoOrigen).add(nodoDestino);
        adyacencias.get(nodoDestino).add(nodoOrigen);
    }

    public void desconectar(int nodoOrigen, int nodoDestino) {
        if (adyacencias.containsKey(nodoOrigen) && adyacencias.containsKey(nodoDestino)) {
            adyacencias.get(nodoOrigen).remove(Integer.valueOf(nodoDestino));
            adyacencias.get(nodoDestino).remove(Integer.valueOf(nodoOrigen));
        }
    }

    public void mostrarConexiones() {
        for (int nodo : adyacencias.keySet()) {
            System.out.print("Nodo " + nodo + " esta conectado con: ");
            for (int vecino : adyacencias.get(nodo)) {
                System.out.print(vecino + " ");
            }
            System.out.println();
        }
    }

    public void recorrerEnProfundidad(int nodoInicial) {
        Set<Integer> visitados = new HashSet<>();
        dfs(nodoInicial, visitados);
    }

    private void dfs(int nodo, Set<Integer> visitados) {
        visitados.add(nodo);
        System.out.print(nodo + " ");

        for (int vecino : adyacencias.get(nodo)) {
            if (!visitados.contains(vecino)) {
                dfs(vecino, visitados);
            }
        }
    }
}
