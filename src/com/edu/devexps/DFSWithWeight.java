package com.edu.devexps;

/**
 * Main class, it will call the magic method
 * @author Guido
 *
 */

public class DFSWithWeight {

	public static void main(String[] args) {

		Graph<String> g = new Graph<String>();
		
		Node<String> node0 = new Node<String>("A");
		Node<String> node1 = new Node<String>("B");
		Node<String> node2 = new Node<String>("C");
		Node<String> node3 = new Node<String>("D");
		
		g.addNodeToGraph(node0);
		g.addNodeToGraph(node1);
		g.addNodeToGraph(node2);
		g.addNodeToGraph(node3);
		
	    g.addEdgeWithWeight(node0, node1, 15);
	    g.addEdgeWithWeight(node0, node2, 20);
	    g.addEdgeWithWeight(node1, node3, 25);
	    g.addEdgeWithWeight(node2, node0, 10);
	    g.addEdgeWithWeight(node2, node3, 5);
	    
	    g.DFSWithWeight(node0);
	}

}
