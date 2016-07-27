package graph;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class GraphAdjMatrix extends Graph {

    private int[][] adjMatrix;
    private int V;
    private int E;

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

    // return list of neighbors of v
    public Iterable<Integer> getNeighborsIterable(int v) {
        return new AdjIterator(v);
    }

    private class AdjIterator implements Iterator<Integer>, Iterable<Integer> {
        private int v;
        private int w = 0;

        AdjIterator(int v) {
            this.v = v;
        }

        public Iterator<Integer> iterator() {
            return this;
        }

        public boolean hasNext() {
            while (w < V) {
                if (adjMatrix[v][w] == 1) return true;
                w++;
            }
            return false;
        }

        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return w++;
        }

        public void remove()  {
            throw new UnsupportedOperationException();
        }
    }
}
