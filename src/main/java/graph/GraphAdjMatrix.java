package graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix extends Graph {

    private int[][] adjMatrix;

    public void implementAddEdge(int v, int w) {
        adjMatrix[v][w] = 1;
    }

    @Override
    public void implementAddVertex() {
        int vNum = getNumVertices();
        if (vNum >= adjMatrix.length) {
            int[][] newAdjMatrix = new int[vNum*2][vNum*2];
            for (int i = 0; i < adjMatrix.length; i++){
                for (int j = 0; j < adjMatrix.length; j++) {
                    newAdjMatrix[i][j] = adjMatrix[i][j];
                }
                //System.arraycopy(adjMatrix[i], 0, newAdjMatrix[i], 0, adjMatrix.length);
            }
            adjMatrix = newAdjMatrix;
        }
        for (int i = 0; i < adjMatrix[vNum].length; i++) {
            adjMatrix[vNum][i] = 0;
        }

    }

    @Override
    public List<Integer> getNeighbours(int v) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < getNumVertices(); i++) {
            if (adjMatrix[v][i] != 0) {
                result.add(i);
            }
        }
        return result;
    }
}
