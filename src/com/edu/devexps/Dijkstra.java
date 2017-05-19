package com.edu.devexps;

import com.edu.devexps.tads.Graph;
import com.edu.devexps.tads.Node;

public class Dijkstra {

	public static void main(String[] args) {
		dijkstra2();
	}
	
	public static void dijkstra1() {
		Graph<String> g = new Graph<String>();

		Node<String> nodeA = new Node<String>("A");
		Node<String> nodeB = new Node<String>("B");
		Node<String> nodeC = new Node<String>("C");
		Node<String> nodeD = new Node<String>("D");

		g.addNodeToGraph(nodeA);
		g.addNodeToGraph(nodeB);
		g.addNodeToGraph(nodeC);
		g.addNodeToGraph(nodeD);

		g.addEdgeWithWeight(nodeA, nodeB, 15);
		g.addEdgeWithWeight(nodeA, nodeC, 20);
		g.addEdgeWithWeight(nodeB, nodeD, 25);
		g.addEdgeWithWeight(nodeC, nodeD, 5);

		g.dijkstra(nodeA);
	}

	public static void dijkstra2() {
		Graph<String> g = new Graph<String>();

		Node<String> nodeA = new Node<String>("A");
		Node<String> nodeB = new Node<String>("B");
		Node<String> nodeC = new Node<String>("C");
		Node<String> nodeD = new Node<String>("D");
		Node<String> nodeE = new Node<String>("E");
		Node<String> nodeF = new Node<String>("F");
		Node<String> nodeG = new Node<String>("G");
		
		g.addNodeToGraph(nodeA);
		g.addNodeToGraph(nodeB);
		g.addNodeToGraph(nodeC);
		g.addNodeToGraph(nodeD);
		g.addNodeToGraph(nodeE);
		g.addNodeToGraph(nodeF);
		g.addNodeToGraph(nodeG);
		
		g.addEdgeWithWeight(nodeA, nodeB, 10);
		g.addEdgeWithWeight(nodeA, nodeC, 5);
		g.addEdgeWithWeight(nodeB, nodeE, 8);
		g.addEdgeWithWeight(nodeB, nodeD, 1);
		g.addEdgeWithWeight(nodeC, nodeD, 4);
		g.addEdgeWithWeight(nodeC, nodeF, 3);
		g.addEdgeWithWeight(nodeD, nodeE, 6);
		g.addEdgeWithWeight(nodeD, nodeF, 6);
		g.addEdgeWithWeight(nodeE, nodeG, 2);
		g.addEdgeWithWeight(nodeF, nodeG, 7);
		
		g.dijkstra(nodeA);
	}
}
