package com.edu.devexps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Graph<T> {
	private ArrayList<Node<T>> nodeList;
	
	public void addNodeToGraph(Node<T> n) {
		nodeList.add(n);
	}
	
	/***
	 * Initialize the graph class, instantiate the list of nodes
	 */

	public Graph() {
		super();
		nodeList = new ArrayList<Node<T>>();
	}

	/**
	 * Add the n Node to the list at index listIndex
	 * @param listIndex
	 * @param n
	 */
	
	public void addEdge(Node<T> fromNode, Node<T> toNode) {
		nodeList.get(nodeList.indexOf(fromNode)).getAdjList().add(toNode);
	}
	
	/***
	 * Adds a node adjacent to another (from -> to) and also adds the edge
	 * to the graph
	 * @param fromNode
	 * @param toNode
	 * @param weight
	 */
	public void addEdgeWithWeight(Node<T> fromNode, Node<T> toNode, Integer weight) {
		//keep using this list for adjacency only, it might be useful
		nodeList.get(nodeList.indexOf(fromNode)).getAdjList().add(toNode);
		nodeList.get(nodeList.indexOf(fromNode)).getEdgeList().add(new Edge<T>(fromNode, toNode, weight));
	}

	/**
	 * perform the Depth First Search, this method will initialize the visited
	 * array and then call the recursive method that will actually perform the
	 * DFS this may not be of a lot of use, but by doing this we do not need to
	 * have a visited array as a part of the class
	 * 
	 * @param start
	 */

	public void DFS(Node<T> start) {
		Set<Node<T>> visitedSet = new HashSet<Node<T>>();
		System.out.println("Starting DFS from -> " + start.toString());
		DFSUtil(start, visitedSet);
	}

	/**
	 * This method does the trick. It will receive a vertex, and show it, mark
	 * the node as visited, then it will take the adjacency list of the given
	 * node check the nodes on the list and if any of these nodes was not
	 * already visited it will call itself again with that node as parameter,
	 * the visited list is maintained and passed through successive calls
	 * 
	 * @param vertex
	 * @param visited
	 */
	public void DFSUtil(Node<T> vertex, Set<Node<T>> visitedSet) {
		System.out.println("Visited: " + vertex.toString());
		visitedSet.add(vertex);
		for (Node<T> n : vertex.getAdjList()) {
			if (!visitedSet.contains(n)) {
				DFSUtil(n, visitedSet);
			}
		}
	}

	/**
	 * Performs a Breadth first search, this method will check the neighbors first
	 * @param start
	 */
	public void BFS(Node<T> start) {
		Set<Node<T>> visitedSet = new HashSet<Node<T>>();
		
		Queue<Node<T>> nodeQueue = new LinkedList<Node<T>>();
		
		nodeQueue.add(start); //start from here, ant take it's adj list
		while(!nodeQueue.isEmpty()) {
			visitedSet.add(nodeQueue.peek());
			//Save a reference to the list, because we will use it later
			LinkedList<Node<T>> adjListOfNode = nodeQueue.peek().getAdjList();
			
			//Show it and also poll it from the queue
			System.out.println("Visited: " + nodeQueue.poll());
			
			for (Node<T> n : adjListOfNode) {
				if (!visitedSet.contains(n) && !nodeQueue.contains(n)) {
					nodeQueue.add(n);
				}
			}
		}
	}
	
	public void DFSWithWeight(Node<T> start) {
		Set<Node<T>> visitedSet = new HashSet<Node<T>>();
		System.out.println("Starting DFS from -> " + start.toString());
		DFSUtilWithWeight(start, visitedSet, start.getEdgeList(), 0);
	}
	
	public void DFSUtilWithWeight(Node<T> vertex, Set<Node<T>> visitedSet, ArrayList<Edge<T>> edgeList, Integer weightAcum) {
		System.out.println("Visited: " + vertex.toString() + "Current weight acumulated: " + weightAcum);
		visitedSet.add(vertex);
		for (Edge<T> e : vertex.getEdgeList()) {
			if (!visitedSet.contains(e.getToNode())) {
				Integer weightLocal = e.getWeight() + weightAcum;
				System.out.println("Using edge from " + e.getFromNode() + " to " + e.getToNode());
				DFSUtilWithWeight(e.getToNode(), visitedSet, vertex.getEdgeList(),weightLocal);
			}
		}
	}
}
