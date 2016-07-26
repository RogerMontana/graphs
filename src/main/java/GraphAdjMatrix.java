import graph.Graph;

import java.util.List;

/**
 * Created by artem on 25.07.16.
 */
public class GraphAdjMatrix extends Graph {

    private int[][] adjMatrix;

    public void implementAddEdge(int vertexV, int vertexW) {
        adjMatrix[vertexV][vertexW] = 1;
    }

    @Override
    public void implementAddVertex() {

    }

    @Override
    public List<Integer> getNeighbours(int v) {
        return null;
    }
}
