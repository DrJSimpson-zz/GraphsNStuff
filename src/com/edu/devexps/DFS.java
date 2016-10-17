package com.edu.devexps;

/**
 * Main class, it will call the magic method
 * @author Guido
 *
 */

public class DFS {

	public static void main(String[] args) {

		Graph g = new Graph(4); // the graph will have 5 nodes

		Node node0 = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		g.addEdge(0, node1);
	    g.addEdge(0, node2);
	    g.addEdge(1, node3);
	    g.addEdge(2, node0);
	    g.addEdge(2, node3);
	    g.addEdge(3, node3);
	    
	    g.DFS(2);
	}

}
