package com.edu.devexps;

import com.edu.devexps.tads.Graph;

public class GraphMatrix<T> {
	T[][] matrix;
	Integer xUpperBound;
	Integer yUpperBound;
	
	Graph<PairForMatrix> connections;

	public GraphMatrix(Integer xUpperBound, Integer yUpperBound, Graph<PairForMatrix> connections) {
		super();
		//this.matrix = new T[xUpperBound][yUpperBound];
		this.xUpperBound = xUpperBound;
		this.yUpperBound = yUpperBound;
		this.connections = connections;
	}
	
	
}
