
package ---;

public class Terrain {
    
    private final double[][] heights;
    private final int rows;
    private final int cols;

    public Terrain(double[][] heights) 
    {
        this.heights = heights;
        this.rows = heights.length;
        this.cols = heights[0].length;
    }

    public void printFloodMap(double waterLevel) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (heights[i][j] <= waterLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
