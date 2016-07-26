package graph;

import java.util.List;

/**
 * Created by artem on 25.07.16.
 */
public abstract class Graph {

    private int numVertices;
    private int numEdges;

    public Graph() {
        numVertices = 0;
        numEdges = 0;
    }

    public int getNumEdges() {
        return numEdges;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void addVerex() {
        implementAddVertex();
        numVertices ++;
    }

    public abstract void implementAddVertex();

    public abstract List<Integer> getNeighbours(int v);


}
