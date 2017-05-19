package com.edu.devexps.tads;

/**
 * Edge class, it's composed by the edge and its weight
 * 
 * @author Guido
 *
 */

public class Edge<T> implements Comparable<Edge<T>> {
	private Node<T> fromNode;
	private Node<T> toNode;
	private Integer weight;

	public Node<T> getFromNode() {
		return fromNode;
	}

	public void setFromNode(Node<T> fromNode) {
		this.fromNode = fromNode;
	}

	public Node<T> getToNode() {
		return toNode;
	}

	public void setToNode(Node<T> toNode) {
		this.toNode = toNode;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return this.fromNode + " " + this.toNode + " " + this.weight;
	}

	@Override
	public int compareTo(Edge<T> o) {
		return this.weight.compareTo(o.weight);
	}

	public Edge(Node<T> fromNode, Node<T> toNode, Integer weight) {
		super();
		this.fromNode = fromNode;
		this.toNode = toNode;
		this.weight = weight;
	}
}
