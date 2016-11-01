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
	
	/**
	 * Initialize the graph class, first, instance the "list list" and later
	 * iterate initializing every sublist. The sublist are the adjacency list of
	 * each node.
	 * 
	 * @param size
	 *            the amount of nodes that will be represented
	 */

	public Graph(int size) {
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
	
}
