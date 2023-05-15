
package ---;

import java.util.Random;

public class TerrainSimulator {
    public static void main(String[] args) {

        double[][] heights = generateRandomHeights(10, 10);
        Terrain terrain = new Terrain(heights);
        
        double min = findMin(heights);
        double max = findMax(heights);
        double stepSize = (max - min) / 10.0;

        for (double waterLevel = min; waterLevel <= max; waterLevel += stepSize) 
        {
            System.out.println("Water level: " + waterLevel);
            terrain.printFloodMap(waterLevel);
            System.out.println();
        }
    }

    private static double[][] generateRandomHeights(int rows, int cols) 
    {
        double[][] heights = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                heights[i][j] = rand.nextDouble() * 100.0;
            }
        }
        return heights;
    }

    private static double findMin(double[][] arr) 
    {
        double min = arr[0][0];

        for (double[] row : arr) {
            for (double val : row) {
                if (val < min) {
                    min = val;
                }
            }
        }
        return min;
    }

    private static double findMax(double[][] arr) 
    {
        double max = arr[0][0];
        for (double[] row : arr) {
            for (double val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }
}
