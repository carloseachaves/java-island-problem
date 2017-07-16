package com.carloseachaves.island;

public class Island {

	private byte matrix[][];

	public Island(byte[][] matrix) {
		super();
		this.matrix = matrix;
	}

	/**
	 * This method returns the island perimeter.
	 * @param seaLevel
	 * @return the island perimeter
	 */
	public short getPerimeter(int seaLevel) {
		
		short perimeter = 0;

		if (this.matrix != null) {

			int y = this.matrix.length;
			int x = this.matrix[0].length;

			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {
					if (this.matrix[i][j] > seaLevel) {

						// Lower Element
						if (i + 1 >= y || this.matrix[i+1][j] == seaLevel)
							perimeter++;

						// Upper element
						if (i - 1 < 0 || this.matrix[i-1][j] == seaLevel)
							perimeter++;

						// Right element
						if (j + 1 >= x || this.matrix[i][j+1] == seaLevel)
							perimeter++;

						// Left element
						if (j - 1 < 0 || this.matrix[i][j-1] == seaLevel)
							perimeter++;
					}
				}
			}
		}

		return perimeter;
	}

	/**
	 * This method returns the island area.
	 * @param seaLevel
	 * @return the island area
	 */
	public short getArea(int seaLevel) {

		short area = 0;

		if (this.matrix != null) {
			for (int y = 0; y < this.matrix.length; y++) {
				for (int x = 0; x < this.matrix[y].length; x++) {
					if (this.matrix[y][x] > seaLevel) {
						area++;
					}
				}
			}
		}

		return area;
	}

	/**
	 * This method returns the numer of islands.
	 * @param seaLevel
	 * @return the island number
	 */
	public int getNumberOfIslands(byte seaLevel){
		
		int numIslands = 0;
		
		if(this.matrix == null || this.matrix.length == 0)
            return numIslands;
        
        for(int y = 0; y < this.matrix.length; y++)
            for(int x = 0; x < this.matrix[0].length; x++)
                if(this.matrix[y][x] > seaLevel) {
                	checkNeighbor(this.matrix, y, x, seaLevel);
                    numIslands++;
                }
            
        return numIslands;
	}
		
	
	/**
	 * This method is recursive and check the four neighbor (right, left, up, down) of the element
	 * @param matrix
	 * @param y
	 * @param x
	 * @param seaLevel
	 */
	private void checkNeighbor(byte[][] matrix, int y, int x, byte seaLevel) {
        
		if(y > matrix.length - 1 || x > matrix[0].length - 1 || x < 0 || y < 0 || matrix[y][x] <= seaLevel)
            return;
        
		//Set this element to sea level to avoid repeat count.
		matrix[y][x] = seaLevel;
        
		// Lower Element
        checkNeighbor(matrix, y-1, x, seaLevel);
        
        // Left element
        checkNeighbor(matrix, y, x-1, seaLevel);
        
        // Upper element
        checkNeighbor(matrix, y+1, x, seaLevel);
        
        // Right element
        checkNeighbor(matrix, y, x+1, seaLevel);
    }
	
}
