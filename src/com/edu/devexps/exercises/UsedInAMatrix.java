package com.edu.devexps.exercises;

import com.edu.devexps.tads.Pair;

public class UsedInAMatrix {

	public static void main(String[] args) {
		int[][] array = {
							{0, 0, 0, 0, 0},
							{0, -1, 1, -1, 0},
							{0, 1, 0, 1, 0},
							{0, 1, 0, 1, 0},
							{0, -1, 1, -1, 0},
							{0, 0, 0, 0, 0}
						};
		int limit = array[0].length;
		for (int i = 0; i < limit; i++) {
			for(int j = 0; j < limit; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
						
		Pair<Integer, Integer> startPos = new Pair<Integer, Integer>();
//		startPos.xValue = 2;
//		startPos.yValue = 2;
		
		
	}

}
