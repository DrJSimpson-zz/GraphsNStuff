package com.edu.devexps.tads;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Generic node class It's composed by the T value and a list of adjacency
 * 
 * @author Guido
 *
 */

public class Node<T> {
	private T value;
	private LinkedList<Node<T>> adjList;
	private ArrayList<Edge<T>> edgeList;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public LinkedList<Node<T>> getAdjList() {
		return adjList;
	}

	public void setAdjList(LinkedList<Node<T>> adjList) {
		this.adjList = adjList;
	}

	public Node(T value, LinkedList<Node<T>> adjList) {
		super();
		this.value = value;
		this.adjList = adjList;
	}

	public Node(T value) {
		super();
		this.value = value;
		this.adjList = new LinkedList<Node<T>>();
		this.edgeList = new ArrayList<Edge<T>>();
	}

	public ArrayList<Edge<T>> getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(ArrayList<Edge<T>> edgeList) {
		this.edgeList = edgeList;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}
}
