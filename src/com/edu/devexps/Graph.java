package com.edu.devexps;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	private List<List<Node>> adjList;

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
		adjList = new ArrayList<List<Node>>();

		for (int i = 0; i < size; i++) {
			adjList.add(new ArrayList<Node>());

		}
	}

	public List<List<Node>> getAdjList() {
		return adjList;
	}

	public void setAdjList(List<List<Node>> adjList) {
		this.adjList = adjList;
	}

	/**
	 * Add the n Node to the list at index listIndex
	 * @param listIndex
	 * @param n
	 */
	
	public void addEdge(int listIndex, Node n) {
		adjList.get(listIndex).add(n);
	}

	/**
	 * perform the Depth First Search, this method will initialize the visited
	 * array and then call the recursive method that will actually perform the
	 * DFS this may not be of a lot of use, but by doing this we do not need to
	 * have a visited array as a part of the class
	 * 
	 * @param start
	 */

	public void DFS(int start) {
		boolean[] visited = new boolean[adjList.size()];
		System.out.println("Starting DFS from -> " + start);
		DFSUtil(start, visited);
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
	public void DFSUtil(int vertex, boolean[] visited) {
		visited[vertex] = true;
		System.out.println("Visited: " + vertex);
		for (Node n : this.getAdjList().get(vertex)) {
			if (visited[n.getValue()] == false) {
				DFSUtil(n.getValue(), visited);
			}
		}
	}

}
