package com.carloseachaves.island;

public class Main {
	
	public static void main(String[] args) {
				
		final byte seaDefaultLevel = 0; 
		final byte seaHighLevel = 1;

		byte m1[][] = {
				{0, 0, 1, 0, 0},
				{0, 1, 2, 1, 0},
				{0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0}};
			
		/*byte m2[][] = {
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 1, 1, 2, 0, 0, 0, 0, 0},
				{0, 1, 2, 2, 1, 0, 0, 0, 0},
				{0, 0, 2, 3, 3, 1, 0, 0, 0},
				{0, 0, 0, 2, 3, 3, 1, 0, 0},
				{0, 0, 0, 1, 1, 1, 1, 0, 0},
				{0, 0, 1, 1, 2, 2, 1, 1, 1},
				{0, 0, 1, 2, 5, 3, 4, 1, 0},
				{0, 0, 1, 2, 2, 2, 1, 1, 0},
				{0, 1, 1, 3, 3, 1, 1, 0, 0},
				{0, 1, 2, 3, 3, 3, 0, 0, 0},
				{0, 0, 1, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 5, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0}};*/ 
				
		Island island = new Island(m1);
		System.out.println("Output #1: " +island.getArea(seaDefaultLevel));
		System.out.println("Output #2: " +island.getPerimeter(seaDefaultLevel));
		System.out.println("Output #3: " +island.getNumberOfIslands(seaHighLevel));

	}

}
