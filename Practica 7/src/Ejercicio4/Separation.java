package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

import Ejercicio4.GraphAdjList.Arc;

/**
 * Se tiene un grafo en donde los nodos representan personas y existe un eje
 * entre dos nodos si ambas personas son amigos. Implementar un algoritmo que
 * determine si en dicho grafo se cumple la teor�a de los seis grados de
 * separaci�n, que sostiene que dos personas est�n conectadas a trav�s de una
 * cadena de conocidos que no tiene m�s de 5 intermediarios.
 * 
 * @author matdomin
 * 
 */

public class Separation<V> {

	public void isSeparated()
	
	
	
	
	private class Node {
		public V info;
		public boolean visited;
		public List<Node> adj;

		public Node(V info) {
			this.info = info;
			this.visited = false;
			this.adj = new ArrayList<Node>();
		}
	}
}
